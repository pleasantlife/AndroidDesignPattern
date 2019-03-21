package com.gandan.android.androiddesignpattern.factory;

public abstract class Pizza {

    public abstract int GetPrice();

    public enum PizzaType {
        HamMushroom, Deluxe, Seafood
    }

    public static Pizza PizzaFactory(PizzaType pizzaType){

        Pizza pizza = null;

        switch(pizzaType){
            case HamMushroom:
                pizza = new HamAndMushroomPizza();
            case Deluxe:
                pizza = new DeluxePizza();
            case Seafood:
                pizza = new SeafoodPizza();
        }

        return pizza;
    }

}
