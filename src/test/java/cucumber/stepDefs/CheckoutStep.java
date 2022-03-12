package cucumber.stepDefs;

import com.codeborne.selenide.Condition;
import cucumber.pages.CheckoutPage;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.page;

public class CheckoutStep {
    CheckoutPage checkoutPage = page(CheckoutPage.class);

    @When("I set following information")
    public void iSetFollowingInformation() {
        checkoutPage.applogoDiv.shouldHave(Condition.appear);
        checkoutPage.titleSpan.shouldHave(Condition.appear);
        checkoutPage.firstNameInput.setValue("Taro");
        checkoutPage.lastNameInput.setValue("Yamada");
        checkoutPage.postalCodeInput.setValue("0930");
        checkoutPage.continueInput.click();
    }
}
