package cucumber.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
    public SelenideElement usernameInput = $x("//*[@id='user-name']");
    public SelenideElement passwordInput = $x("//*[@id='password']");
    public SelenideElement loginButtonInput = $x("//*[@id='login-button']");
}
