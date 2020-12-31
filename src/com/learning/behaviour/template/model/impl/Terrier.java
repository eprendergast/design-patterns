package com.learning.behaviour.template.model.impl;

import com.learning.behaviour.template.model.Dog;

public class Terrier extends Dog {

    @Override
    public void walk() {
        System.out.println("I make small steps");
    }

    @Override
    public void bark() {
        System.out.println("Yap! Yap! Yap!");
    }

    @Override
    public void eat() {
        System.out.println("I eat small kibble");
    }

}
