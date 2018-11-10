/**
 * 
 */
package com.synectiks.commons.converters;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.type.TypeReference;
import com.synectiks.commons.utils.IUtils;

/**
 * Base classes for DynamoDB type converters
 * @author Rajesh
 */
public abstract class StringArrayConverter<T> extends StringConverter<T> {

	protected static Logger logger = LoggerFactory.getLogger(StringArrayConverter.class);

	public StringArrayConverter(Class<T> clazz) {
		super(clazz);
	}

	@Override
	public T unconvert(String str) {
		if (!IUtils.isNullOrEmpty(str)) {
			logger.info("Input: " + str);
			try {
				return IUtils.OBJECT_MAPPER.readValue(str, new TypeReference<List<T>>(){});
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
