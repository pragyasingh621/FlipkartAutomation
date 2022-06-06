package com.FlipkartAutomation.Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonHomePage {
	private WebDriver driver;
	private Actions act;

	public AmazonHomePage(WebDriver driver) {
		this.driver = driver;
		act = new Actions(driver);
	}

//LOCATOR

	private By Search = By.id("twotabsearchtextbox");
	private By Price = By.xpath(
			"//table[@class='a-lineitem a-align-top']//span[@class='a-price a-text-price a-size-medium apexPriceToPay']//span[@class='a-offscreen']");

//ACTIONS

	public void searchItemOnAmazon(String item) {
		driver.findElement(Search).sendKeys(item + Keys.ENTER);
	}

	public void clickMatchingItem(String item) throws InterruptedException {
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.partialLinkText(item)).click();
		Thread.sleep(3000);
	}

	public void getPriceOfItem() {
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String childId;
		while (it.hasNext()) {
			childId = it.next();
			driver.switchTo().window(childId);
		}
		String price = driver.findElement(Price).getText();
		System.out.println(price);
	}

}
