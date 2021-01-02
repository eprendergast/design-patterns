package com.learning.creational.factory;

import com.learning.creational.factory.model.Animal;
import com.learning.creational.factory.model.impl.Cow;
import com.learning.creational.factory.model.impl.Pig;

public class AnimalFactory {

    private final String COW = "cow";
    private final String PIG = "pig";

    public Animal getAnimal(String animal) throws Exception {
        if (animal.equalsIgnoreCase(COW)) {
            return new Cow();
        } else if (animal.equalsIgnoreCase(PIG)) {
            return new Pig();
        } else {
            throw new Exception("Animal " + animal + " not found");
        }
    }

}
