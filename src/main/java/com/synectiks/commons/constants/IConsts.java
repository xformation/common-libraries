/**
 * 
 */
package com.synectiks.commons.constants;

/**
 * @author Rajesh
 */
public interface IConsts {

	String OAK_ROOT = "/Synectiks";

	int SEC_IN_MILLIS = 1000;
	int MIN_IN_MILLIS = 60 * SEC_IN_MILLIS;
	int MIN_30_IN_MILLIS = 30 * MIN_IN_MILLIS;
	int HOUR_IN_MILLIS = 60 * MIN_IN_MILLIS;

	/** Max results size supported by elasticsearch indexes */
	int MAX_ES_RESULT_SIZE = 10000;
	/** 30 Sec Timeout for elastic search scroll query */
	int ES_SCROLL_TIMEOUT = 30000;

	String DELIM_COMMA = ",";

	String ADMIN = "ADMIN";
	String CAUSE = "Cause";
	String EMPTY = "";
	String ERROR = "Error";
	String FAILED = "Failed";
	String FROM = "From";
	String RANGES = "ranges";
	String SPACE = " ";
	String STATUS = "Status";
	String SUCCESS = "Success";
	String TO = "TO";


	// Index names of entities NOTE: index names must be in lower case
	String INDX_SERVICE = "indx_services";
	String INDX_SOURCE = "indx_source";
	String INDX_SUBSCRIBE = "indx_subscribe";
	String INDX_USER = "indx_users";

	String INDX_TYPE_SERVICE = "indx_type_service";
	String INDX_TYPE_SOURCE = "indx_type_source";
	String INDX_TYPE_SUBSCRIBE = "indx_type_subscribe";
	String INDEX_TYPE_USER = "indx_type_user";

	int DEF_PAGE = 0;
	int PAGE_SIZE = 10;
	String DEF_ENCODING = "UTF-8";
	String JSON_DATE_FORMAT = "EEE MMM dd HH:mm:ss zzz yyyy";
	String DEF_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

	String LOGOUT_URL = "shiro.logout.url";
	String SECURE_URLS = "shiro.secure.urls";
	String PUBLIC_URLS = "shiro.public.urls";

	String OAK_NODE = "OakNode";
	String OAK_FILE_NODE = "OakFileNode";
	String EVENT = "event";
	String USERNAME = "username";
	String SUBSCRIPTION_ID = "subscriptionId";
	String OAK_URL = "oakUrl";
	String OAK_URL_KEY = "oak.services.url";
	String STATE_URL_KEY = "state.machine.url";

	String CONT_TYPE = "Content-Type";
	String CONT_TYPE_JSON = "application/json";

	String API_MACHINE_ID = "/machineId";
	String API_MACHINE_STATES = "/listStates";
	String API_MACHINE_EVENT = "/sendEvent";
	String API_ADD_EXT_VAR = "/addExtVar";
	String API_MACHINE_STATE = "/currentState";
	String API_CREATE = "/create";
	String API_UPDATE = "/update";
	String API_DELETE = "/delete";
	String API_DELETE_ID = "/delete/{id}";
	String API_DELETE_IDS = "";
	String API_FIND_ALL = "/listAll";
	String API_FIND_ID = "/{id}";
	String API_FIND_IDS = "";

	String PRM_EVENT = "event";
	String PRM_MACHINE_ID = "machineId";
	String PRM_EXT_STATE_VAR = "extVars";
	String PRM_EV_TYPE = "eventType";
	String PRM_CLASS = "cls";
	String PRM_ENTITY = "entity";
	String PRM_KEY = "key";
	String PRM_FLD_ONLY = "fieldsOnly";
	String PRM_MAPPINGS = "mappings";
	String PRM_VALUE = "value";

	String KEY_SEARCH_URL = "synectiks.search.url";
	String KEY_INDX_EVENT_FIRE = "search.fire.event.url";
	//String URL_INDX_EVENT_FIRE = "http://localhost:8081/api/v1/auth/seach/fireEvent";
	String URL_INDX_EVENT_FIRE = "http://localhost:8092/seach/fireEvent";

	String NESTED = "nested";
	String PATH = "path";
}
