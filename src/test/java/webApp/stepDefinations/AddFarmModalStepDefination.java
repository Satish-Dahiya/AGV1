package webApp.stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import webApp.context.TestContext;
import webApp.pages.AddFarmModalPage;
import webApp.pages.PageFactory;

public class AddFarmModalStepDefination {
    private final AddFarmModalPage addFarmModalPage;
    private final TestContext context;

    public AddFarmModalStepDefination(TestContext context) {
        this.context = context;
        addFarmModalPage= PageFactory.getAddFarmModalPage(context.driver);
    }

    @Then("I should see {string} page title")
    public void iShouldSeePageTitle(String expectedTitle) {
        Assert.assertEquals(addFarmModalPage.getPageTitle(),expectedTitle);
    }

    @When("I enter farm name as {string}")
    public void iEnterFarmNameAs(String farmName) {
        addFarmModalPage.enterFarmName(farmName);
    }

    @And("I select farm address")
    public void iSelectFarmAddress() {
        addFarmModalPage.selectFarmAddress();
    }

    @And("I enter address as {string}")
    public void iEnterAddressAs(String address) {
        addFarmModalPage.enterFarmAddress(address);
    }

    @And("I click on enterprise")
    public void iClickOnEnterprise() {
        addFarmModalPage.selectFirstEnterPrise();
    }

    @And("I click on plus icon")
    public void iClickOnPlusIcon() {
        addFarmModalPage.clickOnPlusIcon();
    }

    @And("I click on save button")
    public void iClickOnSaveButton() {
        addFarmModalPage.clickOnSaveButton();
    }

    @And("I select farm coordinate")
    public void iSelectFarmCoordinate() {
        addFarmModalPage.selectCoordinate();
    }

    @And("I enter latitude as {string}")
    public void iEnterLatitudeAs(String latitude) {
        addFarmModalPage.enterLatitude(latitude);
    }

    @And("I enter longitude as {string}")
    public void iEnterLongituudeAs(String longitude) {
        addFarmModalPage.enterLongitude(longitude);
    }

    @Then("I should see {string} success message")
    public void iShoudSeeSuccessMessage(String successMessage) {
        addFarmModalPage.isSuccessMessageDisplayed();
    }
}
