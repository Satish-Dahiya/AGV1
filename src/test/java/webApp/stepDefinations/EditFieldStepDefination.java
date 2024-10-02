package webApp.stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webApp.context.TestContext;
import webApp.pages.EditFarmPage;
import webApp.pages.EditFieldPage;
import webApp.pages.PageFactory;

public class EditFieldStepDefination {
    private final EditFieldPage editFieldPage;
    private final TestContext context;

    public EditFieldStepDefination(TestContext context) {
        this.context = context;
        editFieldPage= PageFactory.getEditFieldPage(context.driver);
    }
    @When("I update field name as {string}")
    public void iUpdateFieldNameAs(String fieldName) {
        editFieldPage.updateFieldName(fieldName);
    }

    @Then("I should see {string} success message on edit field page")
    public void iShouldSeeSuccessMessageOnEditFieldPage(String successMessage) {
        editFieldPage.getSuccessMessage();
    }

    @And("I click on save button from edit field Page")
    public void iClickOnSaveButtonFromEditFieldPage() {
        editFieldPage.clickOnSaveButton();
    }
}
