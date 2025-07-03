package com.qa.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features= {"src/test/resources/Feature/order.feature"},
glue= {"com.qa.stepDefinition","com.qa.hooks"},

tags= "@smoke",
plugin= {"pretty",
		"json:target/MyReports/report.json",
		"junit:target/MyReports/report.xml"},
dryRun=true

		)
public class AmazonOrder {

}
