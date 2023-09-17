package StepDefinartions;

import PageObject.CheckOutPage;
import PageObject.PageObjectManager;
import TestBase.Base;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class checkOutPageSD {
    public WebDriver driver;
    public PageObjectManager pageobjectmanager;
    public Base Base;
    public checkOutPageSD(Base Base){
        this.Base=Base;
    }
    @Then("Proceed to checkout and place order")
    public void proceed_to_checkout_and_place_order() {

       CheckOutPage checkout = Base.pageobjectmanager.getCheckoutPage();
       checkout.Checkout();


    }
}
