package com.test.junit5testproject.controller;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;
//review and test with RestAssured library all system and methods
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@AutoConfigureMockMvc
class WarningControllerTestWithRestAssuredLibrary {

    @Test
    void getWarning() {
        RestAssured.given()
                .param("warning","World")
                .when()
                .get("http://localhost:1234/warning")
                .then()
                .statusCode(200)
            //    .cookie("is ok",false)
                .body(equalTo("Hello, World"));

    }
}