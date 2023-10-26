package StarHealth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StarHealthPageLink {
	
	WebDriver driver;

	@BeforeClass
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.starhealth.in/");
	}

	@Test
	public void print_link() {

		String glossaryLink = driver.findElement(By.xpath("(//a[@class='text-14 mb-8 text-capitalize'])[11]")).getAttribute("href");
		System.out.println(glossaryLink);
	}
	

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
}
