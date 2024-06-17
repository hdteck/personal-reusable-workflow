package geci.eci.appatpref.srv.helloworld.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class HelloWorldServiceTests {

	@Autowired
	HelloWorldService helloWorldService;
	
	@Test
	public void test() {
		
		Map<String, Object> response =
			helloWorldService.helloWorld();
		
		assertThat(response).isNotNull();
		assertThat(response.containsKey("hello")).isTrue();
		assertThat(response.get("hello")).isEqualTo("world");
	}
}
