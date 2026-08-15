package com.raj.TestApp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalcTest {
	
	@Test
	void CalcTest() {
		
		Calc calc = new Calc();
		int result = calc.cal(10,6);
		int expected =16;
		assertEquals(result, expected);
	}

}
