package com.test.junit5testproject.controller;


import com.test.junit5testproject.service.WarningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WarningController {
    @Autowired
    private WarningService warningService;

    @GetMapping("/warning")
    public String getWarning(@RequestParam String warning){
        return  warningService.getWarning(warning);
    }
}
