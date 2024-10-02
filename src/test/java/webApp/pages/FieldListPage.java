package webApp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FieldListPage extends BasePage{
    @FindBy(xpath = "//div[@class='pl-0 col']")
    private WebElement addFarmSetUpPageTitle;
    @FindBy(xpath = "//button[text()='+ Add field']")
    private WebElement addFieldButton;
    @FindBy(xpath = "(//div[text()='fieldone']//following::*[name()='svg' and @data-testid='DeleteOutlineIcon' ])[1]")
    private WebElement deleteButton;
    @FindBy(xpath = "(//div[text()='fieldone']//following::*[name()='svg' and @data-testid='EditOutlinedIcon' ])[1]")
    private WebElement editFieldButton;
    @FindBy(xpath = "//div[@data-testid='tail-spin-loading']")
    private WebElement loader;
    @FindBy(xpath = "//div[@class='modal-content']")
    private WebElement deleteModal;
    @FindBy(xpath = "//button[text()='Yes, delete']")
    private WebElement yesDeleteButton;

    @FindBy(xpath = "//iframe[@id='intercom-frame']")
    private WebElement successMessageFrame;
    @FindBy(xpath = "//div[text()='Your records have been successfully deleted.']")
    private WebElement successMessage;
    private Actions actions;
    public FieldListPage(WebDriver driver) {
        super(driver);
        actions=new Actions(driver);
    }
    public boolean getPageTitle(){
        return wait.until(ExpectedConditions.visibilityOf(addFarmSetUpPageTitle)).isDisplayed();
    }
    public void clickOnAddField(){
        staticWait(5000);
        wait.until(ExpectedConditions.elementToBeClickable(addFieldButton)).click();
    }
    public void clickOnEditButton(String fieldName){
        wait.until(ExpectedConditions.visibilityOf(addFarmSetUpPageTitle)).isDisplayed();
        staticWait(5000);
driver.findElement(By.xpath("(//div[text()='"+fieldName+"']//following::*[name()='svg' and @data-testid='EditOutlinedIcon' ])[1]")).click();
    }
    public void clickOnDeleteButton(String fieldName){
        wait.until(ExpectedConditions.visibilityOf(addFarmSetUpPageTitle)).isDisplayed();
        staticWait(5000);
        // wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(editFieldButton)));
        driver.findElement(By.xpath("(//div[text()='"+fieldName+"']//following::*[name()='svg' and @data-testid='DeleteOutlineIcon' ])[1]")).click();
    }
    public void clickOnYesDeleteButton(){
        wait.until(ExpectedConditions.visibilityOf(deleteModal));
        yesDeleteButton.click();
    }
    public String getSuccessMessage(){
        wait.until(ExpectedConditions.invisibilityOf(loader));
        wait.until(ExpectedConditions.invisibilityOf(successMessageFrame));
        return successMessage.getText();

    }
}
