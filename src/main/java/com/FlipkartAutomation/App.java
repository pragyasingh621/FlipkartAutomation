package com.FlipkartAutomation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args ) throws InterruptedException
    {
//    	WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.amazon.in/");
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung mobile"+Keys.ENTER);
//		Actions act = new Actions(driver);
//		act.sendKeys(Keys.PAGE_DOWN).build().perform();
//		driver.findElement(By.partialLinkText("Samsung Galaxy M33 5G")).click();
//		Thread.sleep(3000);
//		Set<String> ids = driver.getWindowHandles();
//		Iterator<String> it = ids.iterator();
//		String childId;
//		while(it.hasNext()) {
//			 childId = it.next();
//			 driver.switchTo().window(childId);
//		}
//		String price = 
//				driver.findElement(By.xpath("//table[@class='a-lineitem a-align-top']//span[@class='a-price a-text-price a-size-medium apexPriceToPay']//span[@class='a-offscreen']"))
//				.getText();
//		System.out.println(price);
//		act.sendKeys(Keys.PAGE_DOWN).build().perform();
//		WebDriverWait wait = new WebDriverWait(driver,60);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-to-cart-button")));
//		driver.findElement(By.id("add-to-cart-button")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='attach-sidesheet-view-cart-button-announce']")));
//		act.sendKeys(Keys.PAGE_UP).build().perform();
//		Thread.sleep(1000);
//		WebElement element = driver.findElement(By.id("attach-sidesheet-view-cart-button"));
//		act.moveToElement(element).click().build().perform();
//		WebElement abc = driver.findElement(By.xpath("//span[@class='a-price sc-product-price']//span[@class='a-price-whole']"));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='a-price sc-product-price']//span[@class='a-price-whole']")));
//		String priceOfItem = abc.getText();
//		System.out.println("price of item : "+""+priceOfItem);
		
		
    }
}
