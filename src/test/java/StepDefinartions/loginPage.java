package StepDefinartions;

import TestBase.Base;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class loginPage {

    @When("Visit the Login Page")
    public void visit_the_login_page() {
        System.setProperty("web.driver.chrome",System.getProperty("user.dir")+"//src//test//resources//Driver");
         WebDriver driver =new ChromeDriver();
//        By signIn = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a");
//        driver.get("https://magento.softwaretestingboard.com/");
//        driver.findElement(signIn).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
//    @Then("Fill the UID & PASSWORD")
//    public void fill_the_uid_password() {
//        By email = By.cssSelector("input[id='email']");
//        By passWord = By.cssSelector("input[type='password']");
//        By submit = By.cssSelector("button[name='send']");
//        driver.findElement(email).sendKeys("roni_cost@example.com");
//        driver.findElement(passWord).sendKeys("roni_cost3@example.com");
//        driver.findElement(submit).click();
//
//        System.out.println("Enter UID & PASSWORD");
//    }
//    @Then("Validate the Login Attempt")
//    public void validate_the_login_attempt() {
//        System.out.println("Login Sucessfull");
//    }

}
