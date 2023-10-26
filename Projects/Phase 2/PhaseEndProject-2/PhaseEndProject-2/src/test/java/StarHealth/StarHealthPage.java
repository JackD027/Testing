package StarHealth;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.Assert;

public class StarHealthPage {

	WebDriver driver;

	@BeforeClass
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.starhealth.in/");
	}

	@Test(priority = '1')
	public void Validate_title() {
		//System.out.println("The title of the page");
		String ExpectedTitle = "Star Health Insurance: Medical, Accident and Travel insurance policies";
		String ActualTitle = driver.getTitle();
		assertEquals(ActualTitle, ExpectedTitle, "The title is incorrect");
	}

	@Parameters({ "name", "mobile", "pin" })
	@Test(priority = '2')
	public void Test_Header_plan(String name, String mobile, String pin) throws InterruptedException {
		WebElement plans = driver.findElement(By.xpath("//div[@class='flex cursor-pointer pr-30 cursor-pointer nav-link flex']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(plans).build().perform();	
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='For My Family'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@id='phoneNumber']")).sendKeys(mobile);
		driver.findElement(By.xpath("//input[@id='pinCode']")).sendKeys(pin);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Get a quote']")).click();
	}

	@Test(priority = '3', dataProvider = "testdata")
	public void validateDataFromExcel(String facebookString, String youtubeString, String linkedinString,
			String twitterString, String instagramString) {
		String facebook = driver.findElement(By.xpath("(//a[@class='mr-4 mr-10-xs'])[1]")).getAttribute("href");
		System.out.println("Facebook Link Comparison: " + facebook.equals(facebookString));

		String youtube = driver.findElement(By.xpath("(//a[@class='mr-4 mr-10-xs'])[2]")).getAttribute("href");
		System.out.println("Youtube Link Comparison: " + youtube.equals(youtubeString));

		String linkedin = driver.findElement(By.xpath("(//a[@class='mr-4 mr-10-xs'])[3]")).getAttribute("href");
		System.out.println("Linkedin Link Comparison: " + linkedin.equals(linkedinString));

		String twitter = driver.findElement(By.xpath("(//a[@class='mr-4 mr-10-xs'])[4]")).getAttribute("href");
		System.out.println("Twitter Link Comparison: " + twitter.equals(twitterString));

		String instagram = driver.findElement(By.xpath("(//a[@class='mr-4 mr-10-xs'])[5]")).getAttribute("href");
		System.out.println("Instagram Link Comparison: " + instagram.equals(instagramString));
		
	}



	@DataProvider(name = "testdata")
	public Object[][] datasupplier() throws EncryptedDocumentException, IOException {

		Object[][] inputdata = XLS_DataProvider.getTestData("Sheet1");

		return inputdata;
	}

	@Test(priority = '4')
	public void ClickOnTwitter() throws InterruptedException {
		driver.findElement(By.xpath("(//a[@class='mr-4 mr-10-xs'])[4]")).click();
		Thread.sleep(3000);
		String expectedTitle= "Star Health & Allied Insurance Co Ltd (@StarHealthIns) / X";
		String title = driver.getTitle();
		System.out.println("Twitter Title Comparison: " + title.equals(expectedTitle));
	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

}
