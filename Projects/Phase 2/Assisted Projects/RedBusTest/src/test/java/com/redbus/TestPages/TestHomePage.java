package com.redbus.TestPages;

import java.awt.AWTException;
import java.io.IOException;

import javax.print.attribute.standard.Destination;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.redbus.Base.TestBase;
import com.redbus.Pages.HomePage;
import com.redbus.Utilities.XLDataProvider;

public class TestHomePage extends TestBase {
	HomePage hp;

	@BeforeMethod
	@Parameters({ "Browser" })
	public void OpenApp(String Browser) {

		openBrowser(Browser);

		hp = new HomePage(driver);
	}

	@AfterMethod
	public void CloseApp() {
		driver.quit();
	}

	@Test(priority = '1')
	public void testTitle() {
		hp.gettitle();
	}

	@Test(priority = '2', dataProvider = "testdata")
	public void testGetBuses(String source, String destination) throws AWTException, InterruptedException {
		hp.getBuses(source, destination);
	}

	@DataProvider(name = "testdata")
	public Object[][] datasupplier() throws EncryptedDocumentException, IOException {

		Object[][] input = XLDataProvider.getTestData("Sheet1");
		return input;

	}

//	@Test(priority = '4')
//	public void testViennaBlatislava() {
//		hp.ViennaBlatislava();
//	}
//
//	@Test(priority = '5')
//	public void testSingaporeKualaLumpurBuses() {
//		hp.SingaporeKualaLumpurBuses();
//	}
//
//	@Test(priority = '6')
//	public void testRedBusIndia() {
//		hp.redBusIndia();
//	}

}
