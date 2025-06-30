package com.qa.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step {

	
	@Given("I have a search field on amazon page")
	public void i_have_a_search_field_on_amazon_page() {
	  System.out.println("macbook");
	}

	@When("^I search for a product with \"([^\"]+)\" and price (\\d+)$")
	public void i_search_for_a_product_with_and_price(String productName, Integer price) {
	   System.out.println("macbook pro price is 1000");
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String string) {
	    System.out.println("Search results returned");
	}

}
