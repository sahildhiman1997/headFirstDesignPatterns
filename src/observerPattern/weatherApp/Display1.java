package observerPattern.weatherApp;

public class Display1 extends WeatherDisplay implements Observer  {

    @Override
    void display() {
        System.out.println("[ Display 1 ]");
        System.out.println("temperature is : "+temp + " degrees Celsius");
        System.out.println("humidity is : "+humidity);
    }
}
