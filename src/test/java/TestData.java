import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class TestData {

  SelenideElement body = $("body");

  public static List<String> textList = new ArrayList<>();

  static {
    textList.add("Кредитная карта");
    textList.add("Альфа-Счёт");
    textList.add("Первый в России Альфа-Стикер");
    textList.add("Ипотека от 5,5%");
    textList.add("Кредит наличными");
    textList.add("Инвестиции");
  }


  public static List<String> footerList = new ArrayList<>();

  static {
    footerList.add("О банке");
    footerList.add("Вакансии");
    footerList.add("Реквизиты");
    footerList.add("Пресс-служба");
    footerList.add("Тарифы и документы");
    footerList.add("Иностранным гражданам");
    footerList.add("Закупки");
    footerList.add("Безопасность");
    footerList.add("Обратная связь");
    footerList.add("Пожаловаться на звонки");
    footerList.add("Карта сайта");
    footerList.add("Должникам и взыскателям");
    footerList.add("Справочный центр");
    footerList.add("Отзывы клиентов");
  }


  public static List<String> calculateList = new ArrayList<>();

  static {
    calculateList.add("3 месяца");
    calculateList.add("6 месяцев");
    calculateList.add("9 месяцев");
    calculateList.add("1 год");
    calculateList.add("1,5 года");
    calculateList.add("2 года");
    calculateList.add("3 года");
  }

  public void buttons() {
    $("[data-test-id^='period-btn-3']").shouldHave(text("3 месяца"));
    $("[data-test-id^='period-btn-6']").shouldHave(text("6 месяцев"));
    $("[data-test-id^='period-btn-9']").shouldHave(text("9 месяцев"));
    $("[data-test-id^='period-btn-12']").shouldHave(text("1 год"));
    $("[data-test-id^='period-btn-18']").shouldHave(text("1,5 года"));
    $("[data-test-id^='period-btn-24']").shouldHave(text("2 года"));
    $("[data-test-id^='period-btn-36']").shouldHave(text("3 года"));
  }


  public static List<String> actualList = new ArrayList<>();

  static {
    actualList.add("Альфа-Счёт");
    actualList.add("Альфа-Вклад");
    actualList.add("Брокерский счёт");
    actualList.add("Альфа-Карта Премиум");
    actualList.add("Зарплатная Альфа-Карта");
    actualList.add("Защита от мошенников");
    actualList.add("Самозанятые");
  }

  void actual() {
    ElementsCollection buttonList = $$("[id^=Main-Page-Important-Info] div p:nth-child(1)");
    TestData.actualList.forEach(e -> buttonList.find(Condition.text(e)).should(visible));
  }

  void footer() {
    $$(".c2Tco p").shouldHave(texts(TestData.footerList));
  }

  void buttonANewCustomer(){
    {
      body.$(byText("СТАТЬ КЛИЕНТОМ")).click();
      body.shouldHave(text("Кредитная карта"));
      body.shouldHave(text("Дебетовая Альфа-Карта"));
      body.shouldHave(text("Альфа-Карта Premium"));
      body.shouldHave(text("Кредит наличными"));
      body.shouldHave(text("Рефинансирование кредита"));
      body.shouldHave(text("Счёт для малого бизнеса"));
      body.shouldHave(text("Брокерский счёт"));
      body.shouldHave(text("Ипотека"));
    }
  }
  void popular(){
    $$("[id^='Main-Page-Promo-Cards']+div").shouldHave(texts(TestData.textList));
  }
}
