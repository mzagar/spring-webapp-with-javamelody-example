package com.springapp.mvc;

import org.springframework.stereotype.Service;

/**
 * User: mzagar
 * Date: 6/24/13
 * Time: 9:46 PM
 */
@Service
@net.bull.javamelody.MonitoredWithSpring
public class HelloWorldService {
	public String sayHello() {
		return "Hello world xyz!";
	}
}
