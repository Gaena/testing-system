package com.gaena.testingsystem.testingRest.controller;

import com.gaena.testingsystem.testingRest.service.SimpleRequestService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/")
@SuppressWarnings("unchecked")
public class SimpleRequestController {

    private final SimpleRequestService simpleRequestService;

    public SimpleRequestController(SimpleRequestService simpleRequestService) {
        this.simpleRequestService = simpleRequestService;
    }


    @RequestMapping("/successRequest")
    public <T> ResponseEntity<T> getSuccessResponse(@RequestHeader("Content-Type") String contentTypeHeader) {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Content-Type", contentTypeHeader);
        return (ResponseEntity<T>) ResponseEntity.ok()
                .headers(responseHeaders)
                .body(simpleRequestService.getSuccessResponse(contentTypeHeader));
    }

    @RequestMapping("/simpleRequest")
    public String incomingSimpleRequest(
            @RequestHeader Map<String, String> headers,
            @RequestBody String reqStr) {

        System.out.println(headers);
        return reqStr;
    }
}
