package com.weatherapi.demo.model;


import java.util.Map;

public class WeatherResponse {
    private Map<String, Object> main;
    private String name;

    public Map<String, Object> getMain() { return main; }
    public void setMain(Map<String, Object> main) { this.main = main; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
