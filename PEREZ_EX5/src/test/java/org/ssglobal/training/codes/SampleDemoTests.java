package org.ssglobal.training.codes;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.ssglobal.training.codes.controller.SampleController;

@SpringBootTest
class SampleDemoTests {

	@Autowired
	SampleController sampleController;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void testSayHello() {
		String hello = "Hello";
		assertTrue(hello.equals(sampleController.sayHello()));
	}

}
