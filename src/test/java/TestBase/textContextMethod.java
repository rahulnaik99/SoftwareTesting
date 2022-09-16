package TestBase;

import PageObject.PageObjectManager;
import PageObject.CheckOutPage;
import PageObject.mainPageObject;
import commonMethods.commonMethod;
import org.openqa.selenium.WebDriver;

public class textContextMethod {
    public WebDriver driver;
    public TestBase testbase;


    public PageObjectManager pageobjectmanager;
    public commonMethod common;
    public mainPageObject homepageobject;
    public CheckOutPage chkoutpage;
    public textContextMethod() {
        testbase = new TestBase();
        pageobjectmanager = new PageObjectManager(testbase.WebDriverManager());
        common = new commonMethod(testbase.driver);
        homepageobject=new mainPageObject(testbase.driver);
        chkoutpage=new CheckOutPage(testbase.driver);


    }
}
