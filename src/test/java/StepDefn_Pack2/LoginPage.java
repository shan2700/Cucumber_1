package StepDefn_Pack2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    public static WebElement ap_email;
    @FindBy(id = "continue")
    public static WebElement continueButton;
    public static WebElement ap_password;
    public static WebElement signInSubmit;
    @FindBy(id = "nav-logo-sprites")
    public static WebElement LoginSuccessful;


}
