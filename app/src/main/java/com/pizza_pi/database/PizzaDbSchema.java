package com.pizza_pi.database;

/**
 * Schema for each restaurant which entails what
 * they have available at said restaurant.
 */
public class PizzaDbSchema {

    public static final class PizzaTable
    {
        public static final String NAME = "pizzas";

        public static final class Cols
        {
            public static final String UUID = "uuid";
            public static final String RESTAURANT = "restaurant";
            public static final String STYLE = "style";
            public static final String PROPER_RADIUS = "proper_radius";
            public static final String TOPPING_PRICE = "topping_price";
            public static final String PEPPERONI = "pepperoni";
            public static final String ITALIAN_SAUSAGE = "italian_sausage";
            public static final String MEATBALL = "meatball";
            public static final String HAM = "ham";
            public static final String BACON = "bacon";
            public static final String GRILLED_CHICKEN = "grilled_chicken";
            public static final String BEEF = "beef";
            public static final String PORK = "pork";
            public static final String MUSHROOMS = "mushrooms";
            public static final String ROASTED_SPINACH = "roasted_spinach";
            public static final String RED_ONIONS = "red_onions";
            public static final String BLACK_OLIVES = "black_olives";
            public static final String GREEN_BELL_PEPPERS = "green_bell_peppers";
            public static final String BANANA_PEPPERS = "banana_peppers";
            public static final String PINEAPPLE = "pineapple";
            public static final String JALAPENO = "jalapeno";
            public static final String ROMA_TOMATOES = "roma_tomatoes";
            public static final String PHILLY_STEAK = "philly_steak";
            public static final String SAUSAGE = "sausage";
            public static final String ANCHOVIES = "anchovies";
            public static final String CANADIAN_BACON = "canadian_bacon";
            public static final String SALAMI = "salami";
            public static final String ONIONS = "onions";
            public static final String GREEN_OLIVES = "green_olives";
            public static final String LETTUCE = "lettuce";
            public static final String PICKLES = "pickles";
            public static final String FRESH_SPINACH = "fresh_spinach";
        }
    }
}
