package sample.model;

public class WeatherForecast {
    private String city;
    private String iconUrl;
    private double temperatureInCelsius;
    private double felLikeTemperatureInCelsius;

    public WeatherForecast() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public double getTemperatureInCelsius() {
        return temperatureInCelsius;
    }

    public void setTemperatureInCelsius(double temperatureInCelsius) {
        this.temperatureInCelsius = temperatureInCelsius;
    }

    public double getFelLikeTemperatureInCelsius() {
        return felLikeTemperatureInCelsius;
    }

    public void setFelLikeTemperatureInCelsius(double felLikeTemperatureInCelsius) {
        this.felLikeTemperatureInCelsius = felLikeTemperatureInCelsius;
    }

    @Override
    public String toString() {
        return "WeatherForecast{" +
                "city='" + city + '\'' +
                ", iconUrl='" + iconUrl + '\'' +
                ", temperatureInCelsius=" + temperatureInCelsius +
                ", felLikeTemperatureInCelsius=" + felLikeTemperatureInCelsius +
                '}';
    }
}
