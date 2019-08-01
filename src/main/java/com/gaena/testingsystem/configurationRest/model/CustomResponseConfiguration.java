package com.gaena.testingsystem.configurationRest.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

import static java.sql.Types.NULL;

@Table(name = "custom_response_configuration")
@Data
@Entity
public class CustomResponseConfiguration implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable = false, nullable = false)
    private Integer id;

    @Column(name = "template_name")
    private String templateName = "NULL";

    @Column(name = "request_readable_fields")
    private String requestReadableFields = "NULL";

    @Column(name = "request_mandatory_fields")
    private String requestMandatoryFields = "NULL";

    @Column(name = "request_validate_fields")
    private String requestValidateFields = "NULL";

    @Column(name = "request_format")
    private String requestFormat = "NULL";

    @Column(name = "request_headers")
    private String requestHeaders = "NULL";

    @Column(name = "response_expected_headers")
    private String responseExpectedHeaders = "NULL";

    @Column(name = "response_expected_format")
    private String responseExpectedFormat = "NULL";

    @Column(name = "response_expected_status")
    private Integer responseExpectedStatus = NULL;

    @Column(name = "is_secured")
    private Boolean secured = Boolean.FALSE;

    @Column(name = "security_type")
    private String securityType = "NULL";

    @Column(name = "validation_configuration_id")
    private Integer validationConfigurationId = NULL;


}