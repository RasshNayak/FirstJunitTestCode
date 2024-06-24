package com.junit.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyMathCalculationTest {
	
	 private MyMathCalculation mathCalculation = new MyMathCalculation();
	 
	 List<String> learnings = Arrays.asList("DSA","Microservices","OOPS");
//	@Test
//	void test() {
//		
//		int [] numbers = {8,9,8,7};
//		
//		MyMathCalculation mathCalculation =
//				new MyMathCalculation();
//		int actualResult = mathCalculation.addNumbersInArray(numbers);
//		System.out.println(actualResult);
//		int expectedResult = 32;
//		assertEquals(expectedResult, actualResult);
//	}
	
	@Test
	void calculateFourElementArray() {
		System.out.println(mathCalculation.addNumbersInArray(new int[] {8,9,8,7}));
		assertEquals(32, mathCalculation.addNumbersInArray(new int[] {8,9,8,7}));
	}
	
	@Test
	void calculateZeroElementArray() {
		System.out.println(mathCalculation.addNumbersInArray(new int[] {}));
		assertEquals(0, mathCalculation.addNumbersInArray(new int[] {}));
	}
	
	@Test
	void booleanTesting() {
		boolean test= learnings.contains("DSA");
		assertEquals(true, test, "Error Occcured in booleanTesting method");
	}

}
