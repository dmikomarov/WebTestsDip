import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

public class HelpMethods {
  static SelenideElement body = $("body");

  static void actual() {
    ElementsCollection buttonList = $$("[id^=Main-Page-Important-Info] div p:nth-child(1)");
    TestData.GetActualList().forEach(e -> buttonList.find(Condition.text(e)).should(visible));
  }

  static void footer() {
    $$(".c2Tco p").shouldHave(texts(TestData.GetFooterList()));
  }

  static void buttonANewCustomer() {
    {
      step("Открываем главную страницу и нажимаем на кнопку", () -> {
        body.$(byText("СТАТЬ КЛИЕНТОМ")).click();
      });
      step("ОПроверяем наличие плиток", () -> {
        body.shouldHave(text("Кредитная карта"));
        body.shouldHave(text("Дебетовая Альфа-Карта"));
        body.shouldHave(text("Альфа-Карта Premium"));
        body.shouldHave(text("Кредит наличными"));
        body.shouldHave(text("Рефинансирование кредита"));
        body.shouldHave(text("Счёт для малого бизнеса"));
        body.shouldHave(text("Брокерский счёт"));
        body.shouldHave(text("Ипотека"));
      });

    }
  }

  static void popular() {
    $$("[id^='Main-Page-Promo-Cards']+div").shouldHave(texts(TestData.GetTextList()));
  }

  public static void buttons() {
    $("[data-test-id^='period-btn-3']").shouldHave(text("3 месяца"));
    $("[data-test-id^='period-btn-6']").shouldHave(text("6 месяцев"));
    $("[data-test-id^='period-btn-9']").shouldHave(text("9 месяцев"));
    $("[data-test-id^='period-btn-12']").shouldHave(text("1 год"));
    $("[data-test-id^='period-btn-18']").shouldHave(text("1,5 года"));
    $("[data-test-id^='period-btn-24']").shouldHave(text("2 года"));
    $("[data-test-id^='period-btn-36']").shouldHave(text("3 года"));
  }
}
