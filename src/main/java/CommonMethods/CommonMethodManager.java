package CommonMethods;

import org.openqa.selenium.WebDriver;

public class CommonMethodManager {
    WebDriver driver;
    public CommonMethodManager(WebDriver driver) {
        this.driver=driver;
    }

    public TestEvidence getTestEvidence(){
       TestEvidence testEvidence = new TestEvidence(driver);
       return testEvidence;
   }
}
