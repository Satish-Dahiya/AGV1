package webApp.pages;

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
    public void clickOnSaveButton(){
        wait.until(ExpectedConditions.elementToBeClickable(saveButton));
        javaScriptHelper.scrollUntilViewElement(saveButton);
        staticWait(5000);
        wait.until(ExpectedConditions.visibilityOf(saveButton));
        saveButton.click();
    }
}
