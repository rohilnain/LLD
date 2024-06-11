package DecoratorDesignPattern;

public class VeggiePizzaDecorator extends PizzaDecorator{

    public VeggiePizzaDecorator(Pizza decoratedPizza){
        super(decoratedPizza);
    }

    @Override
    public String getDescription(){
        return decoratedPizza.getDescription()+",veggie";
    }

    @Override
    public int getCost() {
        return decoratedPizza.getCost()+60;
    }
}
