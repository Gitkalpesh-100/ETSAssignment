package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "Features",
        glue = {"com.techReward.stepDefination", "com.framework.base"},
        plugin = {"pretty",
                "html:Reports/AutomationReport.html",
                "html:target/cucumber-reports/cucumber-pretty.html",
                "json:target/cucumber-reports/JsonReport/CucumberTestReport.json"
        }
        , tags = "@Functional")
public class TestNGTestRunner extends AbstractTestNGCucumberTests {

}
