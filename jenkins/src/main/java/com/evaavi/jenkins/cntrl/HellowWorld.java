package com.evaavi.jenkins.cntrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class HellowWorld {
	@GetMapping("/test")
	    String hello() {
	        return "Hello World, Rishi as!";
	    }

}
