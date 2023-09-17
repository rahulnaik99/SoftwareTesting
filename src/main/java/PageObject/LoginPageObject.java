package PageObject;


import CommonMethods.CommonMethodManager;
//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.Random;

public class LoginPageObject {
    By email = By.cssSelector("input[id='email']");
    By passWord = By.cssSelector("input[type='password']");
    By submit = By.cssSelector("button[name='send']");
    By SignUp = By.cssSelector("a[href='https://magento.softwaretestingboard.com/customer/account/create/']");
    By ActionSwitch = By.cssSelector("button[class$='action switch']");
    By Signout = By.cssSelector("a[href='https://magento.softwaretestingboard.com/customer/account/logout/']");
    By fname = By.cssSelector("input[id='firstname']");
    By lname = By.cssSelector("input[id='lastname']");
    By signupEmail = By.cssSelector("input[id='email_address']");
    By password = By.cssSelector("input[id='password']");
    By passwordconfo = By.cssSelector("input[id='password-confirmation']");
    By signupSubmit = By.cssSelector("button[class='action submit primary']");
    By signIn = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a");
    By Welcome = By.cssSelector("span[class$='logged-in'");
    By SignupSuc = By.xpath("//div[text()='Thank you for registering with Main Website Store.']");
    public WebDriver driver;
    public CommonMethodManager CommonMethods;
    public LoginPageObject(WebDriver driver) {
      this.driver=driver;
      this.CommonMethods=new CommonMethodManager(driver);
    }

    public boolean login(String EmailLog) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(signIn).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(email).sendKeys(EmailLog);
        driver.findElement(passWord).sendKeys("Charle@234#");
        driver.findElement(submit).click();
        Thread.sleep(3000);
        String Expected = driver.findElement(Welcome).getAttribute("innerHTML");
//        Assert.assertEquals(Expected, "Welcome, Rahul Naik!");
        return false;
    }
    public void signup(String EmailAdd) throws InterruptedException, IOException {


        Random ran = new Random();

        String email = ran.nextLong()+"@mail.com";
        driver.findElement(SignUp).click();
        Thread.sleep(3000);
        driver.findElement(fname).sendKeys("Rahul");
        driver.findElement(lname).sendKeys("Naik");
        driver.findElement(signupEmail).sendKeys(email);
        driver.findElement(password).sendKeys("Charle@234#");
        driver.findElement(passwordconfo).sendKeys("Charle@234#");
        driver.findElement(signupSubmit).click();
        Thread.sleep(10000);
        String Expected = driver.findElement(SignupSuc).getText();
//        Assert.assertEquals(Expected, "Thank you for registering with Main Website Store.");
        CommonMethods.getTestEvidence().ppt("SignedUp Successfully");
        driver.findElement(ActionSwitch).click();
        driver.findElement(Signout).click();
    }
}
