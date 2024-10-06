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

    @And("I update field size as {string}")
    public void iUpdateFieldSizeAs(String size) {
        editFieldPage.enterFieldSize(size);
    }

    @And("I update management type as {string}")
    public void iUpadateManagementTypeAs(String managementType) {
        editFieldPage.setSelectManagementDDL(managementType);
    }

    @And("I update soil peat as {string}")
    public void iUpdateSoilPeatAs(String soilPeat) {
        editFieldPage.setSelectSoilPeat(soilPeat);
    }

    @And("I update primary category as {string}")
    public void iUpdatePrimaryCategoryAs(String primaryCategory) {
        editFieldPage.setPrimaryLandUseCategory1(primaryCategory);
    }

    @And("I update since as {string}")
    public void iUpdateSinceAs(String since) {
        editFieldPage.setSinceValue(since);
    }

    @And("I update land use location as {string} from edit page")
    public void iUpdateLandUseLocationAsFromEditPage(String location) {
        editFieldPage.setLandUseLocation(location);
    }
}
