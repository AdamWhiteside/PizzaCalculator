package com.pizza_pi;

import java.util.*;

public class OrderObject implements Comparable<OrderObject>{

    private double orderPrice;
    private List<PizzaObject> order;

    OrderObject(double p, List<PizzaObject> o) {
        orderPrice = p;
        order.addAll(o);
    }

    public double getPrice() {
        return orderPrice;
    }

    public List<PizzaObject> getOrder() {
        return order;
    }

    public void setPrice(double p) {
        orderPrice = p;
    }

    @Override
    public int compareTo(OrderObject obj) {
        if (getPrice() < obj.getPrice()) return 1;
        if (getPrice() > obj.getPrice()) return -1;
        return 0;
    }
}