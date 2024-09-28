package webApp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import webApp.utils.JavaScriptHelper;

public class AddFarmModalPage extends BasePage{
    @FindBy(xpath = "//div[text()='Add farm']")
    private WebElement addFarmSetUpPageTitle;
    @FindBy(xpath = "//input[@id='formBasicPassword']")
    private WebElement enterFarmNameTextField;
    @FindBy(xpath = "//iframe[@id='intercom-frame']")
    private WebElement successMessageFrame;
    @FindBy(xpath = "//div[text()='Farm Updated Successfully.']")
    private WebElement successMessage;
    @FindBy(xpath = "(//input[@name='FarmCoordinatesRadio'])[1]")
    private WebElement farmAddressRadioButton;
    @FindBy(xpath = "(//input[@name='FarmCoordinatesRadio'])[2]")
    private WebElement farmCoordinateRadioButton;
    @FindBy(css = ".css-1hwfws3")
    private WebElement selectAddressTextBox;
    @FindBy(xpath = "//label[text()='Find your address']//following::div[1]")
    private WebElement findAddressComponent;
    @FindBy(xpath = "//div[@id='react-select-2-option-0']")
    private WebElement firstAddress;
    @FindBy(xpath = "//input[@class='number']//following::*[name()='svg' and @xmlns='http://www.w3.org/2000/svg'][1]")
    private WebElement plusIcon;
    @FindBy(xpath = "//input[@class='number']")
    private WebElement yearOfDataTextBox;
    @FindBy(xpath = " (//*[name()='circle'])[13]")
    private WebElement enterPriseArable;
    @FindBy(xpath = "//button[@type='button' and text()='Save']")
    private WebElement saveButton;
    @FindBy(xpath = " //input[@id='txtFarmLatitude']")
    private WebElement farmLatitude;
    @FindBy(xpath = " //input[@id='txtFarmLongitude']")
    private WebElement farmLongitude;
    @FindBy(xpath = "//div[@data-testid='tail-spin-loading']")
    private WebElement loader;


private Actions actions;
private JavaScriptHelper javaScriptHelper;
    public AddFarmModalPage(WebDriver driver) {
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
        enterFarmNameTextField.sendKeys(farmName);
    }
    public void enterFarmAddress(String address){
        wait.until(ExpectedConditions.visibilityOf(findAddressComponent));
        staticWait(2000);
        javaScriptHelper.scrollUntilViewElement(selectAddressTextBox);
        actions.moveToElement(selectAddressTextBox).click().sendKeys(address).build().perform();
     //   selectAddressTextBox.sendKeys(address);
        selectPrePopulatedAddress();

    }

    private void selectPrePopulatedAddress(){
        wait.until(ExpectedConditions.elementToBeClickable(firstAddress));
        actions.moveToElement(firstAddress).click().build().perform();

    }
    public void selectFarmAddress(){
        wait.until(ExpectedConditions.elementToBeClickable(farmAddressRadioButton)).click();
    }
    public void selectCoordinate(){
        wait.until(ExpectedConditions.elementToBeClickable(farmCoordinateRadioButton)).click();
    }
    public void clickOnPlusIcon(){
        wait.until(ExpectedConditions.elementToBeClickable(yearOfDataTextBox));
        javaScriptHelper.scrollUntilViewElement(yearOfDataTextBox);
        plusIcon.click();
        plusIcon.click();
        staticWait(5000);
    }
    public void selectFirstEnterPrise(){
        wait.until(ExpectedConditions.elementToBeClickable(enterPriseArable));
        javaScriptHelper.scrollUntilViewElement(enterPriseArable);
        actions.moveToElement(enterPriseArable).click().build().perform();
    }
    public void clickOnSaveButton(){
        wait.until(ExpectedConditions.elementToBeClickable(saveButton));
        javaScriptHelper.scrollUntilViewElement(saveButton);
        staticWait(5000);
        wait.until(ExpectedConditions.visibilityOf(saveButton));
         saveButton.click();
    }
    public void enterLatitude(String latitudeValue){
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(farmLatitude)));
        javaScriptHelper.scrollUntilViewElement(farmLatitude);
        farmLatitude.click();
        farmLatitude.sendKeys(latitudeValue);

    }
    public void enterLongitude(String longitudeValue){
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(farmLongitude)));
        javaScriptHelper.scrollUntilViewElement(farmLongitude);
        farmLongitude.click();
        farmLongitude.sendKeys(longitudeValue);
    }
    public String isSuccessMessageDisplayed(){
         wait.until(ExpectedConditions.invisibilityOf(loader));
         driver.switchTo().frame(successMessage);
         return successMessage.getText();

    }

}
