package com.redbus.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.redbus.Base.TestBase;

public class HomePage extends TestBase {

	Actions a = new Actions(driver);

	@FindBy(xpath = "//div[@class='main-wrapper search-box-wrapper']/descendant::input[1]")
	WebElement source;

	@FindBy(xpath = "//div[@class='main-wrapper search-box-wrapper']/descendant::input[2]")
	WebElement destination;

	@FindBy(id = "date-box")
	WebElement dateBox;

	@FindBy(xpath = "//div[@class='DatePicker__CalendarContainer-sc-1x9sb82-0 bkhtIz']/descendant::span[41]")
	WebElement date;

	@FindBy(id = "search_butn")
	WebElement searchButton;

	

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		// driver can now work with your elements and methods of this class
	}

	public void gettitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public void getBuses(String sourceString, String destinationString) throws AWTException, InterruptedException {
		Robot robot = new Robot();
		source.clear();
		source.sendKeys(sourceString);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);

		destination.clear();
		destination.sendKeys(destinationString);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);

		dateBox.click();

		date.click();
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);

		searchButton.click();

		Thread.sleep(10000);

	}

}
