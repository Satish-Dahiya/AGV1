package webApp.stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webApp.context.TestContext;
import webApp.pages.ActivityServicePage;
import webApp.pages.CarbonSetupPage;
import webApp.pages.PageFactory;

public class CarbonSetUpPageStepDefination {
    private final CarbonSetupPage carbonSetupPage;
    private final TestContext context;

    public CarbonSetUpPageStepDefination(TestContext context) {
        this.context = context;
      carbonSetupPage=  PageFactory.getCarbonSetupPage(context.driver);
    }

    @Then("I should see carbon setup Page")
    public void iShouldSeeFieldSetupPage() {
        carbonSetupPage.getPageTitle();
    }

    @When("I click on manage data for carbon service")
    public void iClickOnManageButtonBasedOnFarmName() {
        carbonSetupPage.clickOnMangeData();
    }
}
