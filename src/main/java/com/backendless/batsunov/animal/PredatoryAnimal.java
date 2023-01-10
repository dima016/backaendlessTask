package com.backendless.batsunov.animal;

import com.backendless.batsunov.food.Meat;

public abstract class PredatoryAnimal implements Animal {
    public void eat(Meat food) {
        System.out.println("Eating meat " + food);
    }

    public void eat(Animal animal) throws IllegalArgumentException {
        if (animal == this) {
            throw new IllegalArgumentException("Can't eat itself");
        }

        System.out.println("Eating animal " + animal);
    }
}
