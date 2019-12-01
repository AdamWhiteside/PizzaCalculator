package com.pizza_pi.database;

import java.io.Serializable;
import java.util.UUID;
import java.util.LinkedList;

public class Pizza implements Serializable
{
    private UUID mId;
    private String mRestaurant;
    private String mStyle;
    private double mProperRadius;
    private double mToppingPrice;
    private LinkedList<String> toppings = new LinkedList<>();

    public Pizza()
    {
        this(UUID.randomUUID());
    }

    public Pizza(UUID id)
    {
        mId = id;
        mRestaurant = "";
        mStyle = "";
        mProperRadius = 0.0;
        mToppingPrice = 0.0;
    }

    public Pizza(String Restaurant, String style, Double properRadius, Double toppingPrice
    )
    {
        mId = UUID.randomUUID();
        mRestaurant = Restaurant;
        mStyle = style;
        mProperRadius = properRadius;
        mToppingPrice = toppingPrice;

    }

    public UUID getId() {
        return mId;
    }

    public void setId(UUID id) {
        mId = id;
    }

    public String getRestaurant() {
        return mRestaurant;
    }

    public void setRestaurant(String restaurant) {
        mRestaurant = restaurant;
    }

    public String getStyle() {
        return mStyle;
    }

    public void setStyle(String style) {
        mStyle = style;
    }

    public double getProperRadius() {
        return mProperRadius;
    }

    public void setProperRadius(double properRadius) {
        mProperRadius = properRadius;
    }

    public double getToppingPrice() {
        return mToppingPrice;
    }

    public void setToppingPrice(double toppingPrice) {
        mToppingPrice = toppingPrice;
    }



}