package cucumber.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class OverviewPage {
    public SelenideElement applogoDiv = $x("//div[@class='app_logo']");
    public SelenideElement titleSpan = $(byText("Checkout: Overview"));
    public SelenideElement checkoutButton = $x("//*[@id='cancel']");
    public SelenideElement finishButton = $x("//*[@id='finish']");
}
