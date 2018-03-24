package com.in28minutes.spring.basics.springin5steps.cdi;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.spring.basics.springin5steps.SpringIn5StepsBasicApplication;

@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {

	@InjectMocks
	SomeCdiBusiness someCdiBusiness;
	
	@Mock
	SomeCdiDao someCdiDaoMock; 
	
	@Test
	public void testBasicScenario() {
		Mockito.when(someCdiDaoMock.getData()).thenReturn(new int[] {2, 4});
		assertEquals(4, someCdiBusiness.findGreatest());
	}
	
	@Test
	public void testBasicScenario_noElements() {
		Mockito.when(someCdiDaoMock.getData()).thenReturn(new int[] { });
		assertEquals(Integer.MIN_VALUE, someCdiBusiness.findGreatest());
	}

	@Test
	public void testBasicScenario_EqualElements() {
		Mockito.when(someCdiDaoMock.getData()).thenReturn(new int[] { 2, 2 });
		assertEquals(2, someCdiBusiness.findGreatest());
	}
}
