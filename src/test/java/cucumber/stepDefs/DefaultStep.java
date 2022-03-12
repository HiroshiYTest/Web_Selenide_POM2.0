package cucumber.stepDefs;

import com.codeborne.selenide.Condition;
import cucumber.pages.DefaultPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.page;

public class DefaultStep {
    DefaultPage defaultPage = page(DefaultPage.class);

    @Then("I am in default Page in SwagLabs")
    public void iAmInDefaultPageInSwagLabs() {
        defaultPage.applogoDiv.shouldHave(Condition.appear);
    }

    @When("I add {string} into my cart")
    public void iAddIntoMyCart(String arg0) {
        defaultPage.inventoryitemDiv1.click();
    }

    @When("I click on cart icon")
    public void iClickOnCartIcon() {
        defaultPage.shoppingcartIcon.click();
    }
}
