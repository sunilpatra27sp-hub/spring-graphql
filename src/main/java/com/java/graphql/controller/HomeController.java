package com.java.graphql.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Tag(name = "Test API", description = "Endpoints for Cluster Health & Testing")
public class HomeController {

    @GetMapping("/hello")
    @Operation(summary = "Get Welcome Message", description = "Returns a simple message to verify deployment")
    public String sayHello() {
        return "Spring Boot is running successfully on the cluster!";
    }
}