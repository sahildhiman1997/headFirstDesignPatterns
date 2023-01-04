package observerPattern.weatherApp;

public class WeatherApp {
    public static void main(String[] args) {
        WeatherData data = new WeatherData(33, 20);
        data.addObserver(new Display1());

        data.addObserver(new Display2());

        data.notifyObservers();
        data.setTemp(40);
        data.notifyObservers();
    }
}
