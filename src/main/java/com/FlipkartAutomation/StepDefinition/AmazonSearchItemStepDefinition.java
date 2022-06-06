package com.FlipkartAutomation.StepDefinition;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;

import com.FlipkartAutomation.Pages.AmazonCartPage;
import com.FlipkartAutomation.Pages.AmazonHomePage;
import com.FlipkartAutomation.Pages.FlipkartCartPage;

import com.FlipkartAutomation.Services.DriverService;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonSearchItemStepDefinition {
	private DriverService service;
	private WebDriver driver;
	private FlipkartCartPage flipkartCartPage;
	private AmazonHomePage amazonHomePage;
	private AmazonCartPage amazonCartPage;
	public String priceOnFlipkart;
	public String priceOnAmazon;

	public AmazonSearchItemStepDefinition(DriverService service) {
		this.service = service;
		this.driver = service.getDriver();
		flipkartCartPage = new FlipkartCartPage(driver);
		amazonHomePage = new AmazonHomePage(driver);
		amazonCartPage = new AmazonCartPage(driver);
	}

	@Then("user will be able to print the price from cart")
	public void user_will_be_able_to_print_the_price_from_cart() {
		priceOnFlipkart = flipkartCartPage.priceOfItemOnFlipkart();
	}

	@Given("user navigate to amazon application")
	public void user_navigate_to_amazon_application() {
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform(); // Open new // Open new tab
		driver.get(service.getReader().getAmazonUrl());
	}

	@Given("user search for {string} in search box on amazon")
	public void user_search_for_in_search_box_on_amazon(String item) {
		amazonHomePage.searchItemOnAmazon(item);
	}

	@When("user click the matching item {string}")
	public void user_click_the_matching_item(String item) throws InterruptedException {
		amazonHomePage.clickMatchingItem(item);
	}

	@Then("user will be able to print the price of item from amazon")
	public void user_will_be_able_to_print_the_price_of_item_from_amazon() {
		amazonHomePage.getPriceOfItem();
	}

	@When("user click on ADD TO CART to add the item in cart in guest mode on amazon")
	public void user_click_on_add_to_cart_to_add_the_item_in_cart_in_guest_mode_on_amazon() {
		amazonCartPage.addToCart();
	}

	@When("user navigate to cart")
	public void user_navigate_to_cart() {
		amazonCartPage.navigateToCart();
	}

	@Then("user will be able to print the price from amazon cart")
	public void user_will_be_able_to_print_the_price_from_amazon_cart() {
		priceOnAmazon = amazonCartPage.getPriceOnAmazon();
	}

	@Then("user compare the price on flipkart and amazon and print the cheaper price")
	public void user_compare_the_price_on_flipkart_and_amazon_and_print_the_cheaper_price() {
		amazonCartPage.comparePrice(priceOnFlipkart, priceOnAmazon);
	}

}
