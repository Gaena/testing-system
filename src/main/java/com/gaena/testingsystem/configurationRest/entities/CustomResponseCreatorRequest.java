package com.gaena.testingsystem.configurationRest.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.LinkedHashMap;
import java.util.List;

@Data
public class CustomResponseCreatorRequest {

    @NotNull
    private String templateName;

    @JsonProperty("requestMandatoryFields")
    private List<String> requestMandatoryFieldsList;

    @JsonProperty("requestValidateFields")
    private List<String> requestValidateFieldsList;

    @NotNull
    private Integer expectedResponseStatus;

    @JsonProperty("responseExpectedFields")
    private List<String> responseExpectedFieldsList;

    @JsonProperty("responseExpectedHeaders")
    private List<String> responseExpectedHeadersList;

    private Boolean isSecured;

    private String securityType;

    private LinkedHashMap<String, List<Integer>> validationConfiguration;

}
