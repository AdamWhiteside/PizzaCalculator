package com.pizza_pi.database;

/**
 * Schema for Pizza
 */
public class PizzaDbSchema {

    public static final class PizzaTable
    {
        public static final String NAME = "pizzas";

        public static final class Cols
        {
            public static final String RESTAURANT = "restaurant";
            public static final String SIZE = "size";
            public static final String TOPPING = "topping";
            public static final String CRUST = "crust";
            public static final String SAUCE = "sauce";
            public static final String PEOPLE_SERVED = "people_served";
        }
    }
}
