package PageObject;

import lombok.SneakyThrows;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class mainPageObject {
    WebDriver driver;
    public mainPageObject(WebDriver driver){
        this.driver=driver;
    }

    By SearchBox = By.cssSelector("input[id$='search']");
    By Product = By.cssSelector("img[class='product-image-photo']");
    By sizeXS =By.cssSelector("div[id='option-label-size-143-item-166']");
    By sizeS =By.cssSelector("div[id='option-label-size-143-item-167']");;
    By sizeM = By.cssSelector("div[id='option-label-size-143-item-168']");;
    By sizeL =By.cssSelector("div[id='option-label-size-143-item-169']");;
    By sizeXL= By.cssSelector("div[id='option-label-size-143-item-170']");;
    By colorBlue = By.cssSelector("div[id='option-label-color-93-item-50']");
    By colorOrange=By.cssSelector("div[id='option-label-color-93-item-56']");
    By colorPurple = By.cssSelector("div[id='option-label-color-93-item-57']");
    By Qunat = By.cssSelector("input[type$='number']");
    By addToCart = By.cssSelector("button[id$='product-addtocart-button']");
    By sucessMessage = By.cssSelector("div[class='message-success success message']");
    By searchAction = By.cssSelector("button[class$='action search']");
    @SneakyThrows
    public void SearchProduct(String Keyword)
    {
        driver.findElement(SearchBox).sendKeys(Keyword);
        Thread.sleep(2000);
        //driver.findElement(searchAction).click();
        Thread.sleep(6000);
        driver.findElement(Product).click();
    }
    @SneakyThrows
    public void chooseTheSizeColorQuantity(String Size, String Colour, String Qunatity){
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
        driver.findElement(Qunat).sendKeys(Qunatity);
        driver.findElement(addToCart).click();
        Thread.sleep(5000);
        String Actual = driver.findElement(sucessMessage).getText();
        Assert.assertEquals(Actual,"You added Radiant Tee to your shopping cart.");
    }
}
