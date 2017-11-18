package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import sample.model.WeatherForecast;
import sample.service.WeatherService;
import sample.service.WeatherServiceJson;


import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label TemperatureIn;

    @FXML
    private Label TemperatureFell;

    @FXML
    private Button submit;

    @FXML
    private TextField write;

    public void initialize(URL location, ResourceBundle resources) {
        TemperatureIn.setText("");
        TemperatureFell.setText("");
        WeatherServiceJson weatherServiceJson = new WeatherServiceJson("http://api.apixu.com/v1/current.json","278ece0711e645b0b87151052161711");
        WeatherForecast weatherForecast = weatherServiceJson.getWeatherByCity("Gdynia");
        TemperatureIn.setText(""+weatherForecast.getTemperatureInCelsius()+" Celsjusza");
        TemperatureFell.setText(""+weatherForecast.getFelLikeTemperatureInCelsius()+" Celsjusza");
    }

    public void setCity (ActionEvent event){
        String cityName = write.getText();
        WeatherServiceJson weatherServiceJson = new WeatherServiceJson("http://api.apixu.com/v1/current.json","278ece0711e645b0b87151052161711");
        WeatherForecast weatherForecast = weatherServiceJson.getWeatherByCity(cityName);
        TemperatureIn.setText(weatherForecast.getTemperatureInCelsius()+" Celsjusza");
        TemperatureFell.setText(weatherForecast.getFelLikeTemperatureInCelsius()+" Celsjusza");
    }



}