package com.qa.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features= {"src/test/resources/Feature/order.feature"},
glue= {"com.qa.stepDefinition","com.qa.hooks"},
//tags= "@smoke and @regression",
plugin= {"pretty"})
public class AmazonOrder {

}
