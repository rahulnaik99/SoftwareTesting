package StepDefinartions;

import PageObject.LoginPageObject;
import TestBase.textContextMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class loginPage_StepDefination {
    WebDriver driver;
    textContextMethod tcm;
    LoginPageObject login;
    public loginPage_StepDefination(textContextMethod tcm){
        this.tcm=tcm;
        this.login=tcm.pageobjectmanager.getLoginPage();

    }

    @When("User Signup to the Website using {string}")
    public void userSignupToTheWebsiteUsing(String arg0) throws InterruptedException {
        login.signup(arg0);
    }

    @Then("Validate the Signup By Sign-in using {string}")
    public void validateTheSignupBySignInUsing(String arg0) throws InterruptedException {
        login.login(arg0);
    }

    @When("User Login using {string}")
    public void userLoginUsing(String arg0) throws InterruptedException {
        login.login(arg0);
    }


}
