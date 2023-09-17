package TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class DriverManager {
    WebDriver driver;

    public WebDriver WebDriverManager() throws IOException {
        if(driver==null){

            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/Driver/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver= new ChromeDriver(options);
            driver.manage().window().maximize();
        }
        return driver;


    }
}
