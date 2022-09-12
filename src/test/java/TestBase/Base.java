package TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base{
    public  WebDriver driver;

    public  WebDriver driver() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rmnai\\eclipse-workspace\\DemoTest\\src\\test\\resources\\Driver\\chromedriver.exe");
         WebDriver driver =new ChromeDriver();
        return driver;

    }
}
