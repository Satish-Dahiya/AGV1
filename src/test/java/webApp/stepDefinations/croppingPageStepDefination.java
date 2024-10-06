package webApp.stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webApp.context.TestContext;
import webApp.pages.CarbonSetupPage;
import webApp.pages.CropingSetupPage;
import webApp.pages.PageFactory;

public class croppingPageStepDefination {
    private final CropingSetupPage cropingSetupPage;
    private final TestContext context;

    public croppingPageStepDefination(TestContext context) {
        this.context = context;
      cropingSetupPage=  PageFactory.getCroppingSetupPage(context.driver);
    }

    @Then("I should see cropping page")
    public void iShouldSeeFieldSetupPage() {
        cropingSetupPage.getPageTitle();
    }

    @When("I select farm name as {string} from dropdown")
    public void iSelectFarmNameAsFromDropdown(String farmName) {
        cropingSetupPage.selectFarm(farmName);
    }

    @And("I select field name as {string} from dropdown")
    public void iSelectFieldNameAsFromDropdown(String fieldName) {
        cropingSetupPage.selectField(fieldName);
    }

//    @When("I click on manage data for carbon service")
//    public void iClickOnManageButtonBasedOnFarmName() {
//        cropingSetupPage.clickOnMangeData();
//    }
}
