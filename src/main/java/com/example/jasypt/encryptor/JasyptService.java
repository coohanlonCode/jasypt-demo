package com.example.jasypt.encryptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JasyptService {

    @Autowired
    JaspytEncryptor myEncryptor;

    @Autowired
    JasyptDecryptor myDecryptor;

    public void encryptPassword(String myPassword) {

    }
}
