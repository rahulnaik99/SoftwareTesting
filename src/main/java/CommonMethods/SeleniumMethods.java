package CommonMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeleniumMethods {
    WebDriver driver;
    CommonMethodManager CommonMethodManager;
    public SeleniumMethods(WebDriver driver){
        this.driver=driver;
        this.CommonMethodManager = new CommonMethodManager(driver);

    }
    public  void click(By elemnt){
        driver.findElement(elemnt).click();
    }

    public  void EnterValue(By Element, String Value){
        driver.findElement(Element).sendKeys(Value);
    }
    public void Elements(By WebElement,int Index){
        List<WebElement> Elements = driver.findElements(By.cssSelector("input[class='input-text']"));
        System.out.println(Elements.get(1));

    }
}
