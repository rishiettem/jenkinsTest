package com.evaavi.jenkins.cntrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowWorld {
	 @RequestMapping("/")
	    String hello() {
	        return "Hello World, Spring Boot!";
	    }

}
