package com.evaavi.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class JenkinsApplication extends SpringBootServletInitializer  {

	
	public static void main(String[] args) {
		SpringApplication.run(JenkinsApplication.class, args);
		System.out.println("Started");
	}

	 @Override
	  protected SpringApplicationBuilder  configure(SpringApplicationBuilder builder) {
	      return builder.sources(JenkinsApplication.class);
	  }
}
