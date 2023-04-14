<h1 >Проект автоматизации UI для сайта <a href="https://alfabank.ru/ ">alfabank.ru</a></h1>

## Содержание

* <a href="#tools">Технологии и инструменты</a>
* <a href="#cases">Реализованные проверки</a>
* <a href="#console">Запуск тестов из терминала</a>
* <a href="#jenkins">Запуск тестов в Jenkins</a>
* <a href="#allure">Отчеты в Allure</a>
* <a href="#testops">Интеграция с Allure TestOps</a>
* <a href="#testops">Интеграция с Jira</a>
* <a href="#telegram">Уведомления в Telegram с использованием бота</a>
* <a href="#video">Пример прогона теста в Selenoid</a>

<a id="tools"></a>
## Технологии и инструменты

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/logo/IntelliJ_IDEA.png">
<img width="6%" title="Java" src="images/logo/Java_logo.png">
<img width="6%" title="Selenide" src="images/logo/Selenide.png">
<img width="6%" title="Selenoid" src="images/logo/Selenoid.png">
<img width="6%" title="Allure Report" src="images/logo/AllureReports.png">
<img width="6%" title="Gradle" src="images/logo/Gradle.png">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.png">
<img width="6%" title="GitHub" src="images/logo/GitHub.png">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.png">
<img width="6%" title="Allure TestOps" src="images/logo/AllureTestOps.svg">
</p>

Автотесты написаны на <code>Java</code> с использованием <code>JUnit 5</code> и <code>Gradle</code>.
Для UI-тестов использован фреймворк [Selenide](https://selenide.org/).
Запуск тестов можно осуществлять локально или с помощью [Selenoid](https://aerokube.com/selenoid/).
Также реализована сборка в <code>Jenkins</code> с формированием Allure-отчета и отправкой уведомления с результатами в <code>Telegram</code> после завершения прогона.

Allure-отчет включает в себя:
* шаги выполнения тестов;
* скриншот страницы в браузере в момент окончания автотеста;
* Page Source;
* логи браузерной консоли;
* видео выполнения автотеста.

<a id="cases"></a>
## Реализованные проверки

### Автоматизированные проверки
- [ ] Переход на страницу 'Стать клиентом' и проверка наличия всех плиток на странице предложений
- [ ] Проверка наличия популярных продуктов на главной странице
- [ ] Проверка наличия актуальных предложений на главной странице
- [ ] Проверка списка элементов в футере - О банке...
- [ ] Проверка кнопок 'сроки кредитования' в калькуляторе

### Мануальные проверки
- [ ] Проверка кредитного калькулятора
- [ ] Проверка поисковой строки

<a id="console"></a>
##  Запуск тестов из терминала
### Локальный запуск тестов

```
gradle clean Test
```

### Удаленный запуск тестов

```
export BROWSER_PLATFORM=$(echo "${BROWSER}" | awk '{print $1}')
export BROWSER_VERSION=$(echo "${BROWSER}" | awk '{print $2}')

./gradlew clean Test \
  -Dbrowser=${BROWSER} \
  -Dversion=${VERSION} \
  -DwindowSize=${BROWSER_SIZE} \
  -DremoteUrl=${URL}
```

> `${BROWSER}` - комбинация браузера и версии (_по умолчанию - <code>chrome 100.0</code>_).
>
> `${BROWSER}` - наименование браузера (_по умолчанию - <code>chrome</code>_).
> 
> `${VERSION}` - номер версии браузера (_по умолчанию - <code>100.0</code>_).
> 
> `${BROWSER_SIZE}` - размер окна браузера (_по умолчанию - <code>1920x1080</code>_).
>
> `${URL}` - адрес удаленного сервера, на котором будут запускаться тесты.

<a id="jenkins"></a>
## Запуск тестов в Jenkins

> Сборка с параметрами позволяет перед запуском изменить параметры для сборки (путем выбора из списка или прямым указанием значения).

<p align="center">
<img src="images/screenshots/JenkinsJob.jpg"/></a>
</p>

<a id="allure"></a>
## Отчеты в Allure

### Основное окно

<p align="center">
<img src="images/screenshots/AllureReport.jpg">
</p>

### Тесты

<p align="center">
<img src="images/screenshots/AllureTestsNew.jpg">
</p>

<a id="testops"></a>
## Интеграция с Allure TestOps 

### Тест-кейсы
<p align="center">
<img src="images/screenshots/testCases.jpg">
</p>


### Пример запуска тест-кейсов
<p align="center">
<img src="images/screenshots/Launches.jpg">
</p>

<a id="jira"></a>
## Интеграция с Jira 
<p align="center">
<img src="images/screenshots/Jira.png">
</p>

<a id="telegram"></a>
## Уведомления в Telegram с использованием бота

<p>
<img src="images/screenshots/TelegramBot.png">
</p>
