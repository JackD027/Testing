package com.browser.automation;

import java.lang.annotation.Annotation;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestBrowserAutomation implements DisplayNameAnnotation {

	WebDriver driver;

	@BeforeAll
	public void startbrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	 @ParameterizedTest
	    @CsvSource({
	        "admin1@gmail.com, admin1@",
	        "admin2@gmail.com, admin2@",
	        "admin3@gmail.com, admin3@"
	    })
	public void TestFacebook(String username, String pwd) {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@name='login']")).click();

	}

	 @ParameterizedTest
	    @CsvSource({
	        "Java ",
	        "Python ",
	        "C "
	    })
	public void TestGoogle(String searchString) {
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys(searchString);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@AfterAll
	public void closebrowser() {
		driver.close();
	}

	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}

}
