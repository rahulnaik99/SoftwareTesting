package StepDefinartions;

import PageObject.PageObjectManager;
import TestBase.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class mainPage {
    Base Base;
    WebDriver driver;
    PageObjectManager pageobjectmanager;

    public mainPage(Base Base){
        this.Base= Base;
    }
    @When("User Search for {string} and Select")
    public void user_search_for_and_select(String string) throws IOException {
       Base.pageobjectmanager.getHomePage().SearchProduct(string);
    }


    @Then("User Choose the Size {string}, {string} Color and Quantity {string};")
    public void userChooseTheSizeColorAndQuantity(String arg0, String arg1, String arg2) throws InterruptedException, IOException {
//        mainPageObject search = TestBase.Base.pageobjectmanager.getHomePage();
        Base.pageobjectmanager.homepageobject.chooseTheSizeColorQuantity(arg0,arg1,arg2);
    }
}
