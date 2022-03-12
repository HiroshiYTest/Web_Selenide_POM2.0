package cucumber.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CheckoutPage {
    public SelenideElement applogoDiv = $x("//div[@class='app_logo']");
    public SelenideElement titleSpan = $(byText("Checkout: Your Information"));
    public SelenideElement firstNameInput = $x("//*[@id='first-name']");
    public SelenideElement lastNameInput = $x("//*[@id='last-name']");
    public SelenideElement postalCodeInput = $x("//*[@id='postal-code']");
    public SelenideElement backimageImg = $x("//img[@alt='Go back']");
    public SelenideElement continueInput = $x("//*[@id='continue']");
}
