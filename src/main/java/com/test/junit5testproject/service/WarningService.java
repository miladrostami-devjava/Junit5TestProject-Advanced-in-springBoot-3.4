package com.test.junit5testproject.service;

import org.springframework.stereotype.Service;

@Service
public class WarningService {

    public String getWarning(String warning){
        return "Hello, " +  warning;
    }

}
