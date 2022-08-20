package com.springboot.parking.controller;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

import com.springboot.parking.controller.dto.ParkingCreateDTO;

import io.restassured.RestAssured;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ParkingControllerTest extends AbstractContainerBase {
    
    @LocalServerPort
    private int randonPort;

    @Test
    void findAll() {

    }

    @BeforeEach
    public void setUpTest() {
        RestAssured.port = randonPort;
    }

    @Test
    void whenFindAllCheckResult() {
        RestAssured.given()
                .when()
                .get("/parking")
                .then()
                .statusCode(org.springframework.http.HttpStatus.OK.value());
    }

    @Test
    void whenCreateThenCheckIsCreated() {
        var createDTO = new ParkingCreateDTO();
        createDTO.setColor("AMARELO");
        createDTO.setLicense("WRT-5555");
        createDTO.setModel("Brasilia");
        createDTO.setState("SP");
        
        RestAssured.given()
                .when()
                .contentType(org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
                .body(createDTO)
                .post("/parking")
                .then()
                .statusCode(org.springframework.http.HttpStatus.CREATED.value())
                .body("license", Matchers.equalTo("WRT-5555"));
    }

    @Test
    void create() {

    }
}
