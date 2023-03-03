package com.example.Weather.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Weather {

    private final RestTemplate restTemplate;

    public Weather(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String ConsumeApi(){
        return restTemplate.getForObject("https://api.openweathermap.org/data/2.5/weather?lat=44.34&lon=10.99&appid=bb5d7ed2b12590ba0c1ce552cc4b0b27",String.class);
    }
}
