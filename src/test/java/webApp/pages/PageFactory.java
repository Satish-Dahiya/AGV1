package webApp.pages;

import org.openqa.selenium.WebDriver;
import webApp.stepDefinations.EnterPriseDataStepDefination;

public class PageFactory {
    private  static LoginPage loginPage;
    private static SelectAccountModalComponent selectAccountModalComponent;
    private static HomePage homePage;
    private static AddFarmModalPage addFarmModalPage;
    private static EnterPriseDataPage enterPriseDataPage;
private static FarmSetUpPage farmSetUpPage;
    private static EditFarmPage editFarmPage;
    private static FieldSetUpPage fieldSetUpPage;
    private static AddFieldPage addFieldPage;
    private static FieldListPage fieldListPage ;

    private static EditFieldPage editFieldPage;
    public static LoginPage getLoginPage(WebDriver driver){
        return loginPage == null ? new LoginPage(driver) : loginPage;
    }
    public static SelectAccountModalComponent getSelectAccountModal(WebDriver driver){
        return selectAccountModalComponent == null ? new SelectAccountModalComponent(driver) : selectAccountModalComponent;
    }
    public static HomePage getHomePage(WebDriver driver){
        return homePage == null ? new HomePage(driver) : homePage;
    }
    public static FarmSetUpPage getFarmSetUpPage(WebDriver driver){
        return farmSetUpPage == null ? new FarmSetUpPage(driver) : farmSetUpPage;
    }
    public static AddFarmModalPage getAddFarmModalPage(WebDriver driver){
        return addFarmModalPage == null ? new AddFarmModalPage(driver) : addFarmModalPage;
    }
    public static EditFarmPage getEditFarmPage(WebDriver driver){
        return editFarmPage == null ? new EditFarmPage(driver) : editFarmPage;
    }
    public static EnterPriseDataPage getEnterPriseDataPage(WebDriver driver){
        return enterPriseDataPage == null ? new EnterPriseDataPage(driver) : enterPriseDataPage;
    }
    public static FieldSetUpPage getFieldSetUpPage(WebDriver driver){
        return farmSetUpPage == null ? new FieldSetUpPage(driver) : fieldSetUpPage;
    }
    public static AddFieldPage getAddFieldPage(WebDriver driver){
        return addFieldPage == null ? new AddFieldPage(driver) : addFieldPage;
    }
    public static FieldListPage getFieldListPage(WebDriver driver){
        return fieldListPage == null ? new FieldListPage(driver) : fieldListPage;
    }
    public static EditFieldPage getEditFieldPage(WebDriver driver){
        return editFieldPage == null ? new EditFieldPage(driver) : editFieldPage;
    }
}
