package StepDefn_Pack1;


import StepDefn_Pack2.F1_Step1;
import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import static Web_start.Navigation.driver;


public class F1_step {
        public F1_step() {
            PageFactory.initElements(driver, MainPage.class);
            PageFactory.initElements(driver, LoginPage.class);
        }

        @And("User should click on the SignsIn Button")
        public void user_should_click_on_the_signs_in_button() {
            Actions act = new Actions(driver);
            act.moveToElement(MainPage.SignIn);
            MainPage.SignIn.click();
        }

        @When("User clicks on the continue button")
        public void user_clicks_on_the_continue_button() {
            LoginPage.continueButton.click();
        }

        @Then("User have not allowed to the continue")
        public void userHaveNotAllowedToTheContinue() {
            if (LoginPage.error.isDisplayed())
                System.out.println("Scenario - 1 have executed properly :) ");
            F1_Step1 o = new F1_Step1();
        }



}