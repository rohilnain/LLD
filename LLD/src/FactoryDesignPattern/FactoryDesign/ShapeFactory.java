package FactoryDesignPattern.FactoryDesign;

public class ShapeFactory implements Factory{

    @Override
     public Shape createShape(String shapeType){
        switch (shapeType.toLowerCase()){
            case "rectangle":
                return new Rectangle();
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            default:
                throw new IllegalArgumentException("Unsupported shape type: " + shapeType);
        }
    }
}
