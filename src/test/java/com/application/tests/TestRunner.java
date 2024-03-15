package com.application.tests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features", glue= {"com.application.tests","com.framework.base"}, plugin= {"pretty","html:Reports/AutomationReport.html"}
,tags="@Regression"
)

public class TestRunner {

}
