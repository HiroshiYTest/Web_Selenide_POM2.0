package cucumber.stepDefs;

import com.codeborne.selenide.Condition;
import cucumber.pages.OverviewPage;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Selenide.page;

public class OverviewStep {
    OverviewPage overviewPage = page(OverviewPage.class);

    @Then("I click on Finish button to end this transaction")
    public void iClickOnFinishButtonToEndThisTransaction() {
        overviewPage.applogoDiv.shouldHave(Condition.appear);
        overviewPage.titleSpan.shouldHave(Condition.appear);
        overviewPage.finishButton.click();
    }
}
