package StepDefn_Pack3;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import java.util.Set;
import static Web_start.Navigation.driver;

public class F1_Step2 {
    String s;

    public F1_Step2() {
        PageFactory.initElements(driver, LoginPage.class);
    }
    @Given("User should be logined successfully")
    public void user_should_be_logined_successfully() {
            System.out.println("User Logined Successfully...");
    }
    @And("User clicks on the search box and enters {string} in search box")
    public void user_clicks_and_enters_in_search_box(String string) {
        LoginPage.Search.click();
        LoginPage.Search.sendKeys(string);
    }
    @And("User click search button")
    public void user_click_search_button() {
        LoginPage.SearchBox.click();
    }
    @When("User click on the specific mobile")
    public void user_click_on_the_specific_mobile() {
        String ParentPageAddress = driver.getWindowHandle();
        LoginPage.MobileSelect.click();
        Set<String> WHs = driver.getWindowHandles();
        for (String windowHandle : WHs) {
            if (WHs.equals(ParentPageAddress)) {
                driver.switchTo().window(windowHandle);
            }
        }
    }
    @Then("selected item has shown successfully")
    public void selected_item_has_shown_successfully() {
        if (LoginPage.MobileVerify.isDisplayed())
            System.out.println("Scenario - 3 have executed properly :) ");
    }


}
