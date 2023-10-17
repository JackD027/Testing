package com.app.Tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
//import org.junit.runner.RunWith;
//import org.junit.platform.suite.api.*;

//@IncludeTags({ "development" }) // execute those methods that have tag name as devlopment
@ExcludeTags({"prod" }) // execute those methods that do not have tag name as prod
public class IncludeExcludeTags {

	@Test
	@Tag("development")
	public void devtest1() {
		System.out.println("test Case development1");
	}

	@Test
	@Tag("development")
	public void devTest2() {
		System.out.println("test Case development 2");
	}

	@Test
	@Tag("qa")
	public void qatest1() {
		System.out.println("test Case QA 1");
	}

	@Test
	@Tag("qa")
	public void qatest2() {
		System.out.println("test Case QA 2");
	}

	@Test
	@Tag("prod")
	public void prodTest1() {
		System.out.println("test Case Production 1");
	}

	@Test
	@Tag("prod")
	public void prodtest2() {
		System.out.println("test Case Production 2");
	}

}
