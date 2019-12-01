package com.pizza_pi.database;

import android.database.Cursor;
import android.database.CursorWrapper;

import java.util.UUID;

import static com.pizza_pi.database.RestaurantDbSchema.RestaurantTable;

/**
 * The cursor wrapper for the RestaurantBase SQLite database.
 * Basically helps retrieve data form the database.
 */

public class RestaurantCursorWrapper extends CursorWrapper
{

    public RestaurantCursorWrapper(Cursor cursor)
    {
        super(cursor);
    }

    public Restaurant getRestaurant()
    {
        String uuidString = getString(getColumnIndex(RestaurantTable.Cols.UUID));
        String restaurantName = getString(getColumnIndex(RestaurantTable.Cols.RESTAURANT));
        String style = getString(getColumnIndex(RestaurantTable.Cols.STYLE));
        double properRadius = getDouble(getColumnIndex(RestaurantTable.Cols.PROPER_RADIUS));
        double toppingPrice = getDouble(getColumnIndex(RestaurantTable.Cols.TOPPING_PRICE));
        boolean pepperoni = getInt(getColumnIndex(RestaurantTable.Cols.PEPPERONI)) > 0;
        boolean italian_sausage = getInt(getColumnIndex(RestaurantTable.Cols.ITALIAN_SAUSAGE)) > 0;
        boolean meatball = getInt(getColumnIndex(RestaurantTable.Cols.MEATBALL)) > 0;
        boolean ham = getInt(getColumnIndex(RestaurantTable.Cols.HAM)) > 0;
        boolean bacon = getInt(getColumnIndex(RestaurantTable.Cols.BACON)) > 0;
        boolean grilled_chicken = getInt(getColumnIndex(RestaurantTable.Cols.GRILLED_CHICKEN)) > 0;
        boolean beef = getInt(getColumnIndex(RestaurantTable.Cols.BEEF)) > 0;
        boolean pork = getInt(getColumnIndex(RestaurantTable.Cols.PORK)) > 0;
        boolean mushrooms = getInt(getColumnIndex(RestaurantTable.Cols.MUSHROOMS)) > 0;
        boolean roasted_spinach = getInt(getColumnIndex(RestaurantTable.Cols.ROASTED_SPINACH)) > 0;
        boolean red_onions = getInt(getColumnIndex(RestaurantTable.Cols.RED_ONIONS)) > 0;
        boolean black_olives = getInt(getColumnIndex(RestaurantTable.Cols.BLACK_OLIVES)) > 0;
        boolean green_bell_peppers = getInt(getColumnIndex(RestaurantTable.Cols.GREEN_BELL_PEPPERS)) > 0;
        boolean banana_peppers = getInt(getColumnIndex(RestaurantTable.Cols.BANANA_PEPPERS)) > 0;
        boolean pineapple = getInt(getColumnIndex(RestaurantTable.Cols.PINEAPPLE)) > 0;
        boolean jalapeno = getInt(getColumnIndex(RestaurantTable.Cols.JALAPENO)) > 0;
        boolean roma_tomatoes = getInt(getColumnIndex(RestaurantTable.Cols.ROMA_TOMATOES)) > 0;
        boolean philly_steak = getInt(getColumnIndex(RestaurantTable.Cols.PHILLY_STEAK)) > 0;
        boolean sausage = getInt(getColumnIndex(RestaurantTable.Cols.SAUSAGE)) > 0;
        boolean anchovies = getInt(getColumnIndex(RestaurantTable.Cols.ANCHOVIES)) > 0;
        boolean canadian_bacon = getInt(getColumnIndex(RestaurantTable.Cols.CANADIAN_BACON)) > 0;
        boolean salami = getInt(getColumnIndex(RestaurantTable.Cols.SALAMI)) > 0;
        boolean onions = getInt(getColumnIndex(RestaurantTable.Cols.ONIONS)) > 0;
        boolean green_olives = getInt(getColumnIndex(RestaurantTable.Cols.GREEN_OLIVES)) > 0;
        boolean lettuce = getInt(getColumnIndex(RestaurantTable.Cols.LETTUCE)) > 0;
        boolean pickles = getInt(getColumnIndex(RestaurantTable.Cols.PICKLES)) > 0;
        boolean fresh_spinach = getInt(getColumnIndex(RestaurantTable.Cols.FRESH_SPINACH)) > 0;

        Restaurant Restaurant = new Restaurant(UUID.fromString(uuidString));
        Restaurant.setRestaurant(restaurantName);
        Restaurant.setStyle(style);
        Restaurant.setProperRadius(properRadius);
        Restaurant.setToppingPrice(toppingPrice);
        Restaurant.setPepperoni(pepperoni);
        Restaurant.setItalian_sausage(italian_sausage);
        Restaurant.setMeatball(meatball);
        Restaurant.setHam(ham);
        Restaurant.setBacon(bacon);
        Restaurant.setGrilled_chicken(grilled_chicken);
        Restaurant.setBeef(beef);
        Restaurant.setPork(pork);
        Restaurant.setMushrooms(mushrooms);
        Restaurant.setRoasted_spinach(roasted_spinach);
        Restaurant.setRed_onions(red_onions);
        Restaurant.setBlack_olives(black_olives);
        Restaurant.setGreen_bell_peppers(green_bell_peppers);
        Restaurant.setBanana_peppers(banana_peppers);
        Restaurant.setPineapple(pineapple);
        Restaurant.setJalapeno(jalapeno);
        Restaurant.setRoma_tomatoes(roma_tomatoes);
        Restaurant.setPhilly_steak(philly_steak);
        Restaurant.setSausage(sausage);
        Restaurant.setAnchovies(anchovies);
        Restaurant.setCanadian_bacon(canadian_bacon);
        Restaurant.setSalami(salami);
        Restaurant.setOnions(onions);
        Restaurant.setGreen_olives(green_olives);
        Restaurant.setLettuce(lettuce);
        Restaurant.setPickles(pickles);
        Restaurant.setFresh_spinach(fresh_spinach);

        return Restaurant;
    }
}