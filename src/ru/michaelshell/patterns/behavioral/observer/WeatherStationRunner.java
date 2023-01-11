package ru.michaelshell.patterns.behavioral.observer;

public class WeatherStationRunner {
    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();

        var humidityDisplay = new HumidityDisplay(weatherStation);
        var temperatureDisplay = new TemperatureDisplay(weatherStation);

        weatherStation.setData(30,42);
        weatherStation.removeObserver(humidityDisplay);
        weatherStation.setData(28,40);
    }
}
