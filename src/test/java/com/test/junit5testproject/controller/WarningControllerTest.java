package com.test.junit5testproject.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;


import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class WarningControllerTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    void getWarning() throws Exception {
mockMvc.perform(get("/warning").param("warning","World"))
        .andExpect(status().isOk())
        .andExpect(MockMvcResultMatchers.content().string("Hello, World"));

    }
}