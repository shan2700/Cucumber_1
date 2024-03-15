package Stepdef3;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.assertTrue;

public class Loginstepdef {
       WebDriver driver= new ChromeDriver() ;
    @Given("user navigate to login page of facebook")
    public void user_navigate_to_login_page_of_facebook(){
        String facebookloginurl = "https://www.facebook.com/";
        driver.get(facebookloginurl);
    }
    @When("user enter the invalid credentials")
    public void user_enter_the_invalid_credentials(){
    driver.findElement(By.id("email")).sendKeys("shan");
    driver.findElement(By.id("pass")).sendKeys("1234");
    }
    @And("hits login button")
    public void hits_login_button(){
     driver.findElement(By.name("login")).click();
    }
    @Then("the user should see error message")
    public void the_user_should_see_error_message(){
        assertTrue(driver.getCurrentUrl().contains("facebook.com"));
    }
    @Before
    @Given("user navigate to google home page")
    public void user_navigate_to_google_home_page() {
        String googleloginurl = "https://www.google.com/";
        driver.get(googleloginurl);
    }
    @After
    public void setup(){
        driver.quit();
    }
}

