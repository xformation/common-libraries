/**
 * 
 */
package com.synectiks.commons.receiver;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.synectiks.commons.constants.IConsts;
import com.synectiks.commons.entities.search.ESEvent;
import com.synectiks.commons.exceptions.SynectiksException;
import com.synectiks.commons.utils.IUtils;

/**
 * @author Rajesh
 */
@Component
public class ESEventReceiver {

	private static final Logger logger = LoggerFactory.getLogger(ESEventReceiver.class);

	/**
	 * A boolean flag to make sure if we have sub class we must not handle
	 * events here
	 */
	protected static boolean handleEvents = true;

	@Autowired
	private Environment env;
	@Autowired
	private RestTemplate rest;

	private String searchEventFireUrl;

	@EventListener(condition = "#event.isSaveOrUpdate(#event.eventType)")
	public final void onSaveUpadate(ESEvent event) {
		try {
			// index the entity
			String res = handleEvent(event);
			logger.info("consume create event result: " + res);
		} catch (Throwable th) {
			logger.error(th.getMessage(), th);
		}
	}

	@EventListener(condition = "#event.isDelete(#event.eventType)")
	public final void onDelete(ESEvent event) {
		try {
			// index the entity
			String res = handleEvent(event);
			logger.info("consume delete event result: " + res);
		} catch (Throwable th) {
			logger.error(th.getMessage(), th);
		}
	}

	/**
	 * Method to index an entity sent by fired event.
	 * @param event
	 * @return
	 * @throws Exception
	 */
	public String handleEvent(ESEvent event) throws SynectiksException {
		if (handleEvents) {
			String res = sendAPIRequest(event);
			return res;
		}
		return null;
	}

	private String getFireEventUrl() {
		if (IUtils.isNullOrEmpty(searchEventFireUrl)) {
			searchEventFireUrl = env.getProperty(IConsts.KEY_INDX_EVENT_FIRE, "");
			if (IUtils.isNullOrEmpty(searchEventFireUrl)) {
				searchEventFireUrl = IConsts.URL_INDX_EVENT_FIRE;
			}
		}
		return searchEventFireUrl;
	}

	/**
	 * Internal method to call search api for handing indexing operation
	 * @param event
	 * @return
	 * @throws Exception
	 */
	private String sendAPIRequest(ESEvent event) throws SynectiksException {
		String url = getFireEventUrl();
		String res = null;
		String cls = (event.getEntity() != null ? event.getEntity().getClass().getName()
				: "");
		logger.info("Entity class: " + cls);
		Map<String, Object> params = IUtils.getRestParamMap(IConsts.PRM_EV_TYPE,
				event.getEventType().name(), IConsts.PRM_CLASS, cls, IConsts.PRM_ENTITY,
				IUtils.getStringFromValue(event.getEntity()));
		logger.info("Request: " + params);
		res = IUtils.sendPostRestRequest(rest, url, null, String.class, params,
				MediaType.APPLICATION_FORM_URLENCODED);
		logger.info("Indexing response: " + res);
		return res;
	}
}
