package FactoryDesignPattern.FactoryDesign;

public class Client {
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();

        Shape circle=shapeFactory.createShape("circle");
        Shape rectangle=shapeFactory.createShape("rectangle");
        Shape square=shapeFactory.createShape("square");

        //Shape square1=shapeFactory.createShape("square1");

        // Call draw method on each shape
        circle.draw();      // Output: Drawing Circle
        rectangle.draw();   // Output: Drawing Rectangle
        square.draw();      // Output: Drawing Square

        //square1.draw(); will throw illegal argument exception

        //so it becomes a factory which is supplying objects of shape based
        //on string whenever we require them
        //it encapsulates, easy to use and also extensible


    }
}
