package webApp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import webApp.utils.JavaScriptHelper;

public class EditFieldPage extends BasePage{
    @FindBy(xpath = "//div[text()='Edit']")
    private WebElement editFieldPageTitle;
    @FindBy(xpath = "//input[@id='fieldName']")
    private WebElement fieldNameTextField;
    @FindBy(xpath = "//button[@type='button' and text()='Save']")
    private WebElement saveButton;
    @FindBy(xpath = "//div[@data-testid='tail-spin-loading']")
    private WebElement loader;
    @FindBy(xpath = "//iframe[@id='intercom-frame']")
    private WebElement successMessageFrame;
    @FindBy(xpath = "//div[text()='Your records have been successfully updated.']")
    private WebElement successMessage;
    @FindBy(xpath = "//input[@id='fieldSize']")
    private WebElement fieldSizeTextBox;
    @FindBy(xpath = "(//div[contains(@id,'react-select') and text()='Select management type'])[1]")
    private WebElement selectManagementDDL;
    @FindBy(xpath = "//div[contains(@id,'react-select') and text()='Select soil peat']")
    private WebElement selectSoilPeat;
    @FindBy(xpath = "//div[contains(@id,'react-select') and text()='Select land use change']")
    private WebElement landUseLocation;
    @FindBy(xpath = "(//div[contains(@id,'react-select') and text()='Since'])[1]")
    private WebElement since;
    @FindBy(xpath = "(//div[contains(@id,'react-select') and text()='Add Primary land use'])[1]")
    private WebElement primaryLandUseCategory;
    private Actions actions;
    private JavaScriptHelper javaScriptHelper;
    public EditFieldPage(WebDriver driver) {
        super(driver);
        actions=new Actions(driver);
        javaScriptHelper=new JavaScriptHelper(driver);
    }
    public String getPageTitle(){
        return wait.until(ExpectedConditions.visibilityOf(editFieldPageTitle)).getText();
    }
    public void updateFieldName(String fieldName){
        wait.until(ExpectedConditions.visibilityOf(fieldNameTextField));
        fieldNameTextField.click();
        fieldNameTextField.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        fieldNameTextField.sendKeys(fieldName);
    }
    public String getSuccessMessage(){
        wait.until(ExpectedConditions.invisibilityOf(loader));
        wait.until(ExpectedConditions.invisibilityOf(successMessageFrame));
        return successMessage.getText();

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
        staticWait(5000);
        wait.until(ExpectedConditions.visibilityOf(selectSoilPeat)).click();
        actions.moveToElement(driver.findElement(By.xpath("//div[contains(@id,'option-1') and text()='"+DDLValue+"']"))).click().build().perform();
    }
    public void setLandUseLocation(String DDLValue){
        staticWait(5000);
        wait.until(ExpectedConditions.elementToBeClickable(landUseLocation)).click();
        actions.moveToElement(driver.findElement(By.xpath("(//div[contains(@id,'option-1') and text()='"+DDLValue+"'])[1]"))).click().build().perform();
    }
    public void setPrimaryLandUseCategory(String DDLValue){
        staticWait(5000);
        wait.until(ExpectedConditions.visibilityOf(primaryLandUseCategory)).click();
        actions.moveToElement(driver.findElement(By.xpath("//div[contains(@id,'option-0') and text()='"+DDLValue+"'] "))).click().build().perform();

    }
    public void setPrimaryLandUseCategory1(String DDLValue){
        staticWait(5000);
        wait.until(ExpectedConditions.visibilityOf(primaryLandUseCategory)).click();
        actions.moveToElement(driver.findElement(By.xpath("//div[contains(@id,'option-2') and text()='"+DDLValue+"'] "))).click().build().perform();

    }
    public void setSinceValue(String DDLValue){
        staticWait(5000);
        wait.until(ExpectedConditions.visibilityOf(since)).click();
        actions.moveToElement(driver.findElement(By.xpath("//div[contains(@id,'option-0') and text()='"+DDLValue+"'] "))).click().build().perform();

    }
    public void setSinceValue1(String DDLValue){
        staticWait(5000);
        wait.until(ExpectedConditions.visibilityOf(since)).click();
        actions.moveToElement(driver.findElement(By.xpath("//div[contains(@id,'option-1') and text()='"+DDLValue+"'] "))).click().build().perform();

    }

    public void clickOnSaveButton(){
        wait.until(ExpectedConditions.elementToBeClickable(saveButton));
        javaScriptHelper.scrollUntilViewElement(saveButton);
        staticWait(5000);
        wait.until(ExpectedConditions.visibilityOf(saveButton));
        saveButton.click();
    }
}
