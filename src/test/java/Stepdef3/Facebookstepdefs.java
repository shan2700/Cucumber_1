package Stepdef3;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.assertTrue;
public class Facebookstepdefs {
    WebDriver driver= new ChromeDriver();

    @Given("user navigate to login page of facebook")
    public void user_navigate_to_login_page_of_facebook(){
        String facebookloginurl = "https://www.facebook.com/";
        driver.get(facebookloginurl);
    }
    @When("^user enter  (.*) and (.*)$")
    public void user_enter_the_username_and_password(String username,String password){
          driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys(password);
    }
    @And("hits login button")
    public void hits_login_button(){
        driver.findElement(By.name("login")).click();
    }
    @Then("the user should login into facebook")
    public void the_user_should_login_into_facebook(){
        assertTrue(driver.getCurrentUrl().contains("facebook.com"));
    }
}