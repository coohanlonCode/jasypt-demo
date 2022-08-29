package com.example.jasypt.encryptor;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class EncryptorApplication {

    @Autowired
    static JasyptService jasyptService;

    public static void main(String[] args) {

        String myPassword = "mySecretPassword1234";

        jasyptService.encryptPassword(myPassword);
    }
}
