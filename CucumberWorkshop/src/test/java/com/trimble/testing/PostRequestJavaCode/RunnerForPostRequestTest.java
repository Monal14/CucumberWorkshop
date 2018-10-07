package com.trimble.testing.PostRequestJavaCode;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
features = {
				"src/test/resources/com/trimble/testing/PostRequestJavaCode/" }, glue = {
						"com/trimble/testing/PostRequestJavaCode/" }
						/*plugin={"pretty",
								"html:target/cucumber-htmlreport",
								"json:target/cucumber-report6.json",
								"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
						}*/)
public class RunnerForPostRequestTest {

	
}
