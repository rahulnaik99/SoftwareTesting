package TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {
    WebDriver driver;

    public WebDriver WebDriverManager() {
        if(driver==null){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Rmnai\\OneDrive\\Desktop\\SoftwareTesting\\src\\test\\resources\\Driver\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver= new ChromeDriver(options);

//            driver.get("https://magento.softwaretestingboard.com/");
            driver.manage().window().maximize();

        }
        return driver;

    }
}
