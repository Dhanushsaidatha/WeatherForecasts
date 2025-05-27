package com.example.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WeatherController {

    @GetMapping("/weather")
    public String showWeatherPage() {
        // Implement weather-related functionality here
        return "weather"; // Return the Thymeleaf template name for weather information
    }

    @GetMapping("/gmap")
    public String showGmap() {
        // Implement weather-related functionality here
        return "gmap"; // Return the Thymeleaf template name for weather information
   
}
}