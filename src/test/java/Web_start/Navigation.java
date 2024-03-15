package Web_start;

import StepDefn_Pack1.F1_step;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
   public static WebDriver driver = new ChromeDriver();
    @Given("User should navigate to the webpage of Amazon")
    public void user_should_navigate_to_the_webpage_of_amazon() {
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        F1_step o1 = new F1_step();
    }


}
