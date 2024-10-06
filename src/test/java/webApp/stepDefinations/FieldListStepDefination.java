package webApp.stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webApp.context.TestContext;
import webApp.pages.FarmSetUpPage;
import webApp.pages.FieldListPage;
import webApp.pages.PageFactory;

public class FieldListStepDefination {
    private final FieldListPage fieldListPage;
    private final TestContext context;

    public FieldListStepDefination(TestContext context) {
        this.context = context;
        fieldListPage= PageFactory.getFieldListPage(context.driver);
    }
    @Then("I should see field list page")
    public void iShouldSeeFieldListPage() {
fieldListPage.getPageTitle();

    }

    @When("i click on add field button")
    public void iClickOnAddFieldButton() {
        fieldListPage.clickOnAddField();
    }

    @When("I click on edit button for field {string}")
    public void iClickOnEditButtonForField(String fieldName) {
        fieldListPage.clickOnEditButton(fieldName);
    }

    @When("i click on delete button based on fieldName {string}")
    public void iClickOnDeleteButtonBasedOnFieldName(String fieldName) {
        fieldListPage.clickOnDeleteButton(fieldName);
    }

    @And("I click on yes delete from delete Modal")
    public void iClickOnYesDeleteFromDeleteModal() {
        fieldListPage.clickOnYesDeleteButton();
    }

    @Then("i should get {string} successMessage")
    public void iShouldGetSuccessMessage(String arg0) {
    }
    @When("i click on edit Multiple")
    public void iClickOnEditMultiple() {
        fieldListPage.clickOnEditMutiple();

    }

    @And("click on select all")
    public void clickOnSelectAll() {
        fieldListPage.clickOnSelectAll();
    }

    @When("i click on edit selected")
    public void iClickOnEditSelected() {
        fieldListPage.clickOnEditSelected();
    }
}
