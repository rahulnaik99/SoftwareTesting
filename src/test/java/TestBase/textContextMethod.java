package TestBase;

import PageObject.PageObjectManager;

import java.io.IOException;

public class textContextMethod {

    public TestBase testbase;

    public PageObjectManager pageobjectmanager;

    public textContextMethod() throws IOException {
        testbase = new TestBase();
        pageobjectmanager = new PageObjectManager(testbase.WebDriverManager());



    }
}
