package TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
    WebDriver driver;

    public WebDriver WebDriverManager() throws IOException {
        if(driver==null){
            FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\global.properties");

            Properties config = new Properties();
            config.load(file);
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Rmnai\\OneDrive\\Desktop\\SoftwareTesting\\src\\test\\resources\\Driver\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver= new ChromeDriver(options);
            driver.get(config.getProperty("URL"));
            driver.manage().window().maximize();

        }
        return driver;

    }
}
