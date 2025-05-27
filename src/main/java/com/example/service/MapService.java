// File: src/main/java/com/example/service/MapService.java
package com.example.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MapService {

    @Value("${google.api.key}")
    private String googleApiKey;

    public String getGoogleApiKey() {
        return googleApiKey;
    }

    public void useApiKey() {
        System.out.println("Google API Key: " + googleApiKey); // test
    }
}
