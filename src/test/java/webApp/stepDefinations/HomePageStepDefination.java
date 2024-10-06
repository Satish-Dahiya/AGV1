package webApp.stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import webApp.context.TestContext;
import webApp.pages.HomePage;
import webApp.pages.PageFactory;

public class HomePageStepDefination {
    private final HomePage homePage;
    private final TestContext context;

    public HomePageStepDefination(TestContext context) {
        this.context = context;
        homePage= PageFactory.getHomePage(context.driver);
    }

    @Then("I should see home page")
    public void iShouldSeeHomePage() {
        Assert.assertTrue(homePage.isLogoDisplayed(),"home page is not rendering");
    }

    @When("I expand sandy setup link")
    public void iExpandSandySetupLink() {
        homePage.clickOnSandySetupLink();
    }

    @And("I click on {string} link")
    public void iClickOnLink(String linkToBeSelected) {
        homePage.clickOnSandySetUPOptions(linkToBeSelected);
    }
    @And("I click on {string} link button")
    public void iClickOnLinkbutton(String linkToBeSelected) {
        homePage.clickOnActivityServices(linkToBeSelected);
    }

    @Then("I should see farm setup page")
    public void iShouldSeeFarmSetupPage() {
    }
}
