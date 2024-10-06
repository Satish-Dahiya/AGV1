package webApp.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;



@CucumberOptions(
            features = {"src/test/resources/webApp"},
          // plugin = {"html:target/cucumber/cucumber.html"},
        // plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        plugin = { "pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },

        glue = {"webApp"},
            tags = "@EditMultiple"



    )
    public class ApplicationRunner extends AbstractTestNGCucumberTests {

    }

