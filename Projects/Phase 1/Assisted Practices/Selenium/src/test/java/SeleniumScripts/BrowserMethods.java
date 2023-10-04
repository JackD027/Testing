package SeleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
	     
	     // Print the title of the webpage
	     
	     String title = driver.getTitle();
	     
	     System.out.println("The title of the page is : " + title);
	     
	     String url = driver.getCurrentUrl();
	     
	     System.out.println("The URL of the page is : " + url);
		
		// close the browser window
	     
	     driver.close();
	     
	}

}
