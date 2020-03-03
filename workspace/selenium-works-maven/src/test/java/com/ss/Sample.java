package com.ss;

import static org.junit.Assert.*;

import org.junit.Test;

public class Sample {

	@Test
	public void test() {

		assertEquals("hi", "hi");
	}
	@Test
	public void test1() {
		assertEquals("hi", "bye");
	}

}
