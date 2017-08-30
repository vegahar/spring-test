package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;


@Profile("prod")
@Configuration
@EnableWebSecurity
public class ProdSecurityConfig extends SecurityConfig {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("produser").password("passnot").roles("USER");
    }

}