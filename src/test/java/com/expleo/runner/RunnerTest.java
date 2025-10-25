package com.expleo.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                features = {"src/test/resources/Features/CreateRepository.feature"},
                glue = {"com.expleo.steps"},
                //dryRun = true, //this is used to find the missing step definition
               // publish = true, // this is used to publish the report
                plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber-report.json"},
                tags = "@smoke or @valid"

        )
public class RunnerTest extends AbstractTestNGCucumberTests {
}
