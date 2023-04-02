import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import static com.codeborne.selenide.Selenide.open;

public class BeforeAfter {

  @BeforeAll
  public static void beforeAll() {
    Configuration.browserSize = System.getProperty("windowSize", "1920x1080");
    Configuration.browser = System.getProperty("browser", "chrome");
    Configuration.browserVersion = System.getProperty("version", "100.0");
    Configuration.remote = System.getProperty("remoteUrl");
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("enableVNC", true);
    capabilities.setCapability("enableVideo", true);
    Configuration.browserCapabilities = capabilities;
    Configuration.baseUrl = "https://alfabank.ru/";
    Configuration.browserSize = "1920x1080";

    SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    //  Configuration.holdBrowserOpen = true;


  }

  @BeforeEach
  void beforeEach() {
    open("https://alfabank.ru/");
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
