package com.pizza_pi.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.pizza_pi.database.PizzaDbSchema.PizzaTable;

/**
 * Helper for the PizzaBase SQLite database.
 */

public class PizzaBaseHelper extends SQLiteOpenHelper
{

    private static final int VERSION = 1;
    private static final String DATABASE_NAME ="pizzaBase.db";

    public PizzaBaseHelper(Context context)
    {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("create table " + PizzaTable.NAME + "(" +
                " _id integer primary key autoincrement, " +
                PizzaTable.Cols.UUID + ", " +
                PizzaTable.Cols.RESTAURANT + ", " +
                PizzaTable.Cols.STYLE + ", " +
                PizzaTable.Cols.PROPER_RADIUS + ", " +
                PizzaTable.Cols.TOPPING_PRICE + ", " +
                PizzaTable.Cols.PEPPERONI + ", " +
                PizzaTable.Cols.ITALIAN_SAUSAGE + ", " +
                PizzaTable.Cols.MEATBALL + ", " +
                PizzaTable.Cols.HAM + ", " +
                PizzaTable.Cols.BACON +
                PizzaTable.Cols.GRILLED_CHICKEN + ", " +
                PizzaTable.Cols.BEEF + ", " +
                PizzaTable.Cols.PORK + ", " +
                PizzaTable.Cols.MUSHROOMS + ", " +
                PizzaTable.Cols.ROASTED_SPINACH + ", " +
                PizzaTable.Cols.RED_ONIONS + ", " +
                PizzaTable.Cols.BLACK_OLIVES + ", " +
                PizzaTable.Cols.GREEN_BELL_PEPPERS + ", " +
                PizzaTable.Cols.BANANA_PEPPERS + ", " +
                PizzaTable.Cols.PINEAPPLE + ", " +
                PizzaTable.Cols.JALAPENO + ", " +
                PizzaTable.Cols.ROMA_TOMATOES + ", " +
                PizzaTable.Cols.PHILLY_STEAK + ", " +
                PizzaTable.Cols.SAUSAGE + ", " +
                PizzaTable.Cols.ANCHOVIES + ", " +
                PizzaTable.Cols.CANADIAN_BACON + ", " +
                PizzaTable.Cols.SALAMI + ", " +
                PizzaTable.Cols.ONIONS + ", " +
                PizzaTable.Cols.GREEN_OLIVES + ", " +
                PizzaTable.Cols.LETTUCE + ", " +
                PizzaTable.Cols.PICKLES + ", " +
                PizzaTable.Cols.FRESH_SPINACH + ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {

    }
}