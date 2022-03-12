package cucumber.hooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.open;
import cucumber.contexts.TestContext;
import cucumber.utils.ConfigLoader;

public class CucumberHooks {
    private WebDriver driver;
    private final TestContext context;

    public CucumberHooks(TestContext context){
        this.context = context;
    }

    @Before
    public void setUp() {
        System.out.println("Starting Browser...");

        Configuration.baseUrl = ConfigLoader.getInstance().getBaseUrl();
        Configuration.browser = "chrome";
        Configuration.headless = true;
        Configuration.holdBrowserOpen = false;
        Configuration.pageLoadStrategy = "normal";
        Configuration.screenshots = true;
        Configuration.fastSetValue = false;

        // For Selenium Grid
//        Configuration.remote =
//        Configuration.reportsFolder =
//        Configuration.headless = false;
//        Configuration.proxyEnabled = true;
//        Configuration.proxyHost = "0.0.0.0";
//        Configuration.fileDownload = PROXY;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
        open(ConfigLoader.getInstance().getBaseUrl());
    }

    @After
    public void tearDown() {
    }

//    @Attachment(type = "image/png")
//    public byte[] screenshot() throws IOException {
//        File screenshot = Screenshots.getLastScreenshot();
//        return screenshot == null ? null : Files.toByteArray(screenshot);
//    }
}
