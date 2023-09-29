package com.project.phase1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebsiteScrapper {
	static WebDriver driver;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		// using chrome options to disable notifications
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		// open chrome
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.expedia.co.in");
		scrapper();
		driver.navigate().to("https://google.com");
		scrapper();

	}

	public static void scrapper() throws ClassNotFoundException, SQLException {

		String title = driver.getTitle();
		String url = driver.getCurrentUrl();

		String db = "jdbc:mysql://localhost:3306/selenium";
		String usrname = "root";
		String pswrd = "root";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(db, usrname, pswrd);
		PreparedStatement ps = con.prepareStatement("insert into websites values(?,?)"); // execute query
		ps.setString(1, title);
		ps.setString(2, url);
		ps.executeUpdate();
	}

}
