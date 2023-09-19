package Hooks;

import TestBase.Base;
import io.cucumber.java.Before;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Hooks {

    Base Base;
    public Hooks(Base Base) {
        this.Base=Base;

    }
    @Before
    public void BeforeScenario() throws IOException {
        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/common/global.properties");
        Properties config = new Properties();
        config.load(file);
        Base.testbase.WebDriverManager().get(config.getProperty("URL"));
        Base.testbase.WebDriverManager().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Base.commonMethodManager.getTestEvidence().ppt("HomePage");

    }
//    @After
//    public void AfterScenario() throws IOException {
//    Base.testbase.WebDriverManager().quit();
//    }
}
