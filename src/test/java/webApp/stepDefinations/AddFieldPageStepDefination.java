package webApp.stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import webApp.context.TestContext;
import webApp.pages.AddFarmModalPage;
import webApp.pages.AddFieldPage;
import webApp.pages.PageFactory;

public class AddFieldPageStepDefination {
    private final AddFieldPage addFieldPage;
    private final TestContext context;

    public AddFieldPageStepDefination(TestContext context) {
        this.context = context;
        addFieldPage= PageFactory.getAddFieldPage(context.driver);
    }
    @Then("I should see {string} title")
    public void iShouldSeeTitle(String expectedTitle) {
        addFieldPage.getPageTitle();
    }

    @When("I enter field name as {string}")
    public void iEnterFieldNameAs(String fieldName) {
        addFieldPage.enterFieldName(fieldName);
    }

    @And("I enter field size as {string}")
    public void iEnterFiledSizeAs(String fieldSize) {
        addFieldPage.enterFieldSize(fieldSize);
    }

    @And("I select management type as {string}")
    public void iSelectManagementTypeAs(String managementType) {
        addFieldPage.setSelectManagementDDL(managementType);
    }

    @And("I select soil piet as {string}")
    public void iSelectSoilPietAs(String soilPeat) {
        addFieldPage.setSelectSoilPeat(soilPeat);
    }

    @And("land use as {string}")
    public void landUseAs(String landUseValue) {
        addFieldPage.setLandUseLocation(landUseValue);
    }

    @And("select primary land category one as {string}")
    public void selectPrimaryLandCategoryAs(String category) {
        addFieldPage.setPrimaryLandUseCategory(category);
    }

    @And("I click on save button from add field page")
    public void iClickOnSaveButtonFromAddFieldPage() {
        addFieldPage.clickOnSaveButton();
    }

    @Then("I should see {string} success message for add field")
    public void iShouldSeeSuccessMessageForAddField(String expectedMessage) {
        Assert.assertEquals(addFieldPage.getSuccessMessage(),expectedMessage);
    }


    @And("I select to Date Range as {string}")
    public void iSelectToDateRangeAs(String toDate) {
        addFieldPage.setSinceValue(toDate);
    }

    @And("select primary land category two as {string}")
    public void selectPrimaryLandCategoryTwoAs(String primaryLand) {
        addFieldPage.setPrimaryLandUseCategory1(primaryLand);
    }

    @And("I select from Date Range as {string}")
    public void iSelectFromDateRangeAs(String fromDate) {
        addFieldPage.setSinceValue1(fromDate);
    }
}
