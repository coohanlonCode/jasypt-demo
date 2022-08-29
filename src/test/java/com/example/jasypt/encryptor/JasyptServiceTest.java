package com.example.jasypt.encryptor;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@EnableEncryptableProperties
@EnableConfigurationProperties(value = MyAppConfig.class)
@TestPropertySource(locations = "classpath:application.properties")
class JasyptServiceTest {


    @Autowired
    private MyAppConfig appConfig;

    @DisplayName("Given_plainTextAndItsEncryptedVersion_When_JasyptIsConfiguredProperly_Then_ExpectPasswordsToMatch")
    @Test
    void GivenPlainTextAndItsEncryptedVersionWhenJasyptIsConfiguredProperlyThenExpectPasswordsToMatch() {


        String plainTextVersionFromAppProperties = appConfig.getPlaintext(); //"mySecretPassword1234"
        String encryptedVersionFromAppProperties = appConfig.getEncrypted(); //"ENC(pVvVfrTGw+VHI9MegPKqB1xMkxQ5eimU+Kvm06LRQIw=)"

        assertEquals(plainTextVersionFromAppProperties, encryptedVersionFromAppProperties);

    }

}