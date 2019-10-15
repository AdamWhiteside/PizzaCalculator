package com.pizza_pi.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.pizza_pi.database.PizzaDbSchema.PizzaTable;

public class PizzaBaseHelper extends SQLiteOpenHelper
{

    private static final int Version = 1;
    private static final String DATABASE_NAME ="pizzaBase.db";

   public PizzaBaseHelper(Context context)
   {
       super(context, DATABASE_NAME, null, Version);
   }

   @Override
   public void onCreate(SQLiteDatabase db)
   {
       db.execSQL("create table " + PizzaTable.NAME + "(" +
               " _id integer primary key autoincrement, " +
               PizzaTable.Cols.RESTAURANT + ", " +
               PizzaTable.Cols.SIZE + ", " +
               PizzaTable.Cols.TOPPING + ", " +
               PizzaTable.Cols.CRUST + ", " +
               PizzaTable.Cols.SAUCE + ", " +
               PizzaTable.Cols.PEOPLE_SERVED + ")");
   }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {

    }
}
