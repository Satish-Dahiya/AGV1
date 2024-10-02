package webApp.factory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;

public class DriverFactory {
  private static  WebDriver driver;
    public static WebDriver initializeDriver(String browser){
        switch (browser) {
            case "chrome":
                System.out.println(browser);
                // INIT CHROME OPTIONS
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                Map< String, Object > prefs = new HashMap< String, Object >();
                Map < String, Object > profile = new HashMap < String, Object > ();
                Map < String, Object > contentSettings = new HashMap < String, Object > ();
                contentSettings.put("geolocation",2);
                profile.put("managed_default_content_settings",contentSettings);
                prefs.put("profile",profile);
                options.setExperimentalOption("prefs",prefs);
                driver = new ChromeDriver();
            break;
            case "firefox":
                FirefoxOptions firefoxOptions=new FirefoxOptions();
                FirefoxProfile firefoxProfile=new FirefoxProfile();
                firefoxOptions.setProfile(firefoxProfile);
                driver = new FirefoxDriver(firefoxOptions);
                break;
             default:throw new IllegalStateException("INVALID BROWSER: " + browser);
        }
        driver.manage().window().maximize();
        return driver;
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
