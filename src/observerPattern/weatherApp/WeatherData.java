package observerPattern.weatherApp;


public class WeatherData implements Subject{
     int temp;
     int humidity;

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public WeatherData(int temp, int humidity){
         this.temp = temp;
         this.humidity = humidity;
     }

    public void notifyObservers() {
        for(Observer o : observers){
            o.update(temp, humidity);
        }
    }
}
