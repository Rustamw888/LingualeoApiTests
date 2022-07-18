# Проект по автоматизации тестирования API для сайта по изучению английского языка Lingualeo
## <a target="_blank" href="https://lingualeo.com/ru">Веб сайт Lingualeo</a>

![This is an image](https://i.imgur.com/htHScLw.png)

## :rocket: Содержание:

- [x] <a href="#rocket-технологии-и-инструменты">Технологии и инструменты</a>
- [x] <a href="#rocket-реализованные-проверки">Реализованные проверки</a>
- [x] <a href="#rocket-сборка-в-Jenkins">Сборка в Jenkins</a>
- [x] <a href="#rocket-запуск-из-терминала">Запуск из терминала</a>
- [x] <a href="#rocket-allure-отчет">Allure отчет</a>
- [x] <a href="#rocket-интеграция-с-allure-testops">Интеграция с Allure TestOps</a>
- [x] <a href="#rocket-интеграция-с-jira">Интеграция с Jira</a>
- [x] <a href="#rocket-отчет-в-telegram">Отчет в Telegram</a>

## :rocket: Технологии и инструменты
<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="6%" title="AllureTestOps" src="images/logo/AllureTestOps.svg">
<img width="6%" title="Git" src="images/logo/Git.svg">
<img width="6%" title="RestAssured" src="images/logo/RestAssured.svg">
<img width="6%" title="Jira" src="images/logo/Jira.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="6%" title="Telegram" src="images/logo/Telegram.svg">
</p>

## :rocket: Реализованные проверки это смоук тесты
![This is an image](https://i.imgur.com/Dd62Cq5.png)
- Проверка тематического блока с использованием junit 
- Проверка тематического блока с помощью регулярных выражений 
- Проверка блока грамматики с помощью junit 
- Проверка блока грамматики с использованием регулярных выражений 
- Проверка ключевых значений 
- Соответствие схеме Json 
- Проверка вывода музыкального блока 
- Проверка вывода музыкального блока с недопустимыми значениями 
- Активация промокода с недопустимым значением

## :rocket: Сборка в Jenkins
### <a target="_blank" href="https://jenkins.autotests.cloud/job/LingualeoApiTestsRustam/">Сборка в Jenkins</a>
<p align="center">
<img title="Jenkins Dashboard" src="images/screenshots/jenkins_dashboard.png">
</p>

### Параметры сборки в Jenkins:
Сборка в Jenkins

- task (выбор таски)
- threads (количество потоков)

## :rocket: Запуск из терминала
Локальный запуск:
```
gradle clean test - общий запуск тестов
gradle clean tabs - запуск блока вкладок
gradle clean search - запуск блока поиска
gradle clean activation - запуск блока активации
```

Удаленный запуск:
```
clean
${TASK}
```

## :rocket: Allure отчет
- ### Главный экран отчета
<p align="center">
<img title="Allure Overview Dashboard" src="images/screenshots/report_main_page.png">
</p>

- ### Страница с проведенными тестами (suites)
<p align="center">
<img title="Allure Test Page" src="images/screenshots/allure_suites_1.png">
</p>

- ### Страница с пакетами тестов
<p align="center">
<img title="Allure Overview Dashboard" src="images/screenshots/allure_packages.png">
</p>

- ### Страница с графиком прохождения тестов
<p align="center">
<img title="Allure Overview Dashboard" src="images/screenshots/allure_schedule.png">
</p>

## :rocket: Интеграция с Allure TestOps
- ### Экран с результатами запуска тестов
<p align="center">
<img title="TestOps Launch Page" src="images/screenshots/test_results_ATO.png">
</p>

- ### Экран с launches после интеграции с IDE + график
<p align="center">
<img title="TestOps Launch Page" src="images/screenshots/launches_ATO.png">
</p>

- ### Экран с дашбордами и тестами в TestOps auto + manual
<p align="center">
<img title="TestOps Launch Page" src="images/screenshots/dashboards_ATO.png">
</p>

- ### Страница с тест кейсами в TestOps
<p align="center">
<img title="TestOps tests page" src="images/screenshots/test_cases_ATO.png">
</p>

- ### Страница с тест ранами в TestOps auto + manual
<p align="center">
<img title="TestOps tests page" src="images/screenshots/test_runs_ATO.png">
</p>

## :rocket: Интеграция с Jira
- ### Страница с задачей в Jira
<p align="center">
<img title="Jira issue" src="images/screenshots/jira_task.png">
</p>

## :rocket: Отчет в Telegram
<p align="center">
<img title="Telegram notification message" src="images/screenshots/telegram_report.png">
</p>

Локальный запуск:
```
java "-DconfigFile=notifications/telegram.json" -jar allure-notifications-4.2.0.jar

```



