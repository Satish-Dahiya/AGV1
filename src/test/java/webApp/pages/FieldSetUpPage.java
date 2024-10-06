package webApp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import webApp.utils.JavaScriptHelper;

public class FieldSetUpPage extends BasePage{
    @FindBy(xpath = "//h3[contains(text(),'Setup- Fields')]")
    private WebElement fieldSetUpPage;
    @FindBy(xpath = "(//div[contains(@class,'row')]//child::div[text()='##Test_Far']//following::button[text()='Manage data'])[1]")
    private WebElement manageDataButton;
JavaScriptHelper javaScriptHelper;
Actions actions;
    public FieldSetUpPage(WebDriver driver) {
        super(driver);
        javaScriptHelper=new JavaScriptHelper(driver);
        actions=new Actions(driver);
    }
    public String getPageTitle(){
        return wait.until(ExpectedConditions.visibilityOf(fieldSetUpPage)).getText();
    }
   public void clickOnMangeData(String farmName){
       // WebElement element=driver.findElement(By.xpath("//div[text()='"+farmName+"']//following::button[text()='Manage data'][1]"));
       staticWait(3000);
        wait.until(ExpectedConditions.visibilityOf(manageDataButton));
javaScriptHelper.scrollUntilViewElement(manageDataButton);
       manageDataButton.click();
   }
}
