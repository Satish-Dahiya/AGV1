package webApp.stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import webApp.context.TestContext;
import webApp.pages.LoginPage;
import webApp.pages.PageFactory;
import webApp.utils.ConfigurationLoader;

public class LoginPageStepDefination {
    private final LoginPage loginPage;
    private final TestContext context;

    public LoginPageStepDefination(TestContext context){
        this.context = context;
        loginPage = PageFactory.getLoginPage(context.driver);
    }

    @Given("I am login page")
    public void iAmLoginPage() {
        loginPage.load(ConfigurationLoader.getInstance().getUrl());
    }

    @When("I enter email address")
    public void iEnterUserName() {
loginPage.enterEmailAddress(ConfigurationLoader.getInstance().getUserName());
    }

    @And("I enter password")
    public void iEnterPassword() {
        loginPage.enterPassword(ConfigurationLoader.getInstance().getPassword());
    }

    @And("click on login button")
    public void clickOnLoginButton() {
        loginPage.clickOnSignIn();
    }
}
