package DecoratorDesignPattern;

public class Client {
    public static void main(String[] args) {
        //now you can have many combinations without explosion of classes
        Pizza pizza=new JalapenoPizzaDecorator(new ChesseburstPizzaDecorator(new BasePizza()));
        Pizza pizza2=new VeggiePizzaDecorator(new JalapenoPizzaDecorator(new ChesseburstPizzaDecorator(new BasePizza())));

        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());

        System.out.println(pizza2.getDescription());
        System.out.println(pizza2.getCost());
    }
}
