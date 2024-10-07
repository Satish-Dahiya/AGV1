package webApp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import webApp.utils.JavaScriptHelper;

public class EditFarmPage extends BasePage{
    @FindBy(xpath = "//div[text()='Edit farm']")
    private WebElement addFarmSetUpPageTitle;
    @FindBy(xpath = "//input[@id='formBasicPassword']")
    private WebElement enterFarmNameTextField;
    @FindBy(xpath = "//div[@data-testid='tail-spin-loading']")
    private WebElement loader;
    @FindBy(xpath = "//iframe[@id='intercom-frame']")
    private WebElement successMessageFrame;
    @FindBy(xpath = "//div[contains(text(),'Farm Updated Successfully'])")
    private WebElement successMessage;
    @FindBy(xpath = "//button[@type='button' and text()='Save']")
    private WebElement saveButton;
    private Actions actions;
    private JavaScriptHelper javaScriptHelper;
    public EditFarmPage(WebDriver driver) {
        super(driver);
        actions=new Actions(driver);
        javaScriptHelper=new JavaScriptHelper(driver);
    }
    public String getPageTitle(){
        return wait.until(ExpectedConditions.visibilityOf(addFarmSetUpPageTitle)).getText();
    }
    public void enterFarmName(String farmName){
        wait.until(ExpectedConditions.visibilityOf(enterFarmNameTextField));
        enterFarmNameTextField.click();
        enterFarmNameTextField.clear();
        enterFarmNameTextField.sendKeys(farmName);
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
saveButton.click();
    }
}
