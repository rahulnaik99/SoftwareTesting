package PageObject;

import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage {
    WebDriver driver;
    By Cart = By.cssSelector("a[class='action showcart']");
    By openCart = By.cssSelector("button[id='top-cart-btn-checkout']");
    By email = By.cssSelector("input[id='customer-email']");
    By firstName = By.cssSelector("input[type='text']");
    By lastName = By.cssSelector("input[name='lastname']");
    By address = By.cssSelector("input[name$='street[0]']");
    By City = By.cssSelector("input[name$='city']");
    By StateOption = By.cssSelector("select[name$='region_id']");
    By zipCode = By.cssSelector("input[name$='postcode']");
    By countryOption = By.cssSelector("select[name$='country_id']");
    By  phoneNumber = By.cssSelector("input[name$='telephone']");
    By shippingOp1 = By.cssSelector("input[name$='ko_unique_1']");
    By checkoutSubmit = By.cssSelector("button[class='button action continue primary']");
    By placeOrder = By.cssSelector("button[class='action primary checkout']");

    public CheckOutPage(WebDriver driver) {
        this.driver=driver;
    }

    @SneakyThrows
    public void Checkout(){
        driver.findElement(Cart).click();
        driver.findElement(openCart).click();
        Thread.sleep(10000);
        driver.findElement(email).sendKeys("hehe@hoho.com");
        driver.findElement(firstName).sendKeys("Rahul");
        driver.findElement(lastName).sendKeys("naik");
        driver.findElement(address).sendKeys("123 Street");
        driver.findElement(City).sendKeys("Yellapur");
        Select seState = new Select(driver.findElement(StateOption));
        seState.selectByIndex(5);
        driver.findElement(zipCode).sendKeys("12456");
        Select seCountry = new Select(driver.findElement(countryOption));
        seCountry.selectByIndex(2);
        driver.findElement(phoneNumber).sendKeys("9591852201");
        Thread.sleep(5000);
        WebElement radio = driver.findElement(shippingOp1);
        radio.click();
        Thread.sleep(5000);
        driver.findElement(checkoutSubmit).click();
        Thread.sleep(10000);
        driver.findElement(placeOrder).click();
        {

        }



    }
}
