package com.test.junit5testproject.controller;

import com.test.junit5testproject.service.WarningService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(WarningController.class)
class WarningControllerTestWithMockitoLibrary {

    @MockitoBean
    private WarningService warningService;

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void getWarning() throws Exception{
when(warningService.getWarning("Test")).thenReturn("Hello, Test");

        mockMvc.perform(get("/warning").param("warning", "Test"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, Test"));
    }

}