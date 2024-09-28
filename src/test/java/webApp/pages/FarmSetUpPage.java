package webApp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import webApp.utils.JavaScriptHelper;

public class FarmSetUpPage extends BasePage{
    @FindBy(xpath = "//div[text()='Farm setup']")
    private WebElement farmSetUpPageTitle;
    @FindBy(xpath = "//button[normalize-space()='+ Add farm']")
    private WebElement addFarmButton;
    @FindBy(xpath = "//div[contains(@class,'indicatorContainer')]")
    private WebElement pagesDDL;
    @FindBy(xpath = "//div[contains(@id,'react-select-23-option') and text()='100']")
    private WebElement ddlValue;
    @FindBy(xpath = "//h6[text()='A1 A2 Konefał']")
    private WebElement farmNameComponent;
    @FindBy(xpath = "(//h6[normalize-space()='A1 A2 Konefał']//following::span[contains(@class,'circle-icon mt-1')]//*[name()='svg']//*[local-name()='path'])[2]")
    private WebElement deleteButton;
    @FindBy(xpath = "(//h6[normalize-space()='A1 A2 Konefał']//following::span[contains(@class,'circle-icon mt-1')]//*[name()='svg']//*[local-name()='path'])[1]")
    private WebElement editButton;
    private Actions actions;
    private JavaScriptHelper javaScriptHelper;
    public FarmSetUpPage(WebDriver driver) {

        super(driver);
        actions=new Actions(driver);
        javaScriptHelper=new JavaScriptHelper(driver);
    }
    public String getPageTitle(){
       return wait.until(ExpectedConditions.visibilityOf(farmSetUpPageTitle)).getText();
    }
    public void clickOnAddFarm(){
        wait.until(ExpectedConditions.elementToBeClickable(addFarmButton)).click();
    }
    public void selectPageValue(){
        wait.until(ExpectedConditions.elementToBeClickable(pagesDDL));
        javaScriptHelper.scrollUntilViewElement(pagesDDL);
        pagesDDL.click();
        actions.moveToElement(ddlValue).click().build().perform();

    }
    public void clickOnDeleteButton(String farmName){
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h6[text()='"+farmName+"']"))));
            javaScriptHelper.scrollUntilViewElement(driver.findElement(By.xpath("//h6[text()='"+farmName+"']")));
            staticWait(2000);
            actions.moveToElement(driver.findElement(By.xpath("(//h6[normalize-space()='"+farmName+"']//following::span[contains(@class,'circle-icon mt-1')]//*[name()='svg']//*[local-name()='path'])[2]"))).click().build().perform();

        }


    public void clickOnEditButton(String farmName){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h6[text()='"+farmName+"']//ancestor::div[2]"))));
        staticWait(2000);
        javaScriptHelper.scrollUntilViewElement(driver.findElement(By.xpath("//h6[text()='"+farmName+"']//ancestor::div[2]")));
        staticWait(2000);
        actions.moveToElement(driver.findElement(By.xpath("(//h6[normalize-space()='"+farmName+"']//following::span[contains(@class,'circle-icon mt-1')]//*[name()='svg']//*[local-name()='path'])[1]"))).click().build().perform();

    }
}
