package com.example.AwsDeploy.Controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class DummyControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void shouldReturnHello() throws Exception {
        mvc.perform(get("/hello")).andExpect(status().isOk());
    }
}
