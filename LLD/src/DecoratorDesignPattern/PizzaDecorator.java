package DecoratorDesignPattern;

public abstract class PizzaDecorator implements Pizza {
    protected Pizza decoratedPizza;

    public PizzaDecorator(Pizza pizza) {
        this.decoratedPizza = pizza;
    }

    @Override
    public String  getDescription() {
         return decoratedPizza.getDescription();
    }

    @Override
    public int getCost() {
        return decoratedPizza.getCost();
    }
}
