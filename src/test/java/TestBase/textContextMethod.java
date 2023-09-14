package TestBase;

import PageObject.PageObjectManager;

public class textContextMethod {

    public TestBase testbase;


    public PageObjectManager pageobjectmanager;

    public textContextMethod() {
        testbase = new TestBase();
        pageobjectmanager = new PageObjectManager(testbase.WebDriverManager());



    }
}
