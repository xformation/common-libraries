/**
 * 
 */
package com.synectiks.commons.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.ResourceHttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.synectiks.commons.utils.IUtils;

/**
 * @author Rajesh
 */
@Configuration
public class Config {

	@Bean
	public RestTemplate restTemplate() {
		RestTemplate rest = new RestTemplate();
		rest.setMessageConverters(getMessageConverters());
		return rest;
	}

	private List<HttpMessageConverter<?>> getMessageConverters() {
		List<HttpMessageConverter<?>> converters = new ArrayList<>();
		converters.add(new ByteArrayHttpMessageConverter());
		converters.add(new StringHttpMessageConverter());
		converters.add(new ResourceHttpMessageConverter());
		converters.add(new FormHttpMessageConverter());
		converters.add(new MappingJackson2HttpMessageConverter(IUtils.OBJECT_MAPPER));
		return converters;
	}

}
