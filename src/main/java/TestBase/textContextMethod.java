package TestBase;

import CommonMethods.CommonMethodManager;
import CommonMethods.TestEvidence;
import PageObject.PageObjectManager;

import java.io.IOException;

public class textContextMethod {

    public TestBase testbase;
    public TestEvidence Evidence;
    public PageObjectManager pageobjectmanager;
    public CommonMethodManager commonMethodManager;
    public textContextMethod() throws IOException {
        testbase = new TestBase();
        pageobjectmanager = new PageObjectManager(testbase.WebDriverManager());
        commonMethodManager = new CommonMethodManager(testbase.WebDriverManager());



    }
}
