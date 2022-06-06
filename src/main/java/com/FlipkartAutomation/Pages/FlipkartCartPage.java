package com.FlipkartAutomation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class FlipkartCartPage {
	private WebDriver driver;
	private Actions actions;

	public FlipkartCartPage(WebDriver driver) {
		this.driver = driver;
		actions = new Actions(driver);
	}

// LOCATOR
	private By CartButton = By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']");
	private By plusButton = By.xpath("//button[normalize-space()='+']");
	private By Price = By.xpath("//span[@class='_2-ut7f _1WpvJ7']");

// ACTIONS
	public void addItemToCart() throws InterruptedException {
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		driver.findElement(CartButton).click();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(plusButton));
	}

	public String priceOfItemOnFlipkart() {
		String priceOfItemOnFlipkart = driver.findElement(Price).getText();
		System.out.println("Price on flipkart : " + "" + priceOfItemOnFlipkart);
		return priceOfItemOnFlipkart;
	}

	public void increaseQuantity() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		WebElement element = driver.findElement(plusButton);
		actions.moveToElement(element).click().build().perform();
		Thread.sleep(3000);
	}

	public void getPriceAfterQuantityIncrease() {
		String price = driver.findElement(Price).getText();
		System.out.println("Price After increase in quantity by 1 : " + "" + price);
	}
}
