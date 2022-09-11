package TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base{
    public static WebDriver driver;

    public static WebDriver driver() {
        System.setProperty("web.driver.chrome",System.getProperty("user.dir")+"//src//test//resources//Driver");
        driver=new ChromeDriver();
        return driver;

    }
}
