package com.pizza_pi.database;

import android.database.Cursor;
import android.database.CursorWrapper;

import java.util.UUID;

import static com.pizza_pi.database.PizzaDbSchema.PizzaTable;

/**
 * The cursor wrapper for the PizzaBase SQLite database.
 * Basically helps retrieve data form the database.
 */

public class PizzaCursorWrapper extends CursorWrapper
{

    public PizzaCursorWrapper(Cursor cursor)
    {
        super(cursor);
    }

    public Pizza getPizza()
    {
        String uuidString = getString(getColumnIndex(PizzaTable.Cols.UUID));
        String restaurantName = getString(getColumnIndex(PizzaTable.Cols.RESTAURANT));
        String style = getString(getColumnIndex(PizzaTable.Cols.STYLE));
        double properRadius = getDouble(getColumnIndex(PizzaTable.Cols.PROPER_RADIUS));
        double toppingPrice = getDouble(getColumnIndex(PizzaTable.Cols.TOPPING_PRICE));
        boolean pepperoni = getInt(getColumnIndex(PizzaTable.Cols.PEPPERONI)) > 0;
        boolean italian_sausage = getInt(getColumnIndex(PizzaTable.Cols.ITALIAN_SAUSAGE)) > 0;
        boolean meatball = getInt(getColumnIndex(PizzaTable.Cols.MEATBALL)) > 0;
        boolean ham = getInt(getColumnIndex(PizzaTable.Cols.HAM)) > 0;
        boolean bacon = getInt(getColumnIndex(PizzaTable.Cols.BACON)) > 0;
        boolean grilled_chicken = getInt(getColumnIndex(PizzaTable.Cols.GRILLED_CHICKEN)) > 0;
        boolean beef = getInt(getColumnIndex(PizzaTable.Cols.BEEF)) > 0;
        boolean pork = getInt(getColumnIndex(PizzaTable.Cols.PORK)) > 0;
        boolean mushrooms = getInt(getColumnIndex(PizzaTable.Cols.MUSHROOMS)) > 0;
        boolean roasted_spinach = getInt(getColumnIndex(PizzaTable.Cols.ROASTED_SPINACH)) > 0;
        boolean red_onions = getInt(getColumnIndex(PizzaTable.Cols.RED_ONIONS)) > 0;
        boolean black_olives = getInt(getColumnIndex(PizzaTable.Cols.BLACK_OLIVES)) > 0;
        boolean green_bell_peppers = getInt(getColumnIndex(PizzaTable.Cols.GREEN_BELL_PEPPERS)) > 0;
        boolean banana_peppers = getInt(getColumnIndex(PizzaTable.Cols.BANANA_PEPPERS)) > 0;
        boolean pineapple = getInt(getColumnIndex(PizzaTable.Cols.PINEAPPLE)) > 0;
        boolean jalapeno = getInt(getColumnIndex(PizzaTable.Cols.JALAPENO)) > 0;
        boolean roma_tomatoes = getInt(getColumnIndex(PizzaTable.Cols.ROMA_TOMATOES)) > 0;
        boolean philly_steak = getInt(getColumnIndex(PizzaTable.Cols.PHILLY_STEAK)) > 0;
        boolean sausage = getInt(getColumnIndex(PizzaTable.Cols.SAUSAGE)) > 0;
        boolean anchovies = getInt(getColumnIndex(PizzaTable.Cols.ANCHOVIES)) > 0;
        boolean canadian_bacon = getInt(getColumnIndex(PizzaTable.Cols.CANADIAN_BACON)) > 0;
        boolean salami = getInt(getColumnIndex(PizzaTable.Cols.SALAMI)) > 0;
        boolean onions = getInt(getColumnIndex(PizzaTable.Cols.ONIONS)) > 0;
        boolean green_olives = getInt(getColumnIndex(PizzaTable.Cols.GREEN_OLIVES)) > 0;
        boolean lettuce = getInt(getColumnIndex(PizzaTable.Cols.LETTUCE)) > 0;
        boolean pickles = getInt(getColumnIndex(PizzaTable.Cols.PICKLES)) > 0;
        boolean fresh_spinach = getInt(getColumnIndex(PizzaTable.Cols.FRESH_SPINACH)) > 0;

        Pizza pizza = new Pizza(UUID.fromString(uuidString));
        pizza.setRestaurant(restaurantName);
        pizza.setStyle(style);
        pizza.setProperRadius(properRadius);
        pizza.setToppingPrice(toppingPrice);
        pizza.setPepperoni(pepperoni);
        pizza.setItalian_sausage(italian_sausage);
        pizza.setMeatball(meatball);
        pizza.setHam(ham);
        pizza.setBacon(bacon);
        pizza.setGrilled_chicken(grilled_chicken);
        pizza.setBeef(beef);
        pizza.setPork(pork);
        pizza.setMushrooms(mushrooms);
        pizza.setRoasted_spinach(roasted_spinach);
        pizza.setRed_onions(red_onions);
        pizza.setBlack_olives(black_olives);
        pizza.setGreen_bell_peppers(green_bell_peppers);
        pizza.setBanana_peppers(banana_peppers);
        pizza.setPineapple(pineapple);
        pizza.setJalapeno(jalapeno);
        pizza.setRoma_tomatoes(roma_tomatoes);
        pizza.setPhilly_steak(philly_steak);
        pizza.setSausage(sausage);
        pizza.setAnchovies(anchovies);
        pizza.setCanadian_bacon(canadian_bacon);
        pizza.setSalami(salami);
        pizza.setOnions(onions);
        pizza.setGreen_olives(green_olives);
        pizza.setLettuce(lettuce);
        pizza.setPickles(pickles);
        pizza.setFresh_spinach(fresh_spinach);

        return pizza;
    }
}