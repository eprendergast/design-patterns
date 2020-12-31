package com.learning.creational.builder.model;

public class Pizza {

    private String base;
    private String sauce;
    private String cheese;
    private String meat;
    private String veggies;

    public Pizza() {
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getVeggies() {
        return veggies;
    }

    public void setVeggies(String veggies) {
        this.veggies = veggies;
    }

    public static class Builder {

        private String base;
        private String sauce;
        private String cheese;
        private String meat;
        private String veggies;

        public Pizza build() {
            Pizza pizza = new Pizza();
            pizza.base = this.base;
            pizza.sauce = this.sauce;
            pizza.cheese = this.cheese;
            pizza.meat = this.meat;
            pizza.veggies = this.veggies;
            return pizza;
        }

        public Builder withBase(String base) {
            this.base = base;
            return this;
        }

        public Builder withSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder withCheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder withMeat(String meat) {
            this.meat = meat;
            return this;
        }

        public Builder withVeggies(String veggies) {
            this.veggies = veggies;
            return this;
        }

    }

}
