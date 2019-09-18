package com.example.devops;

import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.support.SpringBootServletInitializer;

//public class ServletInitializer extends SpringBootServletInitializer {
public class ServletInitializer{
	//@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DevopsApplication.class);
	}

}
