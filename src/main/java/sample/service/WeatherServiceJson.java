package sample.service;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import sample.model.WeatherForecast;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;


public class WeatherServiceJson implements WeatherService {

    private String finalUrl;

    public WeatherServiceJson(String url, String privateKey){
        finalUrl = url+"?key="+privateKey;
    }


    public WeatherForecast getWeatherByCity(String city) {
        WeatherForecast forecast = new WeatherForecast();
        String requestUrl = finalUrl+"&q="+city;

        try {
            JSONObject json = new JSONObject(IOUtils.toString(new URL(requestUrl), Charset.forName("UTF-8")));
            forecast.setTemperatureInCelsius((Double)json.getJSONObject("current").get("temp_c"));
            forecast.setFelLikeTemperatureInCelsius((Double)json.getJSONObject("current").get("feelslike_c"));
            forecast.setIconUrl(json.getJSONObject("current").getJSONObject("condition").get("icon").toString());
            forecast.setCity(city);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return forecast;
    }

    public static void main(String[] args) {
        WeatherServiceJson weatherServiceJson = new WeatherServiceJson("http://api.apixu.com/v1/current.json","278ece0711e645b0b87151052161711");
        System.out.println(weatherServiceJson.getWeatherByCity("Gdynia"));
    }
}