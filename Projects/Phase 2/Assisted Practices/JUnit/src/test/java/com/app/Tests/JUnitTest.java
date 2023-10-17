package com.app.Tests;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@SuppressWarnings("deprecation")
@RunWith(JUnitPlatform.class)
//@SelectPackages({"my2junitTest","myjunitTest"})

//@SelectClasses(ParametrizedTest.class)
@SelectClasses({com.app.Tests.IncludeExcludeTags.class})
@IncludeTags({"production"})
public class JUnitTest {

	@Test
	public void checkTest() {
	System.out.println("Test executed");	
	}
}




