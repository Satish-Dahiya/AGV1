package webApp.stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webApp.context.TestContext;
import webApp.pages.EnterPriseDataPage;
import webApp.pages.PageFactory;

public class EnterPriseDataStepDefination {
    private final EnterPriseDataPage enterPriseDataPage;
    private final TestContext context;

    public EnterPriseDataStepDefination(TestContext context) {
        this.context = context;
        enterPriseDataPage= PageFactory.getEnterPriseDataPage(context.driver);
    }

    @Then("I should see sandy setup page")
    public void iShouldSeeSandySetupPage() {
        enterPriseDataPage.getPageTitle();
    }

    @When("I click on manage data link")
    public void iClickOnManageDataLink() {
        enterPriseDataPage.clickOnManageData();
    }


}
