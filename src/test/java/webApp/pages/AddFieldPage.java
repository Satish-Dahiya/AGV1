package webApp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import webApp.utils.JavaScriptHelper;

public class AddFieldPage extends BasePage{
    @FindBy(xpath = "//div[text()='Add']")
    private WebElement addFieldPageTitle;
    @FindBy(xpath = "//input[@id='fieldName']")
    private WebElement fieldNameTextBox;
    @FindBy(xpath = "//input[@id='fieldSize']")
    private WebElement fieldSizeTextBox;
    @FindBy(xpath = "(//div[@class='css-1lfj4wt-indicatorContainer']//following::*[name()='svg' and @class='css-8mmkcg'])[1]")
    private WebElement selectManagementDDL;
    @FindBy(xpath = "(//div[@class='css-1lfj4wt-indicatorContainer']//following::*[name()='svg' and @class='css-8mmkcg'])[3]")
    private WebElement selectSoilPeat;
    @FindBy(xpath = "(//div[@class='css-1lfj4wt-indicatorContainer']//following::*[name()='svg' and @class='css-8mmkcg'])[5]")
    private WebElement landUseLocation;
    @FindBy(xpath = "(//div[contains(@id,'react-select') and text()='Since'])[1]")
    private WebElement since;
    @FindBy(xpath = "(//div[contains(@id,'react-select') and text()='Since'])[2]")
    private WebElement since1;
    @FindBy(xpath = "(//div[contains(@id,'react-select') and text()='Add Primary land use'])[1]")
    private WebElement primaryLandUseCategory;
    @FindBy(xpath = "(//div[contains(@id,'react-select') and text()='Add Primary land use'])[2]")
    private WebElement primaryLandUseCategoryOne;

    @FindBy(xpath = "//button[text()='Save']")
    private WebElement saveButton;
    @FindBy(xpath = "//div[@data-testid='tail-spin-loading']")
    private WebElement loader;
    @FindBy(xpath = "//iframe[@id='intercom-frame']")
    private WebElement successMessageFrame;
    @FindBy(xpath = "//div[text()='Your records have been successfully added.']")
    private WebElement successMessage;
    private Actions actions;
    private JavaScriptHelper javaScriptHelper;

    public AddFieldPage(WebDriver driver) {
        super(driver);
        actions=new Actions(driver);
        javaScriptHelper=new JavaScriptHelper(driver);
    }
    public String getPageTitle(){
        return wait.until(ExpectedConditions.visibilityOf(addFieldPageTitle)).getText();
    }
    public void enterFieldName(String fieldName){
        wait.until(ExpectedConditions.visibilityOf(fieldNameTextBox)).click();
        fieldNameTextBox.sendKeys(fieldName);
    }
    public void enterFieldSize(String fieldSize){
        wait.until(ExpectedConditions.visibilityOf(fieldSizeTextBox)).click();
        fieldSizeTextBox.sendKeys(fieldSize);
    }
    public void setSelectManagementDDL(String DDLValue){
        wait.until(ExpectedConditions.visibilityOf(selectManagementDDL)).click();
        actions.moveToElement(driver.findElement(By.xpath(("//div[contains(@id,'listbox')]//div[text()='"+DDLValue+"']")))).click().build().perform();
    }
    public void setSelectSoilPeat(String DDLValue){
        wait.until(ExpectedConditions.visibilityOf(selectSoilPeat)).click();
        actions.moveToElement(driver.findElement(By.xpath("(//div[text()='"+DDLValue+"'])[1]"))).click().build().perform();
    }
    public void setLandUseLocation(String DDLValue){
        wait.until(ExpectedConditions.visibilityOf(landUseLocation)).click();
        actions.moveToElement(driver.findElement(By.xpath("(//div[text()='"+DDLValue+"'])[1]"))).click().build().perform();
    }
    public void setPrimaryLandUseCategory(String DDLValue){
        staticWait(5000);
        wait.until(ExpectedConditions.visibilityOf(primaryLandUseCategory)).click();
        actions.moveToElement(driver.findElement(By.xpath("//div[contains(@id,'option-0') and text()='"+DDLValue+"'] "))).click().build().perform();

    }
    public void setPrimaryLandUseCategory1(String DDLValue){
        staticWait(5000);
        wait.until(ExpectedConditions.visibilityOf(primaryLandUseCategoryOne)).click();
        actions.moveToElement(driver.findElement(By.xpath("//div[contains(@id,'option-0') and text()='"+DDLValue+"'] "))).click().build().perform();

    }
    public void setSinceValue(String DDLValue){
        staticWait(5000);
        wait.until(ExpectedConditions.visibilityOf(since)).click();
        actions.moveToElement(driver.findElement(By.xpath("//div[contains(@id,'option-0') and text()='"+DDLValue+"'] "))).click().build().perform();

    }
    public void setSinceValue1(String DDLValue){
        staticWait(5000);
        wait.until(ExpectedConditions.visibilityOf(since1)).click();
        actions.moveToElement(driver.findElement(By.xpath("//div[contains(@id,'option-0') and text()='"+DDLValue+"'] "))).click().build().perform();

    }
    public void clickOnSaveButton(){
        wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
    }
    public String getSuccessMessage(){
        wait.until(ExpectedConditions.invisibilityOf(loader));
        wait.until(ExpectedConditions.invisibilityOf(successMessageFrame));
        return successMessage.getText();

    }
}
