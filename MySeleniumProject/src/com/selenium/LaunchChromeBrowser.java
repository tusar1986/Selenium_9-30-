package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Ravilella\\SeleniumWebdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.close();
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium Ravilella\\SeleniumWebdrivers\\geckodriver.exe\\");
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		// driver1.navigate().to("https://www.amazon.in");
		driver.close();
	
	}

}
