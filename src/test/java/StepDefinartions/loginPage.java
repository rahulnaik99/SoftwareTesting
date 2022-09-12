package StepDefinartions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.hssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

public class loginPage {
    public WebDriver driver;
    public loginPage(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rmnai\\eclipse-workspace\\DemoTest\\src\\test\\resources\\Driver\\chromedriver.exe");
         this.driver =new ChromeDriver();
    }
    @When("Visit the Login Page")
    public void visit_the_login_page() {
        By signIn = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a");
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(signIn).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Then("Fill the UID & PASSWORD")
    public void fill_the_uid_password() {
        By email = By.cssSelector("input[id='email']");
        By passWord = By.cssSelector("input[type='password']");
        By submit = By.cssSelector("button[name='send']");
        driver.findElement(email).sendKeys("roni_cost@example.com");
        driver.findElement(passWord).sendKeys("roni_cost3@example.com");
        driver.findElement(submit).click();

        System.out.println("Enter UID & PASSWORD");
    }
//    @Then("Validate the Login Attempt")
//    public void validate_the_login_attempt() {
//        System.out.println("Login Sucessfull");
//    }
@When("Visit the Signup Page")
public void visit_the_signup_page() {
    driver.get("https://magento.softwaretestingboard.com/customer/account/create/");


}
    @Then("Fill the Signup Deatial's")
    public void fill_the_signup_deatials(String dfname,String dlname,String demail,String dpassword) {
        By fname = By.cssSelector("input[id='firstname']");
        By lname = By.cssSelector("input[id='lastname']");
        By email = By.cssSelector("input[id='email_address']");
        By password = By.cssSelector("input[id='password']");
        By passwordconfo = By.cssSelector("input[id='password-confirmation']");
        By submit = By.cssSelector("button[class='action submit primary']");
        driver.findElement(fname).sendKeys(dfname);
        driver.findElement(lname).sendKeys(dlname);
        driver.findElement(email).sendKeys(demail);
        driver.findElement(password).sendKeys(dpassword);
        driver.findElement(passwordconfo).sendKeys(dpassword);
        driver.findElement(submit).click();





    }


}
