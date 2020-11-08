package observer.weather;

public class WeatherStation {

	public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

		weatherData.setMeasurements(12, 65, 30.4f);
		weatherData.setMeasurements(15, 70, 29.2f);
		weatherData.setMeasurements(16, 90, 29.2f);
		weatherData.setMeasurements(11, 90, 28.1f);
	}
}
