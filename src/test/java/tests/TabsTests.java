package tests;

import io.qameta.allure.AllureId;
import models.grammarCourcesModel.IDsItem;
import models.grammarCourcesModel.RequestBody;
import models.grammarCourcesModel.ResponseGrammarCourses;
import models.jungleModel.ResponseJungle;
import enums.EndpointsData;
import enums.SideEndpointsData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import models.thematicCoursesModel.ResponseThematicCourses;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static specs.Specs.request;
import static specs.Specs.response200;

@Tag("tabs")
public class TabsTests extends TestBase {

    @Test
    @AllureId("11388")
    @DisplayName("Thematic checking using junit")
    void thematicTest() {
        ResponseThematicCourses response = given()
                .spec(request)
                .post(EndpointsData.GET_THEMATIC_COURSES.title)
                .then()
                .spec(response200)
                .extract().as(ResponseThematicCourses.class);
        assertEquals(response.getGrammar().get(0).getUrl(), SideEndpointsData.BEGINNER.title);
        assertEquals(response.getGrammar().get(1).getUrl(), SideEndpointsData.MIDDLE.title);
        assertEquals(response.getGrammar().get(2).getUrl(), SideEndpointsData.ADVANCED.title);
    }

    @Test
    @AllureId("11383")
    @DisplayName("Thematic using regular expressions")
    void thematicWithExpressionsTest() {
        given()
                .spec(request)
                .post(EndpointsData.GET_THEMATIC_COURSES.title)
                .then()
                .spec(response200)
                .body("thematic[0].courses.findAll{it.picture =~/.*?.png/}.picture.flatten()",
                        hasItem("https://contentcdn.lingualeo.com/content_collection/1587386132119529/icon/1520276897.png"));
    }

    @Test
    @AllureId("11382")
    @DisplayName("Grammar checking using junit")
    void grammarTest() {
        List<IDsItem> list = new ArrayList<>();
        IDsItem item = new IDsItem();
        list.add(item);

        RequestBody body = new RequestBody();
        body.setApiVersion("1.0.0");
        body.setCourseId(0);
        body.setCourseName("grammar");
        body.setIDs(list);
        ResponseGrammarCourses response = given()
                .spec(request)
                .body(body)
                .post(EndpointsData.GET_GRAMMAR_COURSES.title)
                .then()
                .spec(response200)
                .extract().as(ResponseGrammarCourses.class);
        assertEquals(response.getName(), "Grammar Courses");
        assertTrue(response.getTotalUsers() >= 2896459);
    }

    @Test
    @AllureId("11382")
    @DisplayName("Grammar using regular expressions")
    void grammarTestWithExpressionsTest() {
        List<IDsItem> list = new ArrayList<>();
        IDsItem item = new IDsItem();
        item.setY("1658067925886203486");
        item.setG("814517265.1658067925");
        list.add(item);

        RequestBody body = new RequestBody("1.0.0", 0, "grammar", list);
        given()
                .spec(request)
                .body(body)
                .post(EndpointsData.GET_GRAMMAR_COURSES.title)
                .then()
                .spec(response200)
                .body("category.modules.findAll{it.isFinished =~/.*?0/}.isFinished.flatten()", hasItem(0));
    }

    @Test
    @AllureId("11387")
    @DisplayName("Key values checking")
    void jungleTest() {
        ResponseJungle response = given()
                .spec(request)
                .post(EndpointsData.GET_JUNGLE_CATEGORIES.title)
                .then()
                .spec(response200)
                .extract().as(ResponseJungle.class);
        assertEquals(response.getData().get(0).getKey(), "books");
        assertEquals(response.getData().get(1).getKey(), "short_stories_and_articles");
    }

    @Test
    @AllureId("11379")
    @DisplayName("Matches Json schema")
    void matchesJsonSchema() {
        given()
                .spec(request)
                .post(EndpointsData.GET_JUNGLE_CATEGORIES.title)
                .then()
                .spec(response200)
                .body(matchesJsonSchemaInClasspath("jsons/jungle.json"))
                .extract().as(ResponseJungle.class);
    }
}
