package logic;


import java.util.*;

public interface Observable {
    public ArrayList<Observer> observerCollection = new ArrayList<>();
    public void registerObserver(Observer pObserver);
    public void deleteObserver(Observer pObserver);
    public void notifyObservers();

}