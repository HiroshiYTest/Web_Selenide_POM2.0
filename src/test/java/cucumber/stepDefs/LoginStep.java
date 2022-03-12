package cucumber.stepDefs;

import cucumber.pages.LoginPage;
import io.cucumber.java.en.Given;

import static com.codeborne.selenide.Selenide.*;
import cucumber.dataModel.UserDataReader;

public class LoginStep {
    private UserDataReader userDataReader;
    LoginPage loginPage = page(LoginPage.class);

    public LoginStep(UserDataReader userDataReader){
        this.userDataReader = userDataReader;
    }

    @Given("I login to SwagLabs account as {string}")
    public void iLoginToSwagLabsAccountAs(String validUser) {
        String username = this.userDataReader.getUserProfile(validUser).getUsername();
        String password = this.userDataReader.getUserProfile(validUser).getPassword();

        loginPage.usernameInput.val(username);
        loginPage.passwordInput.val(password);
        loginPage.loginButtonInput.click();
    }
}
