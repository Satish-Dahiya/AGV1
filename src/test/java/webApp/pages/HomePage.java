package webApp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class HomePage extends BasePage{
    @FindBy(xpath = "(//img[@class='logo-img'])[1]")
    private WebElement logo;
    @FindBy(xpath = "//li//child::a[@href='#SANDYSETUP']")
    private WebElement sandySetUpLink;
    @FindBy(xpath = "//ul[@class='nav sub-menu']")
    private WebElement sandySetUpLinkSubMenusComponent;
    private Actions actions;
    public HomePage(WebDriver driver) {
        super(driver);
        actions = new Actions(driver);
    }
    public boolean isLogoDisplayed(){
       return wait.until(ExpectedConditions.visibilityOf(logo)).isDisplayed();
    }
    public void clickOnSandySetupLink(){
        wait.until(ExpectedConditions.elementToBeClickable(sandySetUpLink));
        staticWait(2000);
        sandySetUpLink.click();
    }
    public void clickOnSandySetUPOptions(String linkToBeClicked){
        wait.until(ExpectedConditions.visibilityOf(sandySetUpLinkSubMenusComponent));
        staticWait(2000);
        WebElement element=driver.findElement(By.xpath("//li//a[text()='"+linkToBeClicked+"']"));
        System.out.println(element);
        actions.moveToElement(element).click().build().perform();

    }
}
