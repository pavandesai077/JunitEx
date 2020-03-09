package com.junit.logic;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

	@Test
	public void test() {
		// 9420910410
		int act = Factorial.fact(5);
		Assert.assertEquals(120, act);
		Assert.assertEquals(120, Factorial.fact(5));
		Assert.assertEquals("successful", 120, Factorial.fact(6));
	}
}
