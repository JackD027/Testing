package com.project.phase1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatorsOnRedBus {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		// open chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// defining Robot to press Enter
		Robot robot = new Robot();
		
		
		/*
		 * 
		 * Below code snippet is to open www.redbus.com and saerch for buses from Paris
		 * to London on 30 Oct 2023
		 * 
		 */
		  
		  driver.get("https://www.redbus.com/");
		  
		  //source 
		  driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[1]")).clear(); 
		  driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[1]")) .sendKeys("Paris"); 
		  //stop for five seconds 
		  Thread.sleep(5000); 
		  //Press Enter 
		  robot.keyPress(KeyEvent.VK_ENTER);
		  
		  
		  // destination 
		  driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[2]")).clear(); 
		  driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[2]")) .sendKeys("London"); 
		  //stop for five seconds 
		  Thread.sleep(5000); 
		  //Press Enter 
		  robot.keyPress(KeyEvent.VK_ENTER);
		  
		  
		  //stop for 3 seconds 
		  Thread.sleep(3000);
		  
		  //Calendar 
		  driver.findElement(By.id("date-box")).click(); 
		  Thread.sleep(5000);
		  
		  // Select date 
		  driver.findElement( By.xpath("//div[@class='DatePicker__CalendarContainer-sc-1x9sb82-0 bkhtIz']/descendant::span[41]")) .click(); 
		  //stop for five seconds 
		  Thread.sleep(5000);
		  
		  // click on search button 
		  driver.findElement(By.id("search_butn")).click();
		  
		 //Stop for 10 seconds. 
		  Thread.sleep(10000);
		  
		
	}

}
