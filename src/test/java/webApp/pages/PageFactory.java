package webApp.pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    private  static LoginPage loginPage;
    private static SelectAccountModalComponent selectAccountModalComponent;
    private static HomePage homePage;
    private static AddFarmModalPage addFarmModalPage;
private static FarmSetUpPage farmSetUpPage;
    private static EditFarmPage editFarmPage;
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
}
