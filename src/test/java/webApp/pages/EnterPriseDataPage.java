package webApp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EnterPriseDataPage extends BasePage{
    @FindBy(xpath = "//h3[text()='Sandy Setup']")
    private WebElement enterPriseSetUpTitle;
    @FindBy(xpath = "(//button[normalize-space()='Manage data'])[1]")
    private WebElement manageDataButton;
    public EnterPriseDataPage(WebDriver driver) {
        super(driver);
    }
    public String getPageTitle(){
        return wait.until(ExpectedConditions.visibilityOf(enterPriseSetUpTitle)).getText();
    }
    public void clickOnManageData(){
        wait.until(ExpectedConditions.elementToBeClickable(manageDataButton)).click();
    }
}
