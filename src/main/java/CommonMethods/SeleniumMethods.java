package CommonMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumMethods {
    WebDriver driver;
    public SeleniumMethods(WebDriver driver){
        this.driver=driver;
    }
    public  void click(By elemnt){
        driver.findElement(elemnt).click();
    }
    public  void EnterValue(By Element, String Value){
        driver.findElement(Element).sendKeys(Value);
    }
}
