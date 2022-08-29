package com.example.jasypt.encryptor;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@EnableEncryptableProperties
@Data
@Component
@ConfigurationProperties(prefix = "jasypt.test.password") // from application.properties
public class MyAppConfig {

    private String plaintext;

    private String encrypted;
}
