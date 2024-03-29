package com.gaena.testingsystem.testingRest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement(name = "Result")
@XmlAccessorType(XmlAccessType.FIELD)
public class SuccessEntity {

    private String tag = "test";

    public SuccessEntity() {
        this.responseString = "OK";
    }

    @JsonProperty("Response")
    @XmlElement(name = "Response")
    private String responseString;
}
