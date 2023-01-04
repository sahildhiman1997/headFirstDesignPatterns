package observerPattern.weatherApp;

import java.util.HashSet;
import java.util.Set;

public interface Subject {
    Set<Observer> observers = new HashSet<>();
    default void removeObserver(Observer observer){
        observers.remove(observer);
    }
    default void addObserver(Observer observer){
        observers.add(observer);
    }

     void notifyObservers();

}
