import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestMainPage extends TestData {



  @BeforeAll
  static void beforeAll() {
    Configuration.browserSize = System.getProperty("windowSize", "1920x1080");
    Configuration.browser = System.getProperty("browser", "chrome");
    Configuration.browserVersion = System.getProperty("version", "100.0");
    Configuration.remote = System.getProperty("remoteUrl","https://user1:1234@selenoid.autotests.cloud/wd/hub");
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("enableVNC", true);
    capabilities.setCapability("enableVideo", true);
    Configuration.browserCapabilities = capabilities;
    Configuration.baseUrl = "https://alfabank.ru/";
    Configuration.browserSize = "1920x1080";
    open("https://alfabank.ru/");
    SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    //  Configuration.holdBrowserOpen = true;
  }

  @Tag("Регресс")
  @DisplayName("Переход на страницу 'Стать клиентом' и проверка наличия всех плиток на странице предложений")
  @Test
  void becomeANewCustomerOne() {
    buttonANewCustomer();
  }

  @Tag("Регресс")
  @DisplayName("Проверка наличия популярных продуктов на главной странице")
  @Test
  void popularProducts() {
    popular();
  }

  @Tag("Regress")
  @DisplayName("Проверка наличия актуальных предложений на главной странице")
  @Test
  void searchWork() {
    actual();
  }


  @Tag("Regress")
  @DisplayName("Проверка списка элементов в футере - О банке...")
  @Test
  void footerMainList() {
    footer();
  }

  @Tag("Regress")
  @DisplayName("Проверка кнопок 'сроки кредитования' в калькуляторе")
  @Test
  void calculateButtons() {
    buttons();
  }

  @AfterEach
  void addAttachments() {
    Attach.screenshotAs("Last Screenshot");
    Attach.pageSource();
    Attach.browserConsoleLogs();
    Attach.addVideo();
  }
}
