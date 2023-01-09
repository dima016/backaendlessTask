package com.backendless.batsunov.animal;

import com.backendless.batsunov.food.Plant;

public abstract class HerbivoreAnimal implements Animal {
    public void eat(Plant food){
        System.out.println("Eating food " + food);
    }
}
