package webApp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SelectAccountModalComponent extends BasePage{
    @FindBy(xpath = "//div[@id='DIV_OrganizationsForUser']//child::div[@class='modal-content']")
    private WebElement selectAccountModal;
    @FindBy(xpath = "(//div[@class='radio radio-primary']//label)[1]")
    private WebElement selectCompanyRadioButton;
    @FindBy(xpath = "//button[@id='btnSelectOrganization']")
    private WebElement selectAccountButton;
    public SelectAccountModalComponent(WebDriver driver) {
        super(driver);
    }
    public boolean isSelectAccountModalDisplayed(){
     return    wait.until(ExpectedConditions.visibilityOf(selectAccountModal)).isDisplayed();
    }
    public void selectBayerAdminRadioButton(){
        wait.until(ExpectedConditions.elementToBeClickable(selectCompanyRadioButton)).click();
    }
    public void clickOnSelectAccountButton(){
        wait.until(ExpectedConditions.elementToBeClickable(selectAccountButton)).click();
    }
}
