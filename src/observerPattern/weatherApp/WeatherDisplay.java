package observerPattern.weatherApp;

public abstract class WeatherDisplay {
    int temp;
    int humidity;

    abstract void display() ;
    public void update(int t, int h) {
        this.temp =t;
        this.humidity = h;
        display();
    }
}
