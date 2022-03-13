package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class StringHelperParameterizedTest {
	
	//AACD => CD ACD => CD CDEF => CDEF CDAA => CDAA
			
			StringHelper helper = new StringHelper();
			
			private String input;
			private String expectedOutput;
			
			public StringHelperParameterizedTest(StringHelper helper, String input, String expectedOutput) {
				super();
				this.input = input;
				this.expectedOutput = expectedOutput;
			}

			@Parameters
			public static Collection<String[]> testConditions() {
				String expectedOutputs[][] = {
						{"AAD", "CD"},
				        {"ACD","CD"}};
				return Arrays.asList(expectedOutputs);
			}
	
	@Test
	public void testtruncateAInFirst2Positions_AInFirst2Positions() {
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
	}
	
	@Test
	public void testtruncateAInFirst2Positions_AInFirstPositions() {
		StringHelper helper = new StringHelper();
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}

}
