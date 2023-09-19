package PageObject;

import CommonMethods.CommonMethodManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class mainPageObject {
    WebDriver driver;
    CommonMethodManager CommonMethodManager;
    public mainPageObject(WebDriver driver){

        this.driver=driver;
        this.CommonMethodManager=new CommonMethodManager(driver);
    }

    By SearchBox = By.cssSelector("input[id$='search']");
    By SearchButton = By.cssSelector("button[class='action search']");
    By Product = By.cssSelector("img[class='product-image-photo']");
    By sizeXS =By.cssSelector("div[id='option-label-size-143-item-166']");
    By sizeS =By.cssSelector("div[id='option-label-size-143-item-167']");
    By sizeM = By.cssSelector("div[id='option-label-size-143-item-168']");
    By sizeL =By.cssSelector("div[id='option-label-size-143-item-169']");
    By sizeXL= By.cssSelector("div[id='option-label-size-143-item-170']");
    By colorBlue = By.cssSelector("div[id='option-label-color-93-item-50']");
    By colorOrange=By.cssSelector("div[id='option-label-color-93-item-56']");
    By colorPurple = By.cssSelector("div[id='option-label-color-93-item-57']");
    By Qunat = By.cssSelector("input[type$='number']");
    By addToCart = By.cssSelector("a[class='action showcart']");
    By proceed2Checkout = By.cssSelector("button[id='top-cart-btn-checkout']");
    By sucessMessage = By.cssSelector("div[class='message-success success message']");
    By searchAction = By.cssSelector("button[class$='action search']");

    public void SearchProduct(String Keyword) throws IOException {
        CommonMethodManager.SeleniumMethods().EnterValue(SearchBox,Keyword);
        CommonMethodManager.getTestEvidence().highlightElement(SearchBox);
        CommonMethodManager.SeleniumMethods().click(SearchButton);
        CommonMethodManager.getTestEvidence().ppt("The Searched Product apeared in the Search Result");
    }

    public void chooseTheSizeColorQuantity(String Size, String Colour, String Qunatity) throws InterruptedException, IOException {
        Thread.sleep(5000);
        switch (Size){
            case "XS":
                driver.findElement(sizeXS).click();
                System.out.printf("hey"+Size);
                break;
            case "s":
                driver.findElement(sizeS).click();
                break;
            case "M":
                driver.findElement(sizeM).click();
                break;
            case "L":
                driver.findElement(sizeL).click();
                break;
            case "XL":
                driver.findElement(sizeXL).click();
                break;

            default:
                break;

        }

        switch (Colour){
            case "blue":
                driver.findElement(colorBlue).click();
                break;
            case "orange":
                driver.findElement(colorOrange).click();
                break;
            case "purple":
                driver.findElement(colorPurple).click();
                break;
        }
        CommonMethodManager.getTestEvidence().ppt("Selected the product to buy");
//        driver.findElement(Qunat).sendKeys(Qunatity);
        driver.findElement(addToCart).click();
        CommonMethodManager.SeleniumMethods().click(proceed2Checkout);

//        Thread.sleep(5000);
//        String Actual = driver.findElement(sucessMessage).getText();
//        Assert.assertEquals(Actual,"You added Radiant Tee to your shopping cart.");
    }
}
