package PageObject;


import lombok.SneakyThrows;
import org.junit.Assert;
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
    By Welcome = By.cssSelector("span[class$='logged-in'");
    By SignupSuc = By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div");
    public WebDriver driver;
    public LoginPageObject(WebDriver driver) {
        this.driver=driver;
    }

    @SneakyThrows
    public boolean login(String EmailLog){

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(signIn).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(email).sendKeys(EmailLog);
        driver.findElement(passWord).sendKeys("Charle@234#");
        driver.findElement(submit).click();
        Thread.sleep(3000);
        String Expected = driver.findElement(Welcome).getAttribute("innerHTML");
        Assert.assertEquals(Expected, "Welcome, Rahul Naik!");
        return false;
    }
    @SneakyThrows
    public void signup(String EmailAdd){
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
        driver.findElement(fname).sendKeys("Rahul");
        driver.findElement(lname).sendKeys("Naik");
        driver.findElement(signupEmail).sendKeys(EmailAdd);
        driver.findElement(password).sendKeys("Charle@234#");
        driver.findElement(passwordconfo).sendKeys("Charle@234#");
        driver.findElement(signupSubmit).click();
        Thread.sleep(10000);
        String Expected = driver.findElement(SignupSuc).getAttribute("innerHTML");
        Assert.assertEquals(Expected, "Thank you for registering with Fake Online Clothing Store.");

    }
}
