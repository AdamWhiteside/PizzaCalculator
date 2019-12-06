package com.pizza_pi;

import java.util.*;

public class PizzaObject {

    private double price;
    //private String size;
    private String type;
    private int foodUnits;
    private List<String> toppings;

    PizzaObject(double p, String ty, int f, List<String> to) {
        price = p;
        //size = s;
        type = ty;
        foodUnits = f;
        toppings.addAll(to);
    }

    public double getPrice() {
        return price;
    }
    public String getType() {
        return type;
    }
    public int getFoodUnits() {
        return foodUnits;
    }
    public List<String> getToppings() {
        return toppings;
    }

    public void setPrice(double n) {
        price = n;
    }
    public void setType(String n) {
        type = n;
    }
    public void setfoodUnits(int n) {
        foodUnits = n;
    }
    public void setToppings(List<String> n) {
        toppings = n;
    }
}
