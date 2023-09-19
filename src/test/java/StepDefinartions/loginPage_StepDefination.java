package StepDefinartions;

import Hooks.Hooks;
import PageObject.LoginPageObject;
import TestBase.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.io.IOException;


public class loginPage_StepDefination {
    WebDriver driver;
    Base Base;
    LoginPageObject login;
    Hooks hooks;
    public loginPage_StepDefination(Base Base) {
        this.Base=Base;

    }
    @When("User Signup to the Website using {string}")
    public void userSignupToTheWebsiteUsing(String arg0) throws InterruptedException, IOException {
        Base.pageobjectmanager.getLoginPage().signup(arg0);
    }

    @Then("Validate the Signup By Sign-in using {string}")
    public void validateTheSignupBySignInUsing(String arg0) throws InterruptedException, IOException {
        login.login(arg0);
    }

    @When("User Login using {string}")
    public void userLoginUsing(String arg0) throws InterruptedException, IOException {
      Base.pageobjectmanager.getLoginPage().login(arg0);
    }


}
