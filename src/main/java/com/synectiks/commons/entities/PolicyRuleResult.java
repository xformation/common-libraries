/**
 * 
 */
package com.synectiks.commons.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.synectiks.commons.utils.IUtils;

/**
 * Class to hold and translate Search Response into application class.
 * @author Rajesh
 */
public class PolicyRuleResult implements Serializable {

	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(PolicyRuleResult.class);
	private static final long serialVersionUID = 2016053745431745972L;

	private String scrollId;
	private long totalHits;
	private long tookInMillis;
	private String policyId;
	private String ruleId;
	private List<String> hits;
	private boolean timeOut;
	private boolean terminatedEarly;

	public String getPolicyId() {
		return policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	public String getRuleId() {
		return ruleId;
	}

	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public String getScrollId() {
		return scrollId;
	}

	public void setScrollId(String scrollId) {
		this.scrollId = scrollId;
	}

	public long getTotalHits() {
		return totalHits;
	}

	public void setTotalHits(long totalHits) {
		this.totalHits = totalHits;
	}

	public long getTookInMillis() {
		return tookInMillis;
	}

	public void setTookInMillis(long tookInMillis) {
		this.tookInMillis = tookInMillis;
	}

	public List<String> getHits() {
		return hits;
	}

	public void setHits(List<String> hits) {
		this.hits = hits;
	}

	public boolean isTimeOut() {
		return timeOut;
	}

	public void setTimeOut(boolean timeOut) {
		this.timeOut = timeOut;
	}

	public boolean isTerminatedEarly() {
		return terminatedEarly;
	}

	public void setTerminatedEarly(boolean terminatedEarly) {
		this.terminatedEarly = terminatedEarly;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{ ");
		if (scrollId != null) {
			builder.append("\"scrollId\": ");
			builder.append(scrollId);
			builder.append(", ");
		}
		builder.append(", \"totalHits\": ");
		builder.append(totalHits);
		builder.append(", \"tookInMillis\": ");
		builder.append(tookInMillis);
		builder.append(", ");
		if (hits != null) {
			builder.append("\"hits\": \"");
			builder.append(hits);
			builder.append("\", ");
		}
		if (policyId != null) {
			builder.append("\"policyId\": \"");
			builder.append(policyId);
			builder.append("\", ");
		}
		if (ruleId != null) {
			builder.append("\"ruleId\": \"");
			builder.append(ruleId);
			builder.append("\", ");
		}
		builder.append("\"timeOut\": ");
		builder.append(timeOut);
		builder.append(", \"terminatedEarly\": ");
		builder.append(terminatedEarly);
		builder.append(" }");
		return builder.toString();
	}

	/**
	 * Method to copy properties into new SearchHitsResponse object.
	 * @param sRes
	 * @return
	 */
	public static PolicyRuleResult createFromSearchResponse(SearchResponse sRes) {
		PolicyRuleResult res = new PolicyRuleResult();
		if (!IUtils.isNull(sRes)) {
			setResultHitIds(res, sRes.getHits());
			res.setScrollId(sRes.getScrollId());
			if (!IUtils.isNull(sRes.isTerminatedEarly())) {
				res.setTerminatedEarly(sRes.isTerminatedEarly());
			}
			res.setTimeOut(sRes.isTimedOut());
			res.setTookInMillis(sRes.getTookInMillis());
		}
		return res;
	}

	/**
	 * Method to extract hit elastic search ids.
	 * @param res 
	 * @param hits
	 * @return
	 */
	public static void setResultHitIds(PolicyRuleResult res, SearchHits hits) {
		if (!IUtils.isNull(hits) && hits.getTotalHits() > 0) {
			res.setTotalHits(hits.getTotalHits());
			List<String> ids = new ArrayList<>();
			for (SearchHit hit : hits.getHits()) {
				ids.add(hit.getId());
			}
			res.setHits(ids);
		}
	}

	/**
	 * Convert string to json object.
	 * @param str
	 * @return
	 */
	public static JSONObject getJSONObject(String str) {
		if (!IUtils.isNullOrEmpty(str)) {
			try {
				return new JSONObject(str);
			} catch (JSONException e) {
				// ignore it.
			}
		}
		return null;
	}
}
