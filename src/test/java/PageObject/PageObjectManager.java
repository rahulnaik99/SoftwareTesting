package PageObject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    WebDriver driver;
    public LoginPageObject loginpage;
    public mainPageObject homepageobject;
    public CheckOutPage checkoutpage;
    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }


    public LoginPageObject getLoginPage(){
        loginpage = new LoginPageObject(driver);
        return loginpage;
    }
    public mainPageObject getHomePage(){
        homepageobject = new mainPageObject(driver);
        return homepageobject;
    }
    public CheckOutPage getCheckoutPage(){
        checkoutpage = new CheckOutPage(driver);
        return checkoutpage;


    }
}
