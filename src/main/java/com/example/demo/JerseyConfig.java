package com.example.demo;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        property(ServletProperties.FILTER_FORWARD_ON_404, true ); //Denne trenges eller så fungerer ingenting
        register(RestTest.class);
    }
}
