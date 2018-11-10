/**
 * 
 */
package com.synectiks.commons.converters;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter;
import com.synectiks.commons.constants.IConsts;
import com.synectiks.commons.utils.IUtils;

/**
 * @author Rajesh
 */
public class JsonDateConverter implements DynamoDBTypeConverter<Date, String> {

	protected static final Logger logger = LoggerFactory.getLogger(JsonDateConverter.class);
	protected static final DateFormat df = new SimpleDateFormat(IConsts.JSON_DATE_FORMAT);

	@Override
	public Date convert(String object) {
		if (!IUtils.isNullOrEmpty(object)) {
			logger.info("Input: " + object);
			try {
				return df.parse(object);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public String unconvert(Date object) {
		if (!IUtils.isNull(object)) {
			try {
				logger.info("Object: " + df.format(object));
				return df.format(object);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
