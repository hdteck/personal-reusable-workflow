package geci.eci.appatpref.srv.helloworld.controller;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class HelloWorldControllerTests {

	@Autowired
	HelloWorldController helloWorldController;
	
	@Test
	public void test() {
		
		Map<String, Object> response =
			helloWorldController
				.helloWorld();
		
		assertThat(response).isNotNull();
		assertThat(response.containsKey("hello")).isTrue();
		assertThat(response.get("hello")).isEqualTo("world");
	}
}
