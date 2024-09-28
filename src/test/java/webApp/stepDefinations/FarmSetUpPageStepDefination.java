package webApp.stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import webApp.context.TestContext;
import webApp.pages.FarmSetUpPage;
import webApp.pages.PageFactory;

public class FarmSetUpPageStepDefination {
    private final FarmSetUpPage farmSetUpPage;
    private final TestContext context;

    public FarmSetUpPageStepDefination(TestContext context) {
        this.context = context;
        farmSetUpPage= PageFactory.getFarmSetUpPage(context.driver);
    }

    @Then("I should see {string} page")
    public void iShouldSeePage(String expectedTitle) {
        Assert.assertEquals(farmSetUpPage.getPageTitle(),expectedTitle);
    }

    @When("I click on Add farm")
    public void iClickOnAddFarm() {
        farmSetUpPage.clickOnAddFarm();
    }

    @And("I should redirect to {string} page")
    public void iShouldRedirectToPage(String expectedTitle) {
        Assert.assertEquals(farmSetUpPage.getPageTitle(),expectedTitle);
    }

    @When("I select page till max limit")
    public void iSelectPageTillMaxLimit() {
        farmSetUpPage.selectPageValue();
    }

    @When("I click on delete button for farm name as {string}")
    public void iClickOnDeleteButtonForFarmNameAs(String farmName) {
        farmSetUpPage.clickOnDeleteButton(farmName);
    }

    @When("I click on edit button for farm name as {string}")
    public void iClickOnEditButtonForFarmNameAs(String farmName) {
        farmSetUpPage.clickOnEditButton(farmName);
    }
}
