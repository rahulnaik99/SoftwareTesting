package StepDefinartions;

import TestBase.Base;
import io.cucumber.java.en.Then;

public class checkOutPageSD {

    public Base Base;
    public checkOutPageSD(Base Base){
        this.Base=Base;
    }
    @Then("Proceed to checkout and place order")
    public void proceed_to_checkout_and_place_order() {
        Base.pageobjectmanager.getCheckoutPage().Checkout();

    }
}
