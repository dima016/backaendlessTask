package com.backendless.batsunov.animal;

import com.backendless.batsunov.food.Meat;

public abstract class PredatoryAnimal implements Animal {
    public void eat(Meat food){
        System.out.println("Eating meat " + food);
    }
}
