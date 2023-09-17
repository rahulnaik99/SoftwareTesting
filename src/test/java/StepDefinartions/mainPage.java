package StepDefinartions;

import PageObject.mainPageObject;
import PageObject.PageObjectManager;
import TestBase.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class mainPage {
    Base tcm;
    WebDriver driver;
    PageObjectManager pageobjectmanager;

    public mainPage(Base tcm){
        this.tcm= tcm;
    }
    @When("User Search for {string} and Select")
    public void user_search_for_and_select(String string) {
       mainPageObject search = tcm.pageobjectmanager.getHomePage();
       search.SearchProduct(string);

    }


    @Then("User Choose the Size {string}, {string} Color and Quantity {string};")
    public void userChooseTheSizeColorAndQuantity(String arg0, String arg1, String arg2) {
        mainPageObject search = tcm.pageobjectmanager.getHomePage();
        search.chooseTheSizeColorQuantity(arg0,arg1,arg2);
    }
}
