package TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
    WebDriver driver;

    public WebDriver WebDriverManager() {
        if(driver==null){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Rmnai\\eclipse-workspace\\DemoTest\\src\\test\\resources\\Driver\\chromedriver.exe");
            driver =new ChromeDriver();
           // driver.get("https://abstracta.us/blog/software-testing/best-demo-websites-for-practicing-different-types-of-software-tests/");
            driver.get("https://magento.softwaretestingboard.com/");
            driver.manage().window().maximize();

        }
        return driver;

    }
}
