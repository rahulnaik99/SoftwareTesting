package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LoginPageObject {
    By email = By.cssSelector("input[id='email']");
    By passWord = By.cssSelector("input[type='password']");
    By submit = By.cssSelector("button[name='send']");


    By fname = By.cssSelector("input[id='firstname']");
    By lname = By.cssSelector("input[id='lastname']");
    By signupEmail = By.cssSelector("input[id='email_address']");
    By password = By.cssSelector("input[id='password']");
    By passwordconfo = By.cssSelector("input[id='password-confirmation']");
    By signupSubmit = By.cssSelector("button[class='action submit primary']");
    By signIn = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a");
    public WebDriver driver;
    public LoginPageObject(WebDriver driver) {
        this.driver=driver;
    }

    public void login(){

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(signIn).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(email).sendKeys("demo@demail.com");
        driver.findElement(passWord).sendKeys("Charle@234#");
        driver.findElement(submit).click();
    }
    public void signup(){
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
        driver.findElement(fname).sendKeys("Rahul");
        driver.findElement(lname).sendKeys("dlname");
        driver.findElement(signupEmail).sendKeys("demo@demail.com");
        driver.findElement(password).sendKeys("Charle@234#");
        driver.findElement(passwordconfo).sendKeys("Charle@234#");
        driver.findElement(signupSubmit).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
}
