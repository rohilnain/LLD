package DecoratorDesignPattern;

public class ChesseburstPizzaDecorator extends PizzaDecorator{

    public ChesseburstPizzaDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ",Cheeseburst";
    }

    @Override
    public int getCost() {
        // Additional cost for Cheeseburst
        return decoratedPizza.getCost() + 50; // Example cost
    }
}
