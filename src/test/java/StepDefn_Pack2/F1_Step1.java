package StepDefn_Pack2;
import StepDefn_Pack3.F1_Step2;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.PageFactory;

import static Web_start.Navigation.driver;

public class F1_Step1 {
        public F1_Step1() {
            PageFactory.initElements(driver, StepDefn_Pack2.LoginPage.class);
        }

        @Given("User should be in SignIn Page")
        public void user_should_be_in_sign_in_page() {
                System.out.println("We are in SignIn page...");
        }

        @And("User should enter {string} in the Email or mobile phone number dialog")
        public void user_should_enter_in_the_email_or_mobile_phone_number_dialog(String string) {
            LoginPage.ap_email.click();
            LoginPage.ap_email.sendKeys(string);
        }

        @And("User should clicks on the Continue Button")
        public void user_should_clicks_on_the_continue_button() {
            LoginPage.continueButton.click();
        }

        @And("User should enter the password as {string}")
        public void user_should_enter_the_password(String string) {
            LoginPage.ap_password.click();
            LoginPage.ap_password.sendKeys(string);
        }

        @When("User clicks on the Sign In button")
        public void user_clicks_on_the_sign_in_button() {
            LoginPage.signInSubmit.click();
        }

        @Then("User should allow to login successful")
        public void user_should_allow_to_login_successful() {
            if (LoginPage.LoginSuccessful.isDisplayed())
                System.out.println("Scenario - 2 have executed properly:) ");
            F1_Step2 o = new F1_Step2();
        }
    }

