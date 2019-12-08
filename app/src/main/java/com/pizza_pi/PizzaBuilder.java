package com.pizza_pi;

public class PizzaBuilder {

    private String mRestaurant;
    private String mStyle;
    private double mProperRadius;
    private double mToppingPrice;

    public PizzaBuilder(String Restaurant, String style, Double properRadius, Double toppingPrice){

    }

    public void setRestaurant(String restaurant) {
        mRestaurant = restaurant;
    }

    public void setStyle(String style) {
        mStyle = style;
    }

    public void setProperRadius(double properRadius) {
        mProperRadius = properRadius;
    }

    public void setToppingPrice(double toppingPrice) {
        mToppingPrice = toppingPrice;
    }
    private static PizzaBuilder mInstance = null;

    public int toppingValuePep;
    public int toppingValueSau;
    public int toppingValueChe;

    protected PizzaBuilder(){}

    public static synchronized PizzaBuilder getInstance() {
        if(null == mInstance){
            mInstance = new PizzaBuilder();
        }
        return mInstance;
    }
}

