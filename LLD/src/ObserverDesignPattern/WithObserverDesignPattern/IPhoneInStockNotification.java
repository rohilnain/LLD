package ObserverDesignPattern.WithObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class IPhoneInStockNotification implements Observable{
    private List<Observer>observers=new ArrayList<Observer>();
    private int noOfIphones;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:observers){
            observer.update(noOfIphones);
        }
    }

    public void setNoOfIphones(int quantity) {
        if(noOfIphones==0 && quantity>0) {
            noOfIphones = quantity;
            notifyObservers();
        }
    }
}
