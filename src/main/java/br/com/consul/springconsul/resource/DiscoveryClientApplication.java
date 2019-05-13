package br.com.consul.springconsul.resource;

import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javafx.util.Pair;

@RefreshScope
@RestController
@RequestMapping
public class DiscoveryClientApplication {

    @Value("${consul.test}")
    private String property;

    @Value("${consul.test.two}")
    private String propertyTwo;

    @GetMapping("/consul")
    public String test() {
        return property;
    }

    @GetMapping("consul-2")
    public String test2() {
        return propertyTwo;
    }

}