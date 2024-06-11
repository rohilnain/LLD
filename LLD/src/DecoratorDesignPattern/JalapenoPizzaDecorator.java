package DecoratorDesignPattern;

public class JalapenoPizzaDecorator extends PizzaDecorator {

    public JalapenoPizzaDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription()+",jalapeno";
    }

    @Override
    public int getCost() {
        return decoratedPizza.getCost()+30;
    }
}
