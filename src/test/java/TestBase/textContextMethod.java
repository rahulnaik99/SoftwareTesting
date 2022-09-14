package TestBase;

import PageObject.PageObjectManager;
import org.openqa.selenium.WebDriver;

public class textContextMethod {
    public WebDriver driver;
    public TestBase testbase;


    public PageObjectManager pageobjectmanager;
    public textContextMethod() {
        testbase = new TestBase();
        pageobjectmanager = new PageObjectManager(testbase.WebDriverManager());
    }
}
