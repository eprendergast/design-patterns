package com.learning.creational.factory;

import com.learning.creational.factory.model.Animal;

public class Factory {

    public static void main(String[] args) throws Exception {

        AnimalFactory animalFactory = new AnimalFactory();

        Animal cow = animalFactory.getAnimal("cOw");
        cow.makeNoise();

        Animal pig = animalFactory.getAnimal("piG");
        pig.makeNoise();

    }
}
