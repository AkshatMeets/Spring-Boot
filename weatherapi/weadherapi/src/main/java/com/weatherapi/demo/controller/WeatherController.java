package com.weatherapi.demo.controller;


import com.weatherapi.demo.model.WeatherResponse;
import com.weatherapi.demo.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/{city}")
    public WeatherResponse getWeather(@PathVariable String city) {
        return weatherService.getWeather(city.trim());
    }

    @GetMapping(value = "/countries")
    public List<Object> getCountries(){
        String url="https://restcountries.eu/rest/v2/all";
        RestTemplate restTemplate=new RestTemplate();

        Object[] countires = restTemplate.getForObject(url,Object[].class);
        return Arrays.asList(countires);
    }
}
