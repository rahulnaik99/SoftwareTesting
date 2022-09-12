package StepDefinartions;

import PageObject.LoginPageObject;
import PageObject.PageObjectManager;
import TestBase.textContextMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class loginPage {
    PageObjectManager pageobjectmanager;
    textContextMethod tcm;
    public WebDriver driver;
    public loginPage(textContextMethod tcm){
        this.tcm= tcm;
    }
    @When("Visit the Login Page")
    public void visit_the_login_page() {

    }
    @Then("Fill the UID & PASSWORD")
    public void fill_the_uid_password() {
        pageobjectmanager.getLoginPage().login();

    }
    @Then("Validate the Login Attempt")
    public void validate_the_login_attempt() {
        System.out.println("Login Sucessfull");
    }
@When("Visit the Signup Page")
        public void fill_the_signup_deatials() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rmnai\\eclipse-workspace\\DemoTest\\src\\test\\resources\\Driver\\chromedriver.exe");
        tcm.driver =new ChromeDriver();
        LoginPageObject obj = new LoginPageObject(tcm.driver);
        obj.signup();
    }


}
