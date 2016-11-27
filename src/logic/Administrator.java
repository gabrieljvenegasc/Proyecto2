package logic;


import java.util.*;

public class Administrator extends User implements Observable {

    public Administrator() {
    }


    public void registerObserver(Observer pObserver) {
        this.observerCollection.add(pObserver);
        
        
    }

    public void deleteObserver(Observer pObserver) {
        this.observerCollection.remove(pObserver);
    }

    public void notifyObservers() {
        // TODO implement here
    }

}