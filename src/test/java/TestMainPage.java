import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestMainPage extends TestData {



  @BeforeAll
  static void beforeAll() {
    Configuration.baseUrl = "https://alfabank.ru/";
    Configuration.browserSize = "1920x1080";
    open("https://alfabank.ru/");
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
}
