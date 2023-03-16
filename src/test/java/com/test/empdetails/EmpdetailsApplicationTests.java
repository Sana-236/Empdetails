package com.test.empdetails;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmpdetailsApplicationTests {
	@BeforeAll
	static void beforeAll() {
		System.out.println(" test passed before all classes");
	}
	//after all tests used mostly to close the connections
	@AfterAll
	static void afterAll() {
		System.out.println(" test passed after all classes");
	}

	@Test
	void contextLoads() {
	}
	
}
