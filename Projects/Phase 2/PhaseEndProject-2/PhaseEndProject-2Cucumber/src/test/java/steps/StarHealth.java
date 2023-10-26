package steps;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v113.page.Page.GetAppIdResponse;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StarHealth {

	WebDriver driver;

	@Given("User open the chrome browser and starhealth application")
	public void user_open_the_chrome_browser_and_starhealth_application() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.starhealth.in/");
	}

	@When("User  waits for the Welcome to Star Health pop-up and closes it")
	public void user_waits_for_the_welcome_to_star_health_pop_up_and_closes_it() {
		System.out.println("Popup closed");
	}

	@Then("validates the Star Health home page title using a JUnit assertion")
	public void validates_the_star_health_home_page_title_using_a_j_unit_assertion() {
		String ExpectedTitle = "Star Health Insurance: Medical, Accident and Travel insurance policies";
		String ActualTitle = driver.getTitle();
		assertEquals(ActualTitle, ExpectedTitle, "The title is incorrect");
	}

	@Then("clicks on the Buy Now button")
	public void clicks_on_the_buy_now_button() {
		driver.findElement(By.xpath("//span[text()='Buy Now']")).click();
		}

	@Then("User enters following details")
	public void user_enters_following_details(DataTable datatable) throws InterruptedException {
		
		WebElement name= driver.findElement(By.xpath("//input[@id='name']"));
		WebElement contact= driver.findElement(By.xpath("//input[@id='contact_no']"));
		WebElement pinCode= driver.findElement(By.xpath("//input[@id='pinCode']"));
		
		List<Map<String, String>> userList	= datatable.asMaps(String.class, String.class);
		// Now iterate over each row of the data table and get the value based on the columnname(key)
		
		
		WebElement dropDown= driver.findElement(By.xpath("//div[@id='grouped-select']"));
		//Select select =  new Select(dropDown);
		
		for(Map<String, String> e : userList)
		{
			name.sendKeys(e.get("name"));
			contact.sendKeys(e.get("contact"));
			pinCode.sendKeys(e.get("pin"));	
			Thread.sleep(2000);
			dropDown.click();
			driver.findElement(By.xpath("//li[@data-value='1']")).click();
			}
		
	}

	@Then("Validate the user mobile number")
	public void validate_the_user_mobile_number() {
		String actualContact = driver.findElement(By.xpath("//input[@id='contact_no']")).getAttribute("value");
		String expectedContact = "9876543210";
		assertEquals(actualContact, expectedContact, "The phone is incorrect");
		}

	@Then("User clicks on the Star Health logo")
	public void user_clicks_on_the_star_health_logo() {
		driver.findElement(By.xpath("//a[@target='_self']")).click();
	}

	@Then("Close all the browsers")
	public void close_all_the_browsers() {
		driver.close();
	}
}
