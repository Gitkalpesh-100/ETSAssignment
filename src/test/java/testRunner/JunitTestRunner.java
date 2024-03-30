package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features",
        glue = {"com.techReward.stepDefination", "com.framework.base"},
        plugin = {"pretty",
                "html:Reports/AutomationReport.html",
                "html:target/cucumber-reports/cucumber-pretty.html",
                "json:target/cucumber-reports/JsonReport/CucumberTestReport.json"
        }
        ,
        tags = "@Functional"
//        tags = "@Negative1"
         )

public class JunitTestRunner {

}
