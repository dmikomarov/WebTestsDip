import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.open;


public class TestMainPage extends BeforeAfter {


  @Tag("Regress")
  @DisplayName("Проверка наличия популярных продуктов на главной странице")
  @Test
  void checkPopularProducts() {
    HelpMethods.popular();
  }

  @Tag("Regress")
  @DisplayName("Проверка наличия актуальных предложений на главной странице")
  @Test
  void checkActualOffer() {

    HelpMethods.actual();
  }

  @Tag("Regress")
  @DisplayName("Проверка списка элементов в футере - О банке...")
  @Test
  void checkButtonsInFooterOnMainList() {
    HelpMethods.footer();
  }

  @Tag("Regress")
  @DisplayName("Проверка кнопок 'сроки кредитования' в калькуляторе")
  @Test
  void checkButtonsInCalculate() {
    HelpMethods.buttons();
  }

  @Tag("Regress")
  @DisplayName("Переход на страницу 'Стать клиентом' и проверка наличия всех плиток на странице предложений")
  @Test
  void CheckButtonBecomeANewCustomerOne() {
    HelpMethods.buttonANewCustomer();
  }


}
