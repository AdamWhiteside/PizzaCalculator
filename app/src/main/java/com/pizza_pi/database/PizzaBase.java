package com.pizza_pi.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static com.pizza_pi.database.PizzaDbSchema.*;

/**
 * Maintains the collection of Pizza's
 */
public class PizzaBase {

    /**
     * The singleton holding the Pizza info.
     */
    private static PizzaBase sPizzaBase;

    /**
     * The context for creation of the singleton and database.
     */
    private Context mContext;

    /**
     * Handles the database
     */
    private SQLiteDatabase mDatabase;

    /**
     * returns the PizzaBase singleton
     * @param context the context for the call
     * @return the PizzaBase singleton
     */
    public static PizzaBase getPizzaBase(Context context)
    {
        if(sPizzaBase == null)
        {
            sPizzaBase = new PizzaBase(context);
        }
        return sPizzaBase;
    }

    /**
     * Creates a new instance of the PizzaBase
     * @param context the context for the call
     */
    private PizzaBase(Context context)
    {
        mContext = context.getApplicationContext();
        mDatabase= new PizzaBaseHelper(mContext).getWritableDatabase();
    }

    /**
     * Returns the list of Pizza objects
     * @return the list of Pizza objects
     */
    public List<Pizza> getPizzas()
    {
        List<Pizza> pizzas = new ArrayList<>();

        PizzaCursorWrapper cursor = queryPizzas(null, null);

        try {
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                pizzas.add(cursor.getPizza());
                cursor.moveToNext();
            }
        }
        finally
        {
            cursor.close();
        }
        return pizzas;
    }

    /**
     * Given a specific pizza id either returns the pizza with that id
     * or null if no pizza with that id is found
     * @param id the id that is used to find the pizza
     * @return the pizza with that id or null if none exists
     */
    public Pizza getPizza(UUID id)
    {
        PizzaCursorWrapper cursor = queryPizzas(
                PizzaDbSchema.PizzaTable.Cols.UUID + " = ?",
                new String[] { id.toString()}
        );
        try {
            if (cursor.getCount() == 0) {
                return null;
            }

            cursor.moveToFirst();
            return cursor.getPizza();
        }
        finally{
            cursor.close();
        }
    }

    /**
     * Adds a new pizza into the pizzaBase
     * @param pizza the pizza that is being added
     */
    public void addPizza(Pizza pizza)
    {
        ContentValues values = PizzaBase.getContentValues(pizza);
        mDatabase.insert(PizzaTable.NAME, null, values);
    }

    /**
     * Updates an existing pizza in the pizzaBase
     * @param pizza the pizza to update
     */
    public void updatePizza(Pizza pizza)
    {
        String uuidString = pizza.getId().toString();
        ContentValues values = PizzaBase.getContentValues(pizza);

        mDatabase.update(PizzaTable.NAME, values,
                PizzaTable.Cols.UUID + " = ?",
                new String[] { uuidString });
    }

    /**
     * Delets a pizza from the pizzaBase
     * @param pizza the pizza to be deleted
     */
    public void deletePizza(Pizza pizza)
    {
        String uuidString = pizza.getId().toString();

        mDatabase.delete(PizzaTable.NAME,
                PizzaTable.Cols.UUID + " = ?",
                new String[] { uuidString });
    }

    /**
     * Query the pizza table, filtering using the given where info
     * @param whereClause the where clause to use in our filtering
     * @param whereArgs any arguments needed in the where clause
     * @return a Cursor with the resulting values
     */
    private PizzaCursorWrapper queryPizzas(String whereClause, String[] whereArgs)
    {
        Cursor cursor = mDatabase.query(
                PizzaTable.NAME,
                null,
                whereClause,
                whereArgs,
                null,
                null,
                null);

        return new PizzaCursorWrapper(cursor);
    }

    /**
     * Creates a ContentValues instance based on the given pizza
     * @param pizza the pizza to convert into a ContentValues object
     * @return the resulting ContentValues instance
     */
    private static ContentValues getContentValues(Pizza pizza)
    {
        ContentValues values = new ContentValues();
        values.put(PizzaTable.Cols.UUID, pizza.getId().toString());
        values.put(PizzaTable.Cols.RESTAURANT, pizza.getRestaurant());
        values.put(PizzaTable.Cols.STYLE, pizza.getStyle());
        values.put(PizzaTable.Cols.PROPER_RADIUS, pizza.getProperRadius());
        values.put(PizzaTable.Cols.TOPPING_PRICE, pizza.getToppingPrice());
        values.put(PizzaTable.Cols.PEPPERONI, pizza.isPepperoni());
        values.put(PizzaTable.Cols.ITALIAN_SAUSAGE, pizza.isItalian_sausage());
        values.put(PizzaTable.Cols.MEATBALL, pizza.isMeatball());
        values.put(PizzaTable.Cols.HAM, pizza.isHam());
        values.put(PizzaTable.Cols.BACON, pizza.isBacon());
        values.put(PizzaTable.Cols.GRILLED_CHICKEN, pizza.isGrilled_chicken());
        values.put(PizzaTable.Cols.BEEF, pizza.isBeef());
        values.put(PizzaTable.Cols.PORK, pizza.isPork());
        values.put(PizzaTable.Cols.MUSHROOMS, pizza.isMushrooms());
        values.put(PizzaTable.Cols.ROASTED_SPINACH, pizza.isRoasted_spinach());
        values.put(PizzaTable.Cols.RED_ONIONS, pizza.isRed_onions());
        values.put(PizzaTable.Cols.BLACK_OLIVES, pizza.isBlack_olives());
        values.put(PizzaTable.Cols.GREEN_BELL_PEPPERS, pizza.isGreen_bell_peppers());
        values.put(PizzaTable.Cols.BANANA_PEPPERS, pizza.isBanana_peppers());
        values.put(PizzaTable.Cols.PINEAPPLE, pizza.isPineapple());
        values.put(PizzaTable.Cols.JALAPENO, pizza.isJalapeno());
        values.put(PizzaTable.Cols.ROMA_TOMATOES, pizza.isRoma_tomatoes());
        values.put(PizzaTable.Cols.PHILLY_STEAK, pizza.isPhilly_steak());
        values.put(PizzaTable.Cols.SAUSAGE, pizza.isSausage());
        values.put(PizzaTable.Cols.ANCHOVIES, pizza.isAnchovies());
        values.put(PizzaTable.Cols.CANADIAN_BACON, pizza.isCanadian_bacon());
        values.put(PizzaTable.Cols.SALAMI, pizza.isSalami());
        values.put(PizzaTable.Cols.ONIONS, pizza.isOnions());
        values.put(PizzaTable.Cols.GREEN_OLIVES, pizza.isGreen_olives());
        values.put(PizzaTable.Cols.LETTUCE, pizza.isLettuce());
        values.put(PizzaTable.Cols.PICKLES, pizza.isPickles());
        values.put(PizzaTable.Cols.FRESH_SPINACH, pizza.isFresh_spinach());

        return values;
    }
}
