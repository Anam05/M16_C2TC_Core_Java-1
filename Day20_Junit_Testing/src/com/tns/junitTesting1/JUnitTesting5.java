package com.tns.junitTesting1;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class JUnitTesting5 
{
	@Test
	void accept()
	{
		System.setProperty("1", "Hritik");
		Assumptions.assumeTrue("Hritik".equals(System.getProperty("1")));
	}
}
