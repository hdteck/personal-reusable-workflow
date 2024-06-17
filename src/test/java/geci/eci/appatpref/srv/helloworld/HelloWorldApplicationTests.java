package geci.eci.appatpref.srv.helloworld;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;

import geci.eci.appatpref.srv.helloworld.controller.HelloWorldController;

@SpringBootTest
@ActiveProfiles("test")
class HelloWorldApplicationTests {

	@Autowired
	HelloWorldController helloWorldController;
	
	@Test
	void contextLoads() {
		
		ApplicationContext applicationContext = 
			SpringApplication.run(HelloWorldApplication.class, new String[] {});
		
		assertThat(applicationContext).isNotNull();
	}

}
