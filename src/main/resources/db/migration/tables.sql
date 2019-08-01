/*
create table custom_response_configuration
(
    id                          int auto_increment
        primary key,
    template_name               varchar(255) null,
    request_readable_fields     text         null,
    request_mandatory_fields    text         null,
    request_validate_fields     text         null,
    request_format              varchar(255) null,
    request_headers             text         null,
    response_expected_headers   text         null,
    response_expected_format    varchar(255) null,
    response_expected_status    int          null,
    is_secured                  int          null,
    security_type               varchar(255) null,
    validation_configuration_id int          null
);
*/
