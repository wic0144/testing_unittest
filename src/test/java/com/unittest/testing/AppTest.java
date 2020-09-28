package com.unittest.testing;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.Object;

public class AppTest 
{
	App object;
	
	@Before
	public void newClassFahrenheit() {
		object = new App() ;
	}
	
	@Test
	public void testResult0Input0() {
		double input = 0 ;
		double expected = 0 ;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected,actual,2);
	}
	
	@Test
	public void testResult1000Input1000() {
		double input = 1000 ;
		double expected = 1000 ;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected,actual,2);
	}
	
	@Test
	public void testResultMinus1000InputMinus1000() {
		double input = -1000 ;
		double expected = -1000 ;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected,actual,2);
	}
	
	@Test
	public void testResultTrueInput2000() {
		double input = 2000 ;
		boolean expected = false ;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultTrueInputMinus2000() {
		double input = -2000 ;
		boolean expected = false ;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInputMinus1000() {
		double input = -1000 ;
		boolean expected = true ;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInputMinus1010() {
		double input = -1010 ;
		boolean expected = false ;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInputMinus999() {
		double input = -999 ;
		boolean expected = true ;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInputMinus501() {
		double input = -501 ;
		boolean expected = true ;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInputMinus500() {
		double input = -500 ;
		boolean expected = true ;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}@Test
	public void testResultTrueInputMinus499() {
		double input = -499 ;
		boolean expected = true ;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInputMinus1() {
		double input = -1 ;
		boolean expected = true ;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInputMinus0() {
		double input = 0 ;
		boolean expected = true ;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInput1() {
		double input = 1 ;
		boolean expected = true ;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInput499() {
		double input = 499;
		boolean expected = true ;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInput500() {
		double input = 500 ;
		boolean expected = true ;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	  
	@Test
	public void testResultTrueInput501() {
		double input = 501 ;
		boolean expected = true ;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInput999() {
		double input = 999 ;
		boolean expected = true ;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInput1000() {
		double input = 1000 ;
		boolean expected = true ;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInput1001() {
		double input = 1001 ;
		boolean expected = false ;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInput1010() {
		double input = 1010 ;
		boolean expected = false ;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	
	  
	  
	  
	  
	  
	  
}
