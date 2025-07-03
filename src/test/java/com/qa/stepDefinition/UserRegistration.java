package com.qa.stepDefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistration {
	
	@Given("User is on registration page")
	public void user_is_on_registration_page() {
	   System.out.println("User navigates registration page");
	}

	@When("User enters following user details")
	public void user_enters_following_user_details(DataTable dataTable) {
	  List<List<String>> userList =dataTable.asLists(String.class);
	  for(List<String> e : userList)
	  {
		  System.out.println(e);
	  }
	}

	@Then("User registration successful")
	public void user_registration_successful() {
	  System.out.println("Registration is successful");
	}
	
	@When("User enters following user details with columns")
	public void user_enters_following_user_details_with_columns(DataTable dataTable) {
	   List<Map<String,String>> userList=dataTable.asMaps(String.class, String.class);
	   //System.out.println(userMap);
	   for(Map<String,String> e:userList)
	   {
		   System.out.println(e.get("FirstName"));
		   System.out.println(e.get("LastName"));
		   System.out.println(e.get("City"));
		   System.out.println(e.get("Phone"));
		   
	   }
	}

}
