package com.course.practicaljava.api.server;

import java.time.LocalTime;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class DefaultRestApi {
	
	private Logger LOG = LoggerFactory.getLogger(DefaultRestApi.class);

	@PostMapping(value = "/welcome")
	public String welcome() {

		LOG.info(StringUtils.join("Hallo", "This is String Util.", "logger"));
		return "welcome to Spring Boot !! bro";
	}

	@PostMapping(value = "/time")
	public String Time() {
		return LocalTime.now().toString();
	}

}
