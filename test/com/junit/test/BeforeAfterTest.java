package com.junit.test;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BeforeAfterTest {
	
	@BeforeAll
	static void beforeAllTest() {
		System.out.println("Before All Test -- Set up \n ");
	}
	
	@BeforeEach
	void beforeEachTest() {
		System.out.println("Before Each Specific Test -- Set up");
	}

	@Test
	void test1() {
		System.out.println("Executing Test 1");
	}
	
	@Test
	void test2() {
		System.out.println("Executing Test 2");
	}
	
	@Test
	void test3() {
		System.out.println("Executing Test 3");
	}
	
	@AfterEach
	void afterEachTest() {
		System.out.println("After Each Specific Test -- Clean up \n ");
	}
	
	@AfterAll
	static void afterAllTest() {
		System.out.println("After All Test -- Clean up");
	}
}
