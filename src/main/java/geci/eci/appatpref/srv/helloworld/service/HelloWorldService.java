package geci.eci.appatpref.srv.helloworld.service;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

	public Map<String, Object>
	helloWorld() {
		
		Map<String, Object> json =
			new LinkedHashMap<>();
		
		json.put("hello", "world");
		
		return json;
	}
}
