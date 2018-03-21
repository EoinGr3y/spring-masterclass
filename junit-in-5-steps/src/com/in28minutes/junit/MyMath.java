package com.in28minutes.junit;

public class MyMath {
	
	int sum(int[] numbers) {
		int result = 0;
		for (int i: numbers) {
			result += i;
		}
		return result;
	}

}
