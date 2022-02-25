package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTest {
private static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplicationTest.class);
	@Test
	void test() {
		fail("Not yet implemented");
		logger.info("Test case are executing now ");
		assertEquals(true, true);
	}
  
	
}
