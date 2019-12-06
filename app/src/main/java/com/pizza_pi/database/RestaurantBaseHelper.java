package com.pizza_pi.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.pizza_pi.database.RestaurantDbSchema.RestaurantTable;

/**
 * Helper for the RestaurantBase SQLite database.
 */

public class RestaurantBaseHelper extends SQLiteOpenHelper
{

    private static final int VERSION = 1;
    private static final String DATABASE_NAME ="RestaurantBase.db";

    public RestaurantBaseHelper(Context context)
    {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("create table " + RestaurantTable.NAME + "(" +
                " _id integer primary key autoincrement, " +
                RestaurantTable.Cols.UUID + ", " +

                RestaurantTable.Cols.RESTAURANT + ", " +

                RestaurantTable.Cols.PERSONAL_THIN_CRUST + ", " +
                RestaurantTable.Cols.SMALL_THIN_CRUST + ", " +
                RestaurantTable.Cols.MEDIUM_THIN_CRUST + ", " +
                RestaurantTable.Cols.LARGE_THIN_CRUST + ", " +
                RestaurantTable.Cols.PERSONAL_NEW_YORK + ", " +
                RestaurantTable.Cols.SMALL_NEW_YORK + ", " +
                RestaurantTable.Cols.MEDIUM_NEW_YORK + ", " +
                RestaurantTable.Cols.LARGE_NEW_YORK + ", " +
                RestaurantTable.Cols.MEDIUM_ITALIAN + ", " +
                RestaurantTable.Cols.LARGE_ITALIAN + ", " +
                RestaurantTable.Cols.MEDIUM_STUFFED_CRUST + ", " +
                RestaurantTable.Cols.LARGE_STUFFED_CRUST + ", " +
                RestaurantTable.Cols.SMALL_ORIGINAL + ", " +
                RestaurantTable.Cols.MEDIUM_ORIGINAL + ", " +
                RestaurantTable.Cols.LARGE_ORIGINAL + ", " +
                RestaurantTable.Cols.EXTRA_LARGE_ORIGINAL + ", " +
                RestaurantTable.Cols.SMALL_GLUTEN_FREE + ", " +
                RestaurantTable.Cols.PERSONAL_ORIGINAL_PAN + ", " +
                RestaurantTable.Cols.MEDIUM_ORIGINAL_PAN + ", " +
                RestaurantTable.Cols.LARGE_ORIGINAL_PAN + ", " +
                RestaurantTable.Cols.MEDIUM_HAND_TOSSED + ", " +
                RestaurantTable.Cols.LARGE_HAND_TOSSED + ", " +

                RestaurantTable.Cols.PROPER_RADIUS + ", " +
                RestaurantTable.Cols.TOPPING_PRICE + ", " +
                RestaurantTable.Cols.QUALITY + ", " +

                RestaurantTable.Cols.PEPPERONI + ", " +
                RestaurantTable.Cols.ITALIAN_SAUSAGE + ", " +
                RestaurantTable.Cols.MEATBALL + ", " +
                RestaurantTable.Cols.HAM + ", " +
                RestaurantTable.Cols.BACON +
                RestaurantTable.Cols.GRILLED_CHICKEN + ", " +
                RestaurantTable.Cols.BEEF + ", " +
                RestaurantTable.Cols.PORK + ", " +
                RestaurantTable.Cols.MUSHROOMS + ", " +
                RestaurantTable.Cols.ROASTED_SPINACH + ", " +
                RestaurantTable.Cols.RED_ONIONS + ", " +
                RestaurantTable.Cols.BLACK_OLIVES + ", " +
                RestaurantTable.Cols.GREEN_BELL_PEPPERS + ", " +
                RestaurantTable.Cols.BANANA_PEPPERS + ", " +
                RestaurantTable.Cols.PINEAPPLE + ", " +
                RestaurantTable.Cols.JALAPENO + ", " +
                RestaurantTable.Cols.ROMA_TOMATOES + ", " +
                RestaurantTable.Cols.PHILLY_STEAK + ", " +
                RestaurantTable.Cols.SAUSAGE + ", " +
                RestaurantTable.Cols.ANCHOVIES + ", " +
                RestaurantTable.Cols.CANADIAN_BACON + ", " +
                RestaurantTable.Cols.SALAMI + ", " +
                RestaurantTable.Cols.ONIONS + ", " +
                RestaurantTable.Cols.GREEN_OLIVES + ", " +
                RestaurantTable.Cols.LETTUCE + ", " +
                RestaurantTable.Cols.PICKLES + ", " +
                RestaurantTable.Cols.FRESH_SPINACH +
                ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {

    }
}