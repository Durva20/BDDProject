package com.qa.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
features= {"src/test/resources"},
glue= {"com.qa.stepDefinition"})

public class testRunner {

}
