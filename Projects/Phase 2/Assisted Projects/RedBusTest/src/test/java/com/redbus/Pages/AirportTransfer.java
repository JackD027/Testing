package com.redbus.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.redbus.Base.TestBase;

public class AirportTransfer extends TestBase{

	@FindBy(xpath = "//*[@id='ac-airport-select-input']")
	WebElement sourceAirport;
	
	@FindBy(xpath = "//*[@id='src']")
	WebElement findSourceAirport;
	
	@FindBy(xpath = "//*[@id='ac-city-select']")
	WebElement destinationPlace;
	
	@FindBy(xpath = "//*[@id='dest']")
	WebElement findDestinationPlace;
	
	@FindBy(xpath = "//button[text()='Show Buses']")
	WebElement showBuses;
	
	public AirportTransfer(WebDriver driver) {
		PageFactory.initElements(driver, this);
		// driver can now work with your elements and methods of this class
	}
	
//	public void gettitle(){
//		String title = driver.getTitle();
//		System.out.println(title);	
//	}
	
	public void getBus(String sourceString, String destinationString) throws AWTException, InterruptedException{
		Robot robot = new Robot();
		sourceAirport.clear();
		sourceAirport.sendKeys(sourceString);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		destinationPlace.clear();
		destinationPlace.sendKeys(destinationString);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		System.out.println("in pg");
		showBuses.click();
		Thread.sleep(5000);
		
	}
}
