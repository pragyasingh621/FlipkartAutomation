package com.FlipkartAutomation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlipkartLoginPage {
	private WebDriver driver;

	public FlipkartLoginPage(WebDriver driver) {
		this.driver = driver;
	}
//LOCATOR
	private final By loginCancelButton = By.className("_2doB4z");
	
//ACTIONS	
	public void cancelLogin() {
		driver.findElement(loginCancelButton).click();
	}
	
}
