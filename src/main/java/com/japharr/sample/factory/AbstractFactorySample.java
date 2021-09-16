package com.japharr.sample.factory;

public class AbstractFactorySample {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color red = colorFactory.getColor("red");
        red.fill();
    }
}

interface Shape {
    void draw();
}

interface Color {
    void fill();
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle...");
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle...");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square...");
    }
}

class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Filling Red...");
    }
}

class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Filling Green...");
    }
}

class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Filling Blue...");
    }
}

abstract class AbstractFactory {
    public abstract Shape getShape(String type);
    public abstract Color getColor(String type);
}

class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String type) {
        return switch (type) {
            case "circle" -> new Circle();
            case "rectangle" -> new Rectangle();
            case "square" -> new Square();
            default -> null;
        };
    }

    @Override
    public Color getColor(String type) {
        return null;
    }
}

class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String type) {
        return switch (type) {
            case "red" -> new Red();
            case "blue" -> new Blue();
            case "green" -> new Green();
            default -> null;
        };
    }

    @Override
    public Shape getShape(String type) {
        return null;
    }
}

abstract class FactoryProducer {
    static AbstractFactory getFactory(String type) {
        if(type.equalsIgnoreCase("SHAPE"))
            return new ShapeFactory();
        else if(type.equalsIgnoreCase("COLOR"))
            return new ColorFactory();

        return null;
    }
}