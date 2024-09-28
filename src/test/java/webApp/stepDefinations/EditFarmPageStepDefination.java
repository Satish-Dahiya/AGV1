package webApp.stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import webApp.context.TestContext;
import webApp.pages.EditFarmPage;
import webApp.pages.PageFactory;

public class EditFarmPageStepDefination {
    private final EditFarmPage editFarmPage;
    private final TestContext context;

    public EditFarmPageStepDefination(TestContext context) {
        this.context = context;
        editFarmPage= PageFactory.getEditFarmPage(context.driver);
    }

    @When("I update farm name as {string}")
    public void iUpdateFarmNameAs(String farmName) {
        editFarmPage.enterFarmName(farmName);
    }

    @Then("I should see edit farm {string} page title")
    public void iShouldSeeEditFarmPageTitle(String expectedTitle) {
        editFarmPage.getPageTitle();
    }

    @And("I click on save button from edit farm page")
    public void iClickOnSaveButtonFromEditFarmPage() {
        editFarmPage.clickOnSaveButton();
    }

    @Then("I should see {string} success message for edit farm")
    public void iShouldSeeSuccessMessageForEditFarm(String expectedMessage) {
        Assert.assertEquals(editFarmPage.getSuccessMessage(),expectedMessage);
    }
}
