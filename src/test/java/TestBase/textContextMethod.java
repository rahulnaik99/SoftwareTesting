package TestBase;

import PageObject.HomePageObject;
import PageObject.PageObjectManager;
import commonMethods.commonMethod;
import org.openqa.selenium.WebDriver;

public class textContextMethod {
    public WebDriver driver;
    public TestBase testbase;


    public PageObjectManager pageobjectmanager;
    public commonMethod common;
    public HomePageObject homepageobject;
    public textContextMethod() {
        testbase = new TestBase();
        pageobjectmanager = new PageObjectManager(testbase.WebDriverManager());
        common = new commonMethod(testbase.driver);
        homepageobject=new HomePageObject(testbase.driver);
    }
}
