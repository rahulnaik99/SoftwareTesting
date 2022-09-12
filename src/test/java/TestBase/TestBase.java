package TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
    WebDriver driver;

    public WebDriver TestBase() {
        if(driver==null){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Rmnai\\eclipse-workspace\\DemoTest\\src\\test\\resources\\Driver\\chromedriver.exe");
            driver =new ChromeDriver();
            driver.get("https://magento.softwaretestingboard.com/");

        }
        return driver;

    }
}
