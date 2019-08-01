package com.gaena.testingsystem.configurationRest.controller;

import com.gaena.testingsystem.configurationRest.entities.CustomResponseCreatorRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/configuration/")
public class ConfigurationController {

    @PostMapping("/custom")
    public CustomResponseCreatorRequest setCustomResponseConfiguration(
            @RequestBody @Valid CustomResponseCreatorRequest customResponseConfiguration) {

        customResponseConfiguration.setTemplateName("TEST template");
        customResponseConfiguration.setExpectedResponseStatus(200);
        customResponseConfiguration.setIsSecured(false);
        customResponseConfiguration.setSecurityType(null);

        List<String> reqManFields = new ArrayList<>();
        reqManFields.add("field1");
        reqManFields.add("field2");

        customResponseConfiguration.setRequestMandatoryFieldsList(reqManFields);

        List<String> reqValFields = new ArrayList<>();
        reqManFields.add("val field1");
        reqManFields.add("val field2");

        customResponseConfiguration.setRequestValidateFieldsList(reqValFields);

        List<String> resExpFields = new ArrayList<>();
        reqManFields.add("res field1");
        reqManFields.add("res field2");

        customResponseConfiguration.setResponseExpectedFieldsList(resExpFields);

        List<String> resExpHeaders = new ArrayList<>();
        reqManFields.add("header 1");
        reqManFields.add("Header 2");

        customResponseConfiguration.setResponseExpectedHeadersList(resExpHeaders);

        return customResponseConfiguration;
    }

}
