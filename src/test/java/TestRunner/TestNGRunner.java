package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions( features="src/test/resources/Features/Seach and Add product to the Cart.feature",glue={"StepDefinartions","Hooks"},
plugin={"html:src/TestEvidences/HTML/cucumber.html","json:src/TestEvidences/HTML/cucumber.json"})
public class TestNGRunner extends AbstractTestNGCucumberTests {
}
