package webApp.stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webApp.context.TestContext;
import webApp.pages.ActivityServicePage;
import webApp.pages.PageFactory;

public class ActivitesServivePageStepDefination {
    private final ActivityServicePage activityServicePage;
    private final TestContext context;

    public ActivitesServivePageStepDefination(TestContext context) {
        this.context = context;
      activityServicePage=  PageFactory.getActivityServicePage(context.driver);
    }

    @Then("I should see activity service page")
    public void iShouldSeeFieldSetupPage() {
        activityServicePage.getPageTitle();
    }

    @When("I click on manage data from carbon setup page")
    public void iClickOnManageButtonBasedOnFarmName() {
        activityServicePage.clickOnMangeData();
    }
}
