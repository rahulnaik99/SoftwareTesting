package PageObject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    WebDriver driver;
    public LoginPageObject loginpage;

    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }


    public LoginPageObject getLoginPage(){
        loginpage = new LoginPageObject(driver);
        return loginpage;
    }
}
