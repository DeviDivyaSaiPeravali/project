package com.saucerunner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/Sauce/sauce.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@TS_05"},
		glue = {"com.saucestepdef"},
		monochrome = true
		)
public class SauceNav {

}
