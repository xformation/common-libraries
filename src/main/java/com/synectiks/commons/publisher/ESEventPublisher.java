/**
 * 
 */
package com.synectiks.commons.publisher;

import static org.junit.Assert.assertNotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import com.synectiks.commons.entities.search.ESEvent;
import com.synectiks.commons.entities.search.ESEvent.EventType;
import com.synectiks.commons.interfaces.IESEntity;
import com.synectiks.commons.utils.IUtils;

/**
 * @author Rajesh
 */
@Component
public class ESEventPublisher implements ApplicationEventPublisherAware {

	private static final Logger logger = LoggerFactory.getLogger(ESEventPublisher.class);

	private ApplicationEventPublisher publisher;

	public ESEventPublisher() {
	}

	@Override
	public void setApplicationEventPublisher(
			ApplicationEventPublisher applicationEventPublisher) {
		this.publisher = applicationEventPublisher;
	}

	/**
	 * Method to fire an {@code ESEvent} type event.
	 * @param event
	 */
	public final void fireESEvent(ESEvent event) {
		if (!IUtils.isNull(publisher)) {
			assertNotNull("Event should not be null", event);
			logger.info(event.toString());
			publisher.publishEvent(event);
			logger.debug("Fired an Elsticsearch event of type: " + event.getEventType());
		} else {
			logger.error("Failed to initialize event publisher");
		}
	}

	/**
	 * Method to fire an event with type and entity object
	 * @param type
	 * @param entity
	 */
	public final void fireEvent(EventType type, Object entity) {
		if (!IUtils.isNull(publisher)) {
			assertNotNull("Entity must not be null", entity);
			if (entity instanceof IESEntity) {
				fireESEvent(ESEvent.builder(type, entity).build());
			} else {
				logger.error(entity.getClass().getSimpleName() +
						" is not an elasticsearch index class object");
			}
		} else {
			logger.error("Failed to initialize event publisher");
		}
	}

	/**
	 * Method to fire an event with type and entity iterator
	 * @param type
	 * @param entity
	 */
	public final void fireEvent(EventType type, Iterable<Object> entities) {
		if (!IUtils.isNull(publisher)) {
			assertNotNull("Entity must not be null", entities);
			entities.forEach(item -> {
				fireEvent(type, item);
			});
		} else {
			logger.error("Failed to initialize event publisher");
		}
	}

}
