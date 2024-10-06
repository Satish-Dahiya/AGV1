package webApp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import webApp.utils.JavaScriptHelper;

public class CropingSetupPage extends BasePage{
    @FindBy(xpath = "(//h3[contains(text(),'Cropping')])[1]")
    private WebElement carbonSetUpPage;
    @FindBy(xpath = "//div[contains(@id,'react-select') and text()='Select farms']")
    private WebElement selectFarmDDL;
    @FindBy(xpath = "//div[contains(@id,'react-select') and text()='Select field']")
    private WebElement selectFieldDDL;
    @FindBy(xpath = "(//button[text()='Manage data'])[2]")
    private WebElement manageDataButton;
JavaScriptHelper javaScriptHelper;
Actions actions;
    public CropingSetupPage(WebDriver driver) {
        super(driver);
        javaScriptHelper=new JavaScriptHelper(driver);
        actions=new Actions(driver);
    }
    public String getPageTitle(){
        return wait.until(ExpectedConditions.visibilityOf(carbonSetUpPage)).getText();
    }

   public void clickOnMangeData(){
       staticWait(3000);
        wait.until(ExpectedConditions.visibilityOf(manageDataButton));
       javaScriptHelper.scrollUntilViewElement(manageDataButton);
       manageDataButton.click();
   }
   public void selectFarm(String ddlValue){
        wait.until(ExpectedConditions.elementToBeClickable(selectFarmDDL));
        selectFarmDDL.click();
        actions.moveToElement(driver.findElement(By.xpath("//div[@class='dropdown-value'and text()='"+ddlValue+"']"))).click().build().perform();
   }
    public void selectField(String ddlValue){
        wait.until(ExpectedConditions.elementToBeClickable(selectFieldDDL));
        selectFieldDDL.click();
        actions.moveToElement(driver.findElement(By.xpath("//div[@class='dropdown-value'and text()='##Test_Far']"))).click().build().perform();
    }
}
