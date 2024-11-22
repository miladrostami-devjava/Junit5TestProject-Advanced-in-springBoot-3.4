package com.test.junit5testproject.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class WarningServiceTest {
private final WarningService warningService = new WarningService();

@Test
    public void testGetWarning(){
    String result = warningService.getWarning("World");
    assertEquals("Hello, World",result);
}


}