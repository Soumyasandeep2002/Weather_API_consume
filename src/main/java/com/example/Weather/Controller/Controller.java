package com.example.Weather.Controller;

import com.example.Weather.Service.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final Weather weather;

    public Controller(Weather weather) {
        this.weather = weather;
    }
    @GetMapping("/weather")
    public String getData(){
        return weather.ConsumeApi();
    }
}
