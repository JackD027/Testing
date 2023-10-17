package com.app.Tests.ParameterizedTests;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class ParametrizedEnumSource {
	
	enum Values{
		Selenium, Jmeter, Junit   // values of type Enum
	}
	
	@ParameterizedTest(name = "Enum Value {arguments}")
	@EnumSource(Values.class)
	public void passvaluesEnumSource(Object value)
	{
		// Returns a string representation of the object
		System.out.println(value.toString());
	}

}