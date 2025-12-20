package com.strengthlog.security.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//Used to one-way hash the password before storing it in the database.

@Configuration
public class PasswordConfig {
    @Bean
    public PasswordEncoder PasswordEncoder()
    {
        return new BCryptPasswordEncoder();
    }
}
