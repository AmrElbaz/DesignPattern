package designPattern.behavioral.observer;


import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observerList = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        observeOthers();
    }
    public void add(Observer observer) {
        System.out.println("  A new Observer is Added");
        this.observerList.add(observer);
    }

    private void observeOthers(){
        observerList.forEach(Observer::update);
    }
}
