package com.acm.ecommerce.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class StatusController {

    @GetMapping("/version")
    public String getVersion() {
        return "<h1>Ecommerce Cloud - Version 1.0</h1><p>Desplegado automaticamente en AWS Elastic Beanstalk</p>";
    }
}