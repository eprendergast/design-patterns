package com.learning.behaviour.template.model.impl;

import com.learning.behaviour.template.model.Dog;

public class GoldenRetriever extends Dog {

    @Override
    public void walk() {
        System.out.println("I make big steps");
    }

    @Override
    public void bark() {
        System.out.println("Bark! Bark! Bark!");
    }

    @Override
    public void eat() {
        System.out.println("Eating lots of food....");
    }

}
