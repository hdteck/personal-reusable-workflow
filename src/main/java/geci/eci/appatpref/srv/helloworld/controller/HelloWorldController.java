package geci.eci.appatpref.srv.helloworld.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import geci.eci.appatpref.srv.helloworld.service.HelloWorldService;

@RestController
public class HelloWorldController {

	@Autowired
	HelloWorldService helloWorldService;
	
	@GetMapping({ "", "/" })
	public Map<String, Object>
	helloWorld() {
		
		return helloWorldService
					.helloWorld();
		
	}
}
