package com.pizza_pi;

import java.util.*;

public class PiSet {
    private List<String> restaurant;
    private List<String> type;
    private int people;
    private List<String> toppings;
    private List<String> whitelist;
    private List<String> blacklist;
    private boolean white;
    private boolean black;
    private int foodUnits;

    PiSet(List<String> rest, List<String> ty, int peo, List<String> top, List<String> whil, List<String> blal, boolean whi, boolean bla, int fu) {
        restaurant = rest;
        type = ty;
        people = peo;
        toppings = top;
        whitelist = whil;
        blacklist = blal;
        white = whi;
        black = bla;
        foodUnits = fu;
    }

    public List<String> getrestaurant() {
        return restaurant;
    }
    public List<String> getType() {
        return type;
    }
    public int getPeople() {
        return people;
    }
    public List<String> getToppings() {
        return toppings;
    }
    public List<String> getWhitelist() {
        return whitelist;
    }
    public List<String> getBlacklist() {
        return blacklist;
    }
    public boolean getWhiteB() {
        return white;
    }
    public boolean getBlackB() {
        return black;
    }
    public int getFoodUnits() {
        return foodUnits;
    }


    public void setrestaurant(List<String> desu) {
        restaurant = desu;
    }
    public void setType(List<String> desu) {
        type = desu;
    }
    public void setPeople(int desu) {
        people = desu;
    }
    public void setToppings(List<String> desu) {
        toppings = desu;
    }
    public void setWhitelist(List<String> desu) {
        whitelist = desu;
    }
    public void setBlacklist(List<String> desu) {
        blacklist = desu;
    }
    public void setWhiteB(boolean desu) {
        white = desu;
    }
    public void setBlackB(boolean desu) {
        black = desu;
    }
    public void setFoodUnits(int desu) {
        foodUnits = desu;
    }
}


