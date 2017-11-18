package sample.service;

import sample.model.WeatherForecast;

public interface WeatherService {
    public WeatherForecast getWeatherByCity(String city);

}
