package Junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit {
	String message = "1 Hello World";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testPrintMessage() {
		message = "1 New World";
		assertEquals(message,messageUtil.printMessage());
	}
	

}
