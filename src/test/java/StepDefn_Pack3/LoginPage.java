package StepDefn_Pack3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(id = "glow-ingress-line1")
    public static WebElement LoginName;

    @FindBy(xpath = "//div[@class=\"nav-search-field \"]//input[@class=\"nav-input nav-progressive-attribute\"]")
    public static WebElement Search;
    @FindBy(xpath = "//span[@class=\"nav-search-submit-text nav-sprite nav-progressive-attribute\"]//input[@class=\"nav-input nav-progressive-attribute\"]")
    public static WebElement SearchBox;
    @FindBy(xpath = "//span[@class=\"a-size-medium a-color-base a-text-normal\"]")
    public static WebElement MobileSelect;
    @FindBy(xpath = "//h1[@class=\"a-size-large a-spacing-none\"]")
    public static WebElement MobileVerify;

}
