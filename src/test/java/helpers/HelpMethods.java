package helpers;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import pages.MainPage;
import testdata.ButtonsNames;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

public class HelpMethods {
    static SelenideElement body = $("body");

    public static void actual() {
        ElementsCollection buttonList = $$("[id^=Main-Page-Important-Info] div p:nth-child(1)");
        ButtonsNames.GetActualList().forEach(e -> buttonList.find(Condition.text(e)).should(visible));
    }

    public static void footer() {
        $$(".c2Tco p").shouldHave(texts(ButtonsNames.GetFooterList()));
    }

    public static void buttonANewCustomer() {
        {
            step("Открываем главную страницу и нажимаем на кнопку", () -> {
                body.$(byText("СТАТЬ КЛИЕНТОМ")).click();
            });
            step("Проверяем наличие плиток", () -> {
                body.shouldHave(text(MainPage.creditcard));
                body.shouldHave(text(MainPage.debitCard));
                body.shouldHave(text(MainPage.premiumCard));
                body.shouldHave(text(MainPage.creditNal));
                body.shouldHave(text(MainPage.creditRefinance));
                body.shouldHave(text(MainPage.smallBusinessAccount));
                body.shouldHave(text(MainPage.brokerageAccount));
                body.shouldHave(text(MainPage.ipoteka));
            });

        }
    }

    public static void popular() {
        $$("[id^='Main-Page-Promo-Cards']+div").shouldHave(texts(ButtonsNames.GetTextList()));
    }

    public static void buttons() {
        MainPage.threeMonths.shouldHave(text("3 месяца"));
        MainPage.sixMonths.shouldHave(text("6 месяцев"));
        MainPage.nineMonths.shouldHave(text("9 месяцев"));
        MainPage.twelveMonths.shouldHave(text("1 год"));
        MainPage.eighteenMonths.shouldHave(text("1,5 года"));
        MainPage.twentyFourMonths.shouldHave(text("2 года"));
        MainPage.thirtySixMonths.shouldHave(text("3 года"));
    }
}
