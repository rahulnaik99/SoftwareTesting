package commonMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class commonMethod {
    WebDriver driver;
    public commonMethod(WebDriver driver){
        this.driver=driver;
    }
    By SearchBox = By.cssSelector("input[id$='search']");
    public void SearchProduct(String Keyword){
        driver.findElement(SearchBox).sendKeys(Keyword);

    }
}
