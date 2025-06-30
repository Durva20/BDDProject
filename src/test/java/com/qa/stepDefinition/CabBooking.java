package com.qa.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CabBooking {
	
	@Given("User wants to select car type {string} from uber application")
	public void user_wants_to_select_car_type_from_uber_application(String CarType) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Car type selected by user:"+CarType);
	}

	@When("User selects car {string} and picjkup point {string} and drop location {string}")
	public void user_selects_car_and_picjkup_point_and_drop_location(String CarType, String pickup, String drop) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Car type selected by user:"+CarType+"pickup selected by user:"+pickup+"drop selected by user:"+drop);
	}

	@Then("Driver starts the journey")
	public void driver_starts_the_journey() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Journey started");
	}

	@And("Driver ends the journey")
	public void driver_ends_the_journey() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Journey ended");
	}

	@Then("User pays {int} rupees")
	public void user_pays_rupees(Integer Fare) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Fare paid"+Fare);
	}

}
