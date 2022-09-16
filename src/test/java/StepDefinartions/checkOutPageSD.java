package StepDefinartions;

import PageObject.CheckOutPage;
import PageObject.PageObjectManager;
import TestBase.textContextMethod;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class checkOutPageSD {
    public WebDriver driver;
    public PageObjectManager pageobjectmanager;
    public textContextMethod tcm;
    public checkOutPageSD(textContextMethod tcm){
        this.tcm=tcm;
    }
    @Then("Proceed to checkout and place order")
    public void proceed_to_checkout_and_place_order() {

       CheckOutPage checkout = tcm.pageobjectmanager.getCheckoutPage();
       checkout.Checkout();


    }
}
