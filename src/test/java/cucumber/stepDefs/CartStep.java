package cucumber.stepDefs;

import cucumber.pages.CartPage;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.page;

public class CartStep {
    CartPage cartPage = page(CartPage.class);

    @When("I click on checkout button")
    public void iClickOnCheckoutButton() {
        cartPage.checkoutButton.click();
    }
}
