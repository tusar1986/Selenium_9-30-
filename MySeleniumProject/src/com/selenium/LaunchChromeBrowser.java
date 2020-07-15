package com.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Ravilella\\SeleniumWebdrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.close();
		System.setProperty("webdriver.geco.driver", "E:\\Selenium Ravilella\\SeleniumWebdrivers\\geckodriver.exe\\");
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("https://www.amazon.in");
		// driver1.navigate().to("https://www.amazon.in");
		driver1.close();
	}

}
