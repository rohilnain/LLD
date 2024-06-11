package ObserverDesignPattern.WithObserverDesignPattern;

public class User implements Observer{
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(int noOfIphones) {
        System.out.println("Hello " + name + ", there are now " + noOfIphones + " iPhones in stock.");
    }
}
