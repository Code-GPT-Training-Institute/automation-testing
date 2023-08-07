package com.codegpt.training;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ContextConfiguration(classes = TrainingApplication.class, loader = SpringBootContextLoader.class)
class TrainingApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("Hello");
	}

	/**
	 * Need this method so the cucumber will recognize this class as glue and load spring context configuration
	 */
	@Before
	public void setUp() {
		System.out.println("-------------- Spring Context Initialized For Executing Cucumber Tests --------------");
	}

}
