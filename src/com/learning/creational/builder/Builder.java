package com.learning.creational.builder;

import com.learning.creational.builder.model.Pizza;

public class Builder {

    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder().withBase("Thin crust")
                                         .withSauce("Pesto")
                                         .withCheese("Mozzarella")
                                         .withMeat("Prosciutto")
                                         .withVeggies("Artichoke")
                                         .build();

        System.out.println(pizza.getBase());
        System.out.println(pizza.getCheese());
        System.out.println(pizza.getVeggies());
    }
}
