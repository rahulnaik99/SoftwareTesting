package StepDefinartions;

import PageObject.LoginPageObject;
import PageObject.PageObjectManager;
import TestBase.textContextMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginPage {
    PageObjectManager pageobjectmanager;
    textContextMethod tcm;

    public loginPage(textContextMethod tcm){
        this.tcm= tcm;
    }





    @When("User Signup to the Website using {string}")
    public void userSignupToTheWebsiteUsing(String arg0) {
        LoginPageObject signup = tcm.pageobjectmanager.getLoginPage();
        signup.signup(arg0);
    }

    @Then("Validate the Signup By Sign-in using {string}")
    public void validateTheSignupBySignInUsing(String arg0) {
        LoginPageObject login  = tcm.pageobjectmanager.getLoginPage();
        login.login(arg0);
    }

    @When("User Login using {string}")
    public void userLoginUsing(String arg0) {
        LoginPageObject login  = tcm.pageobjectmanager.getLoginPage();
        login.login(arg0);
    }
}
