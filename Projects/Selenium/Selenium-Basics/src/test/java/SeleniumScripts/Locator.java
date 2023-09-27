package SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// step 1: open the browser

		WebDriver driver = new ChromeDriver();

		// Maxamize the browser window- we will see browser window methods

		driver.manage().window().maximize();

		// Enter the url

		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up");

		// Inspect the Element Username using ID locator and check if the textbox is
		// present or not

		boolean displayed = driver.findElement(By.id("wpName2")).isDisplayed(); // this method return true if element
																				// displayed else return false
		System.out.println("Element is displayed? " + displayed);

		// Inspect the Element Username using ID locator and check if the textbox is
		// enabled or not
		boolean enabled = driver.findElement(By.id("wpName2")).isEnabled(); // this method return true if element
																			// enabled else return false
		System.out.println("Element is enabled? " + enabled);

		// Inspect the Element Password using ID locator and enter text in it
		// sendKeys("inputvalue") ==> will enter input data in a text box
		driver.findElement(By.id("wpName2")).sendKeys("admin");

// When you have multiple actions to be done on the same element then you can store the locator value in an object of type WebElement
// After this you can call the action methods on the WebElement object

		WebElement password = driver.findElement(By.id("wpPassword2"));

		displayed = password.isDisplayed();
		System.out.println("Element is displayed? " + displayed);
		enabled = password.isEnabled();
		System.out.println("Element is enabled? " + enabled);
		password.sendKeys("admin@123");

		/**************************************************************/
		// Continue furthers on the page and find element using name locator

		WebElement confirm = driver.findElement(By.name("retype")); // create webelement object

		confirm.isDisplayed();
		confirm.isEnabled();
		confirm.sendKeys("admin@123");

		WebElement email = driver.findElement(By.name("email"));

		email.sendKeys("admin@gmail.com");

	}

}
