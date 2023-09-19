package CommonMethods;

import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Random;

public class Utility {
    WebDriver driver;
    public Utility(WebDriver driver){
        this.driver=driver;
    }
    public String RandomNumberGen(){
        Random ran = new Random();
         String random = ran.ints(9).toString();
        return random;
    }
    public void Stream(){
        List<String> List = null;
        List.add("HI");

    }
}
