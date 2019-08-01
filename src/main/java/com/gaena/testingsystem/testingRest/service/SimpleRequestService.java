package com.gaena.testingsystem.testingRest.service;

import com.gaena.testingsystem.constants.TestingConstants;
import com.gaena.testingsystem.testingRest.model.SuccessEntity;
import org.springframework.stereotype.Service;

@Service
public class SimpleRequestService {

    @SuppressWarnings("unchecked")
    public <T> T getSuccessResponse(String contentTypeHeader) {
        contentTypeHeader = contentTypeHeader.toLowerCase();
        if (contentTypeHeader.contains("xml") || contentTypeHeader.contains("json")) {
            return (T) new SuccessEntity();
        }
        return (T) TestingConstants.SUCCESS_STRING;
    }
}
