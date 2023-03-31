import java.util.ArrayList;
import java.util.List;

public class TestData {

  public static List<String> GetTextList() {
    return textList;
  }

  public static List<String> GetFooterList() {
    return footerList;
  }

  public static List<String> GetCalculateList() {
    return calculateList;
  }

  public static List<String> GetActualList() {
    return actualList;
  }

  private static List<String> textList = new ArrayList<>();

  static {
    textList.add("Кредитная карта");
    textList.add("Альфа-Счёт");
    textList.add("Первый в России Альфа-Стикер");
    textList.add("Ипотека от 5,5%");
    textList.add("Кредит наличными");
    textList.add("Инвестиции");
  }


  private static List<String> footerList = new ArrayList<>();

  public List<String> getFooterList() {
    return footerList;
  }

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


  private static List<String> calculateList = new ArrayList<>();

  static {
    calculateList.add("3 месяца");
    calculateList.add("6 месяцев");
    calculateList.add("9 месяцев");
    calculateList.add("1 год");
    calculateList.add("1,5 года");
    calculateList.add("2 года");
    calculateList.add("3 года");
  }


  private static List<String> actualList = new ArrayList<>();

  static {
    actualList.add("Альфа-Счёт");
    actualList.add("Альфа-Вклад");
    actualList.add("Брокерский счёт");
    actualList.add("Альфа-Карта Премиум");
    actualList.add("Зарплатная Альфа-Карта");
    actualList.add("Защита от мошенников");
    actualList.add("Самозанятые");
  }
}




