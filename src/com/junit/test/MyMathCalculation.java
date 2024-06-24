package com.junit.test;

public class MyMathCalculation {
	
	public int addNumbersInArray (int [] numbers) {
		
		int sum = 0;
		for(int number : numbers) {
			
			sum += number;
		}
		return sum;
		
	}

}
