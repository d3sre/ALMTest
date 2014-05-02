package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.ALMTest;

public class ALMTestTester {
	
	private final ALMTest almtest = new ALMTest();
	
	@Test
	public void multiplyTest() {
		assertEquals(6, almtest.testMultiply(2, 3));

	}

	

}
