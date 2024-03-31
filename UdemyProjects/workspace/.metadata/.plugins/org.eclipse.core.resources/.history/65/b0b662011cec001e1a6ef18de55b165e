/**
 * 
 */
package com.vks.rest.webservices.restfulwebservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vks.rest.webservices.restfulwebservices.bean.HelloWorld;

/**
 * @author Vikash
 *
 */
@RestController
@RequestMapping("/HelloWorldController")
public class HelloWorldController {
	
	//@RequestMapping(method=RequestMethod.GET , path="/hello")
	@GetMapping(path="/hello")
	public String helloWorld() {
		
		return "Hello World";
	}
	
	@GetMapping(path="/hello-bean")
	public HelloWorld helloWorldBean() {
		
		return new HelloWorld("Hello World");
	}

}
