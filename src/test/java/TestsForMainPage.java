import helpers.HelpMethods;
import org.junit.jupiter.api.*;


public class TestsForMainPage extends TestBase {


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
