package Hooks;

import TestBase.textContextMethod;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Hooks {

    textContextMethod tcm;
    public Hooks(textContextMethod tcm) {
        this.tcm=tcm;

    }
    @Before
    public void BeforeScenario() throws IOException {
        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/common/global.properties");
        Properties config = new Properties();
        config.load(file);
        tcm.testbase.WebDriverManager().get(config.getProperty("URL"));
        tcm.commonMethodManager.getTestEvidence().ppt("HomePage");

    }
    @After
    public void AfterScenario() throws IOException {
    tcm.testbase.WebDriverManager().quit();
    }
}
