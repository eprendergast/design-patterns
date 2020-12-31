package com.learning.behaviour.template.model;

public abstract class Dog {

    protected abstract void walk();

    protected abstract void bark();

    protected abstract void eat();

    public final void beingADog() {
        walk();
        bark();
        eat();
    }

}
