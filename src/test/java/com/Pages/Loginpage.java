package com.Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import ExcelUtility.ExcelPage;

public class Loginpage {
	// inspecting the elements in the application
	WebDriver driver;

	public void url(String browser) // launching the application using multiple browsers
	{
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\selinium jars\\Crome driver\\chromedriver.exe");
			driver = new ChromeDriver(); // to launch the application in chrome browser
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\selinium jars\\Crome driver\\geckodriver.exe");
			driver = new FirefoxDriver(); // to launch the application in firefox browser
		}

		driver.manage().window().maximize(); // maximizes the browser
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); // providing waiting time

	}

	public void Launch_URL() // using webdriver get visting the testing website
	{
		driver.get("http://automationpractice.com/index.php"); // takes us to homepage of the application
		System.out.println(driver.getTitle()); // displays title of the page
	}

	public void Signin(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}

	public void usernameandpassword(int i) throws IOException {
		ExcelPage e = new ExcelPage();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(e.excel_username(i));
		WebElement d = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		d.click();
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys(e.excel_password(i));
		WebElement f = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		f.click();
	}

	public void Click(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}
}