package com.principal.dove.controller;

import com.principal.dove.dto.SurveyDto;
import com.principal.dove.service.DoveService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoveController {

    private final DoveService service;

    public DoveController(DoveService service) {
        this.service = service;
    }

    @PostMapping("/create")
    @ResponseBody
    public SurveyDto save(@RequestBody SurveyDto surveyDto) {
        return service.save(surveyDto);
    }
}
