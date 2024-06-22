package com.bersoft.crudapplication.controller;

import com.bersoft.crudapplication.model.request.EmployeeRequest;
import com.bersoft.crudapplication.model.response.EmployeeResponse;
import com.bersoft.crudapplication.util.TestUtil;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@EnabledIfEnvironmentVariable(named = "INTEGRATION_TEST", matches = "true")
class EmployeeControllerIntegrationTest {

    private static final Client client = ClientBuilder.newClient();
    private static final String BASE_URL = "http://localhost:8080/crud-application/api/v1/claro/employees";

    @Test
    void findAll_return200() {
        //given
        //when
        Response response = client.target(BASE_URL).request(MediaType.APPLICATION_JSON).get();
        //then
        assertEquals(200,response.getStatus());
    }

    @Test
    void findById_return200() {
        //given
        //when
        Response response = client.target(BASE_URL+"/1").request(MediaType.APPLICATION_JSON).get();
        //then
        assertEquals(200,response.getStatus());
    }

    @Test
    void findById_return404() {
        //given
        //when
        Response response = client.target(BASE_URL+"/0").request(MediaType.APPLICATION_JSON).get();
        //then
        assertEquals(404,response.getStatus());
    }

    @Test
    void getGender_return200() {
        //given
        //when
        Response response = client.target(BASE_URL+"/1/gender").request(MediaType.APPLICATION_JSON).get();
        //then
        assertEquals(200,response.getStatus());
    }

    @Test
    void getSalary_return200() {
        //given
        //when
        Response response = client.target(BASE_URL+"/1/salary").request(MediaType.APPLICATION_JSON).get();
        //then
        assertEquals(200,response.getStatus());
    }
}