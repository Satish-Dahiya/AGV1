package webApp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
    String url;
    @FindBy(xpath = "//input[@id='Password']")
    private WebElement passwordTextField;
    @FindBy(xpath = "//input[@id='EmailId']")
    private WebElement emailAddressTextField;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement signInButton;
    public LoginPage(WebDriver driver) {
        super(driver);
    }


  public void enterEmailAddress(String emailAddress){
        wait.until(ExpectedConditions.visibilityOf(emailAddressTextField));
      emailAddressTextField.click();
      emailAddressTextField.sendKeys(emailAddress);

  }

    public void enterPassword(String password){
        wait.until(ExpectedConditions.visibilityOf(passwordTextField));
        passwordTextField.click();
        passwordTextField.sendKeys(password);

    }
public  void clickOnSignIn(){
        wait.until(ExpectedConditions.elementToBeClickable(signInButton)).click();
}

}
