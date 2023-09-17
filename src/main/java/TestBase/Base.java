package TestBase;

import CommonMethods.CommonMethodManager;
import CommonMethods.TestEvidence;
import PageObject.PageObjectManager;

import java.io.IOException;

public class Base {

    public DriverManager testbase;
    public TestEvidence Evidence;
    public PageObjectManager pageobjectmanager;
    public CommonMethodManager commonMethodManager;
    public Base() throws IOException {
        testbase = new DriverManager();
        pageobjectmanager = new PageObjectManager(testbase.WebDriverManager());
        commonMethodManager = new CommonMethodManager(testbase.WebDriverManager());



    }
}
