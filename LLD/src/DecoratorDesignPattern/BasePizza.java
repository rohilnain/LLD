package DecoratorDesignPattern;

public class BasePizza implements Pizza{

    @Override
    public String getDescription() {
        return "Your Pizza has Base pizza";
    }

    @Override
    public int getCost() {
        return 100;
    }
}
