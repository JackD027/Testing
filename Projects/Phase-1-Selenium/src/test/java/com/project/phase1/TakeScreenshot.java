package com.project.phase1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * 
		 * Java program to create a screenshot
		 * 
		 */
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		// open chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.expedia.co.in");
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshots/project.png");

		FileUtils.copyFile(srcFile, destFile);

	}

}
