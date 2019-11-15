package com.pizza_pi.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Maintains the collection of Pizza's
 */
public class PizzaBase {

    private static PizzaBase sPizzaBase;

    private Context mContext;

    private SQLiteDatabase mDatabase;

    public static PizzaBase getPizzaBase(Context context)
    {
        if(sPizzaBase == null)
        {
            sPizzaBase = new PizzaBase(context);
        }
        return sPizzaBase;
    }

    private PizzaBase(Context context)
    {
        mContext = context.getApplicationContext();
        mDatabase= new PizzaBaseHelper(mContext).getWritableDatabase();
    }

}
