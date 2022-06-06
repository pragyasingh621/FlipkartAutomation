package com.FlipkartAutomation.StepDefinition;

import org.openqa.selenium.WebDriver;

import com.FlipkartAutomation.Pages.FlipkartCartPage;
import com.FlipkartAutomation.Pages.FlipkartHomePage;
import com.FlipkartAutomation.Pages.FlipkartLoginPage;
import com.FlipkartAutomation.Services.DriverService;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipkartSearchItemStepDefinition {
	private DriverService service;
	private WebDriver driver;
	private FlipkartHomePage flipkartHomePage;
	private FlipkartCartPage flipkartCartPage;
	private FlipkartLoginPage flipkartLoginPage;

	public FlipkartSearchItemStepDefinition(DriverService service) {
		super();
		this.service = service;
		this.driver = service.getDriver();
		flipkartHomePage = new FlipkartHomePage(driver);
		flipkartCartPage = new FlipkartCartPage(driver);
		flipkartLoginPage = new FlipkartLoginPage(driver);
	}

	@Given("user navigate to flipkart application")
	public void user_navigate_to_flipkart_application() {
		driver.get(service.getReader().getFlipkartUrl());
	}

	@Given("user search for {string} in search box")
	public void user_search_for_in_search_box(String item) {
		flipkartLoginPage.cancelLogin();
		flipkartHomePage.searchItem(item);
	}

	@When("user click the first item")
	public void user_click_the_first_item() throws InterruptedException {
		flipkartHomePage.clickFirstItem();
	}

	@Then("user will be able to print the price of item")
	public void user_will_be_able_to_print_the_price_of_item() {
		flipkartHomePage.getPrice();
	}

	@When("user click on ADD TO CART to add the item in cart in guest mode")
	public void user_click_on_add_to_cart_to_add_the_item_in_cart_in_guest_mode() throws InterruptedException {
		flipkartCartPage.addItemToCart();
	}

	@When("user increase the quantity of item by one")
	public void user_increase_the_quantity_of_item_by() throws InterruptedException {
		flipkartCartPage.increaseQuantity(); 
	}

	@Then("user will be able to print the price after addition")
	public void user_will_be_able_to_print_the_price_after_addition() {
		flipkartCartPage.getPriceAfterQuantityIncrease();
	}
	

}
