package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {
	
	//AACD => CD ACD => CD CDEF => CDEF CDAA => CDAA
	
	StringHelper helper;
	
	@Before
	public void before() {
		helper = new StringHelper();
	}

	@Test
	public void testtruncateAInFirst2Positions_AInFirst2Positions() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}
	@Test
	public void testtruncateAInFirst2Positions_AInFirstPositions() {
		StringHelper helper = new StringHelper();
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
	
	//ABCD => false, ABAB => true, AB => true, A => false
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenerio() {
		assertEquals(false,helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
}
