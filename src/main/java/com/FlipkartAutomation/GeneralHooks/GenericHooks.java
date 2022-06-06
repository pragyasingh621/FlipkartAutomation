package com.FlipkartAutomation.GeneralHooks;

import org.openqa.selenium.WebDriver;

import com.FlipkartAutomation.Services.DriverService;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class GenericHooks {
	
	private DriverService service;
	private WebDriver driver;
//	private static CustomExtentReporter customExtentReporter;
//	private static boolean isReporterRunning;

	public GenericHooks(DriverService service) {
		super();
		this.service = service;
		this.driver = service.getDriver();
	}

	@Before
	public void setup() {
//				WebDriverManager.chromedriver().setup();
//				 driver = new ChromeDriver();
	}

	@After
	public void teardown(Scenario scenario) {
		if (driver != null)
			driver.quit();
	}
}
