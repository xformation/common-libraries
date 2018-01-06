/**
 * 
 */
package com.synectiks.commons.converters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter;
import com.synectiks.commons.utils.IUtils;

/**
 *  Base classes for DynamoDB type converters
 * @author Rajesh
 *
 */
public abstract class StringConverter<T> implements DynamoDBTypeConverter<String, T> {

	protected static Logger logger = LoggerFactory.getLogger(StringConverter.class);
	protected Class<T> cls;

	public StringConverter(Class<T> clazz) {
		this.cls = clazz;
	}

	@Override
	public String convert(T object) {
		if (!IUtils.isNull(object)) {
			try {
				logger.info("Object: " + IUtils.OBJECT_MAPPER.writeValueAsString(object));
				return IUtils.OBJECT_MAPPER.writeValueAsString(object);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public T unconvert(String str) {
		if (!IUtils.isNullOrEmpty(str)) {
			logger.info("Input: " + str);
			try {
				return IUtils.OBJECT_MAPPER.readValue(str, cls);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
