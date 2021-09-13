package com.japharr.sample;

public class FactorySample {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactoryImpl();
        Animal cat = animalFactory.instance("Cat");
        cat.walk();
        Animal dog = animalFactory.instance("Dog");
        dog.walk();
        Animal goat = animalFactory.instance("Goat");
        goat.walk();
    }
}

interface Animal {
    void walk();
}

class Dog implements Animal {
    @Override
    public void walk() {
        System.out.println("Dog walking...");
    }
}

class Cat implements Animal {
    @Override
    public void walk() {
        System.out.println("Cat walking...");
    }
}

class Goat implements Animal {
    @Override
    public void walk() {
        System.out.println("Goat walking...");
    }
}

abstract class AnimalFactory {
    public abstract Animal instance(String type);
}

class AnimalFactoryImpl extends AnimalFactory {
    @Override
    public Animal instance(String type) {
        if(type == null) return null;

        if(type.equalsIgnoreCase("DOG")) {
            return new Dog();
        } else if(type.equalsIgnoreCase("CAT")) {
            return new Cat();
        } else if(type.equalsIgnoreCase("GOAT")) {
            return new Goat();
        }

        return null;
    }
}