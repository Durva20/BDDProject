package com.qa.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features= {"src/test/resources/Feature/CabBooking.feature"},
glue= {"com.qa.stepDefinition"},
tags= "@smoke and @regression",
plugin= {"pretty"})


public class UberTest {

}
