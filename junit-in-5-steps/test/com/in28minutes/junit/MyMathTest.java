package com.in28minutes.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {

	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	
	@Test
	public void sum_with3numbers() {
		System.out.println("Test1");
		MyMath myMath = new MyMath();
		int result = myMath.sum(new int[] { 1, 2, 3 });
		assertEquals(6, result);
	}
	
	@Test
	public void sum_with1number() {
		System.out.println("Test2");
		MyMath myMath = new MyMath();
		int result = myMath.sum(new int[] { 3 });
		assertEquals(3, result);
	}

}
