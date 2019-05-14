/**
 * 
 */
package com.synectiks.commons.entities;

import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBIndexHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.synectiks.commons.constants.IDBConsts;
import com.synectiks.commons.entities.dynamodb.Entity;
import com.synectiks.commons.utils.IUtils;

/**
 * @author Rajesh
 */
@DynamoDBTable(tableName = IDBConsts.Tbl_SSM_STATE)
public class SSMState extends Entity implements Comparable<SSMState> {

	private static final long serialVersionUID = 5844118213457305875L;

	private String ssmId;
	private String name;
	private String parent;
	private String target;
	private String event;
	private String action;
	private String guard;
	private String guardExpress;
	private boolean initial;
	private boolean end;

	@Override
	@DynamoDBAutoGeneratedKey
	@DynamoDBHashKey(attributeName = IDBConsts.Col_ID)
	public String getId() {
		return id;
	}

	@DynamoDBIndexHashKey(globalSecondaryIndexName = "indx_SSM_ID")
	public String getSsmId() {
		return ssmId;
	}

	@DynamoDBIndexHashKey(globalSecondaryIndexName = "indx_SSM_Name")
	public String getName() {
		return name;
	}

	public String getParent() {
		return parent;
	}

	public String getTarget() {
		return target;
	}

	public String getEvent() {
		return event;
	}

	public void setSsmId(String id) {
		this.ssmId = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public boolean isEnd() {
		return end;
	}

	public void setEnd(boolean end) {
		this.end = end;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getGuard() {
		return guard;
	}

	public void setGuard(String guard) {
		this.guard = guard;
	}

	public String getGuardExpress() {
		return guardExpress;
	}

	public void setGuardExpress(String guardExpress) {
		this.guardExpress = guardExpress;
	}

	public boolean isInitial() {
		return initial;
	}

	public void setInitial(boolean initial) {
		this.initial = initial;
	}

	@Override
	public String toString() {
		return "{\"" + (ssmId != null ? "ssmId\": \"" + ssmId + "\", \"" : "")
				+ (name != null ? "name\": \"" + name + "\", \"" : "")
				+ (parent != null ? "parent\": \"" + parent + "\", \"" : "")
				+ (target != null ? "target\": \"" + target + "\", \"" : "")
				+ (event != null ? "event\": \"" + event + "\", \"" : "")
				+ (action != null ? "action\": \"" + action + "\", \"" : "")
				+ (guard != null ? "guard\": \"" + guard + "\", \"" : "")
				+ (guardExpress != null ? "guardExpress\": \"" + guardExpress + "\", \"" : "")
				+ "end\": " + end + ", " + "\"initial\": " + initial + "}";
	}

	@Override
	public int compareTo(SSMState o) {
		if (!IUtils.isNull(o)) {
			return this.ssmId.compareTo(o.ssmId) + this.name.compareTo(o.name);
		}
		return 1;
	}

	/**
	 * A wrapper class to hold list of states
	 * @author Rajesh
	 */
	public static class StatesWrapper {

		private List<SSMState> states;

		public List<SSMState> getStates() {
			return states;
		}

		public void setStates(List<SSMState> states) {
			this.states = states;
		}
	}

}
