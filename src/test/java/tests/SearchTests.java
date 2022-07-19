package tests;

import com.github.javafaker.Faker;
import io.qameta.allure.AllureId;
import models.searchModel.IDsItemSearch;
import models.searchModel.RequestSearchContent;
import models.searchModel.ResponseSearchModel;
import network.EndpointsData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;
import static specs.Specs.request;
import static specs.Specs.response200;

@Tag("search")
public class SearchTests extends TestBase {

    @Test
    @AllureId("11381")
    @DisplayName("Checking the output of the music block")
    void musicVideoTest() {
        List<IDsItemSearch> list = new ArrayList<>();
        IDsItemSearch item = new IDsItemSearch();
        list.add(item);

        RequestSearchContent body = new RequestSearchContent();
        body.setApiVersion("1.0.0");
        body.setCategoryId("rock");
        body.setCategoryType("music");
        body.setIDs(list);
        body.setSearch("slayer");

        given()
                .spec(request)
                .body(body)
                .post(EndpointsData.GET_JUNGLE_SEARCH.title)
                .then()
                .spec(response200)
                .body("data.findAll{it.wordValue =~/slayer/}.wordValue.flatten()", hasItem("slayer"))
                .body("status", is("ok"));
    }

    @Test
    @AllureId("11384")
    @DisplayName("Checking the output of the music block with invalid values")
    void negativeMusicVideoTest() {
        List<IDsItemSearch> list = new ArrayList<>();
        IDsItemSearch item = new IDsItemSearch();
        list.add(item);
        Faker faker = new Faker();

        RequestSearchContent body = new RequestSearchContent();
        body.setApiVersion("1.0.0");
        body.setCategoryId("rock");
        body.setCategoryType("music");
        body.setIDs(list);
        body.setSearch(faker.chuckNorris().fact());

        given()
                .spec(request)
                .body(body)
                .post(EndpointsData.GET_JUNGLE_SEARCH.title)
                .then()
                .spec(response200)
                .body("data", empty());
    }

    @Test
    @AllureId("11385")
    @DisplayName("Checking the result matches with Json schema")
    void musicVideoMatchesJsonSchemaTest() {
        List<IDsItemSearch> list = new ArrayList<>();
        IDsItemSearch item = new IDsItemSearch();
        list.add(item);

        RequestSearchContent body = new RequestSearchContent();
        body.setApiVersion("1.0.0");
        body.setCategoryId("rock");
        body.setCategoryType("music");
        body.setIDs(list);
        body.setSearch("slayer");

        given()
                .spec(request)
                .body(body)
                .post(EndpointsData.GET_JUNGLE_SEARCH.title)
                .then()
                .spec(response200)
                .body(matchesJsonSchemaInClasspath("jsons/search.json"))
                .extract().as(ResponseSearchModel.class);
    }
}
