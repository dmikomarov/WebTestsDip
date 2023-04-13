package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public static String creditcard = "Кредитная карта",
            debitCard = "Дебетовая Альфа-Карта",
            premiumCard = "Альфа-Карта Premium",
            creditNal = "Кредит наличными",
            creditRefinance = "Рефинансирование кредита",
            smallBusinessAccount = "Счёт для малого бизнеса",
            brokerageAccount = "Брокерский счёт",
            ipoteka = "Ипотека";

    public static SelenideElement
            threeMonths = $("[data-test-id^='period-btn-3']"),
            sixMonths = $("[data-test-id^='period-btn-6']"),
            nineMonths = $("[data-test-id^='period-btn-9']"),
            twelveMonths = $("[data-test-id^='period-btn-12']"),
            eighteenMonths = $("[data-test-id^='period-btn-18']"),
            twentyFourMonths = $("[data-test-id^='period-btn-24']"),
            thirtySixMonths = $("[data-test-id^='period-btn-36']");
}

