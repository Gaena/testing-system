package com.gaena.testingsystem.beans;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Data
@Component
@RequestScope
public class RequestStateProcess {

    private String requestMethod;
}
