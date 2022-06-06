package com.FlipkartAutomation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonCartPage {
	private WebDriver driver;
	private Actions act;
	private WebDriverWait wait;

	public AmazonCartPage(WebDriver driver) {
		this.driver = driver;
		act = new Actions(driver);
		wait = new WebDriverWait(driver, 60);
	}

//LOCATOR
	
	private By CartButton = By.id("add-to-cart-button");
	private By Cart = By.id("attach-sidesheet-view-cart-button");
	private By PriceOnCart = By.xpath("//span[@class='a-price sc-product-price']//span[@class='a-price-whole']");

// ACTIONS
	
	public void addToCart() {
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(CartButton));
		driver.findElement(CartButton).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(Cart));
	}

	public void navigateToCart() {
		WebElement element = driver.findElement(Cart);
		act.moveToElement(element).click().build().perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(PriceOnCart));
	}

	public String getPriceOnAmazon() {
		String priceOfItem = driver.findElement(PriceOnCart).getText();
		System.out.println("price of item : " + "" + priceOfItem);
		return priceOfItem;
	}

	public void comparePrice(String flipkartPrice, String AmazonPrice) {
		String fPrice = flipkartPrice.replaceAll("[^a-zA-Z0-9]", "");
		String APrice = AmazonPrice.replaceAll("[^a-zA-Z0-9]", "");
		int a = Integer.parseInt(fPrice);
		int b = Integer.parseInt(APrice);
		if (a <= b) {
			System.out.println("Flipkart has cheaper price");
		} else {
			System.out.println("Amazon has cheaper price");
		}
	}
}
