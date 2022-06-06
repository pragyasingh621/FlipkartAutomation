package com.FlipkartAutomation.Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartHomePage {
	private WebDriver driver;

	public FlipkartHomePage(WebDriver driver) {
		this.driver = driver;
	}

// LOCATOR
	private By search = By.xpath("//input[@title='Search for products, brands and more']");
	private By firstItem = By.xpath("//div[@class='_1YokD2 _3Mn1Gg']//div[@class='_1AtVbE col-12-12']");
	private By price = By.xpath("//div[@class='_30jeq3 _16Jk6d']");
	

//ACTIONS
	
	public void searchItem(String item) {
		driver.findElement(search).sendKeys(item+Keys.ENTER);
	}

	public void clickFirstItem() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		driver.findElements(firstItem).get(1).click();
	}
	
	public void getPrice() {
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String childId;
		while(it.hasNext()) {
			 childId = it.next();
			 driver.switchTo().window(childId);
		}
		String Price = driver.findElement(price).getText();
		System.out.println("Price of item : "+""+Price);
	}
}
