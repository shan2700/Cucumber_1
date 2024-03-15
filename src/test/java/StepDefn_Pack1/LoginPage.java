package StepDefn_Pack1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

        @FindBy(id = "continue")
        public static WebElement continueButton;
        @FindBy(xpath = "//div[contains(text(),\"Enter your email or mobile phone number\")]")
        public static WebElement error;
    }

