package webApp.stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import webApp.context.TestContext;
import webApp.pages.PageFactory;
import webApp.pages.SelectAccountModalComponent;

public class SelectAccountModalStepDefination {
    private final SelectAccountModalComponent selectAccountModalComponent;
    private final TestContext context;

    public SelectAccountModalStepDefination(TestContext context) {
        this.context = context;
        selectAccountModalComponent= PageFactory.getSelectAccountModal(context.driver);
    }

    @Then("I should see select account modal")
    public void iShouldSeeSelectAccountModal() {
        Assert.assertTrue(selectAccountModalComponent.isSelectAccountModalDisplayed());
    }

    @When("I select buyer admin radio button")
    public void iSelectBuyerAdminRadioButton() {
        selectAccountModalComponent.selectBayerAdminRadioButton();
    }

    @And("I click on select account")
    public void iClickOnSelectAccount() {
        selectAccountModalComponent.clickOnSelectAccountButton();
    }


}
