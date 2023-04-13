import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.WebDriverProvider;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    @BeforeAll
    public static void beforeAll() {
        WebDriverProvider webDriverProvider = new WebDriverProvider();
    }

    @BeforeEach
    void beforeEach() {
        open("https://alfabank.ru/");
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        Selenide.clearBrowserCookies();
    }


    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last Screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        Selenide.closeWebDriver();
    }

}
