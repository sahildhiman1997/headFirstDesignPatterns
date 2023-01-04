package observerPattern.weatherApp;

public class Display2 extends WeatherDisplay implements Observer{
    @Override
    void display() {
        System.out.println("[ Display 2 ]");
        System.out.println("temperature is : "+(temp+ 273.15) + " degrees Kelvin");
        System.out.println("humidity is : "+humidity);
    }
}
