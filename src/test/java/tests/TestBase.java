package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.CustomApiListener;
import io.qameta.allure.selenide.AllureSelenide;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        Configuration.baseUrl = "https://lingualeo.com/ru";
        RestAssured.baseURI = "https://api.lingualeo.com";
        RestAssured.filters(CustomApiListener.withCustomTemplates());
    }
}
