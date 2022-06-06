package com.FlipkartAutomation.Services;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.FlipkartAutomation.Utils.IRead;
import com.FlipkartAutomation.Utils.ReadConfigProperties;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverService {

	private WebDriver driver;
	private IRead reader;

	public WebDriver getDriver() {
		return driver;
	}

	public IRead getReader() {
		return reader;
	}

	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		reader = new ReadConfigProperties();
	}

	public DriverService() {
		launchBrowser();
	}

}
