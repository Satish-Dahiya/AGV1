package webApp.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptHelper {
  public static  JavascriptExecutor js;
  private  WebDriver driver;
  public JavaScriptHelper(WebDriver driver){
      this.driver=driver;

  }
    public  void scrollUntilViewElement(WebElement element) {

        executeScript("arguments[0].scrollIntoView();", element);
    }
    public  void clickOnElement(WebElement element) {

        JavascriptExecutor executor=(JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }
    public  void highlightElement(WebElement element) {
        //use executeScript() method and pass the arguments
        //Here i pass values based on css style. Yellow background color with solid red color border.
        js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');", element);
    }
    public Object executeScript(String script,Object...agrs){
      JavascriptExecutor executor=(JavascriptExecutor) driver;
      return executor.executeScript(script,agrs);

    }
    public Object executeScript(String script){
        JavascriptExecutor executor=(JavascriptExecutor) driver;
        return executor.executeScript(script);

    }
}

