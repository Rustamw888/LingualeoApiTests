package tests;

import com.github.javafaker.Faker;
import io.qameta.allure.AllureId;
import models.activationModel.RequestActivation;
import enums.EndpointsData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static specs.Specs.request;
import static specs.Specs.response200;

@Tag("activation")
public class PromoActivationTests extends TestBase {

    @Test
    @AllureId("11380")
    @DisplayName("Activating a promo code with a non-valid value")
    void setInvalidPromoTest() {
        Faker faker = new Faker();
        RequestActivation body = new RequestActivation();
        body.setApiVersion("1.0.0");
        body.setApiCall("process_training");
        body.setPromoCode(faker.animal().name());
        body.setTrainingName("setpromocode");

        given()
                .spec(request)
                .body(body)
                .post(EndpointsData.GET_PROMO.title)
                .then()
                .spec(response200)
                .body("data.status", is("incorrect"))
                .body("status", is("ok"));
    }
}
