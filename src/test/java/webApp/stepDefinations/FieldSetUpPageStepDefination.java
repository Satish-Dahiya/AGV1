package webApp.stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webApp.context.TestContext;
import webApp.pages.AddFarmModalPage;
import webApp.pages.FieldSetUpPage;
import webApp.pages.PageFactory;

public class FieldSetUpPageStepDefination {
    private final FieldSetUpPage fieldSetUpPage;
    private final TestContext context;

    public FieldSetUpPageStepDefination(TestContext context) {
        this.context = context;
      fieldSetUpPage=  PageFactory.getFieldSetUpPage(context.driver);
    }

    @Then("i should see field setup page")
    public void iShouldSeeFieldSetupPage() {
        fieldSetUpPage.getPageTitle();
    }

    @When("I click on manage button based on {string} farm name")
    public void iClickOnManageButtonBasedOnFarmName(String farmName) {
        fieldSetUpPage.clickOnMangeData(farmName);
    }


}
