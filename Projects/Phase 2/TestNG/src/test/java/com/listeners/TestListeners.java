package com.listeners;


	import org.testng.Assert;
	import org.testng.annotations.Listeners;
	import org.testng.annotations.Test;

	@Listeners(ITestListeners.class)
	public class TestListeners {
		
		
		@Test(priority='1')
		public void method1()
		{
			System.out.println("Executing method1");
		}
		
		@Test(priority='2')
		public void method2()
		{
			System.out.println("Executing method1");
			Assert.assertTrue(false);
		}
		
		

	}
