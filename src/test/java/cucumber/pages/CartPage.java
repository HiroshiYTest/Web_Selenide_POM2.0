package cucumber.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CartPage {
    public SelenideElement removeButton = $(byText("Remove"));
    public SelenideElement checkoutButton = $x("//*[@id='checkout']");
    public SelenideElement continueShoppingButton = $x("//*[@id='continue-shopping']");
}
