package webApp.hooks;

import io.cucumber.java.*;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import webApp.context.TestContext;
import webApp.factory.DriverFactory;

import java.io.File;
import java.io.IOException;

public class MyHooks {
    private static WebDriver driver;
    private final TestContext context;

    public MyHooks(TestContext context){
        this.context = context;
    }

    @Before("@componentTest")
    public void before(Scenario scenario){
        System.out.println("BEFORE: THREAD ID : " + Thread.currentThread().getId() + "," +
                "SCENARIO NAME: " + scenario.getName());
        driver = DriverFactory.initializeDriver(System.getProperty("browser", "chrome"));
        context.driver = driver;
    }

    @After("@componentTest")
    public void after(Scenario scenario){
        System.out.println("AFTER: THREAD ID : " + Thread.currentThread().getId() + "," +
                "SCENARIO NAME: " + scenario.getName());
    //   driver.quit();
    }
    @AfterStep
    public void AddScreenshot(Scenario scenario) throws IOException
    {
       // WebDriver driver =testContextSetup.testBase.WebDriverManager();
        if(scenario.isFailed())
        {
            //screenshot
            File sourcePath= 	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         //   byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
          //  scenario.attach(fileContent, "image/png", "image");

        }

    }
}
