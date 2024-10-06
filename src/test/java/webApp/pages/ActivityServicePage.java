package webApp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import webApp.utils.JavaScriptHelper;

public class ActivityServicePage extends BasePage{
    @FindBy(xpath = "(//div[contains(text(),'Carbon')])[1]")
    private WebElement activityServicePage;
    @FindBy(xpath = "(//button[text()='Manage data'])[1]")
    private WebElement manageDataButton;
JavaScriptHelper javaScriptHelper;
Actions actions;
    public ActivityServicePage(WebDriver driver) {
        super(driver);
        javaScriptHelper=new JavaScriptHelper(driver);
        actions=new Actions(driver);
    }
    public String getPageTitle(){
        return wait.until(ExpectedConditions.visibilityOf(activityServicePage)).getText();
    }

   public void clickOnMangeData(){
       staticWait(3000);
        wait.until(ExpectedConditions.visibilityOf(manageDataButton));
       javaScriptHelper.scrollUntilViewElement(manageDataButton);
       manageDataButton.click();
   }
}
