package com.in28minutes.mockito.mockitodemo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockAnnotationsTest {
	
	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	SomeBusinessImpl someBusinessImpl;

	@Test
	public void testFindTheGreatestFromAllData() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 24, 15, 3 });
		assertEquals(24, someBusinessImpl.findTheGreatestFromAllData());
	}
	
	@Test
	public void testFindTheGreatestFromAllData_ForOneValue() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 15 });
		assertEquals(15, someBusinessImpl.findTheGreatestFromAllData());
	}
	
	@Test
	public void testFindTheGreatestFromAllData_ForNoValues() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { });
		assertEquals(Integer.MIN_VALUE, someBusinessImpl.findTheGreatestFromAllData());
	}

}