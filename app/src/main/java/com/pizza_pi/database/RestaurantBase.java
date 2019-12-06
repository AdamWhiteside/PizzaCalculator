package com.pizza_pi.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static com.pizza_pi.database.RestaurantDbSchema.*;

/**
 * Maintains the collection of Restaurant's
 */
public class RestaurantBase {

    /**
     * The singleton holding the Restaurant info.
     */
    private static RestaurantBase sRestaurantBase;

    /**
     * The context for creation of the singleton and database.
     */
    private Context mContext;

    /**
     * Handles the database
     */
    private SQLiteDatabase mDatabase;

    /**
     * returns the RestaurantBase singleton
     * @param context the context for the call
     * @return the RestaurantBase singleton
     */
    public static RestaurantBase getRestaurantBase(Context context)
    {
        if(sRestaurantBase == null)
        {
            sRestaurantBase = new RestaurantBase(context);
        }
        return sRestaurantBase;
    }

    /**
     * Creates a new instance of the RestaurantBase
     * @param context the context for the call
     */
    private RestaurantBase(Context context)
    {
        mContext = context.getApplicationContext();
        mDatabase= new RestaurantBaseHelper(mContext).getWritableDatabase();
    }

    /**
     * Returns the list of Restaurant objects
     * @return the list of Restaurant objects
     */
    public List<Restaurant> getRestaurants()
    {
        List<Restaurant> Restaurants = new ArrayList<>();

        RestaurantCursorWrapper cursor = queryRestaurants(null, null);

        try {
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                Restaurants.add(cursor.getRestaurant());
                cursor.moveToNext();
            }
        }
        finally
        {
            cursor.close();
        }

        Restaurant currentPlace = Restaurants.get(1);
        return Restaurants;
    }

    /**
     * Given a specific Restaurant id either returns the Restaurant with that id
     * or null if no Restaurant with that id is found
     * @param id the id that is used to find the Restaurant
     * @return the Restaurant with that id or null if none exists
     */
    public Restaurant getRestaurant(UUID id)
    {
        RestaurantCursorWrapper cursor = queryRestaurants(
                RestaurantDbSchema.RestaurantTable.Cols.UUID + " = ?",
                new String[] { id.toString()}
        );
        try {
            if (cursor.getCount() == 0) {
                return null;
            }

            cursor.moveToFirst();
            return cursor.getRestaurant();
        }
        finally{
            cursor.close();
        }
    }

    public Restaurant getRestaurantName(String name)
    {
        RestaurantCursorWrapper cursor = queryRestaurants(
               RestaurantTable.Cols.RESTAURANT + " = ?",
                new String[] {name}
        );
        try {
            if (cursor.getCount() == 0) {
                return null;
            }

            cursor.moveToFirst();
            return cursor.getRestaurant();
        }
        finally {
            cursor.close();
        }
    }

    /**
     * Adds a new Restaurant into the RestaurantBase
     * @param Restaurant the Restaurant that is being added
     */
    public void addRestaurant(Restaurant Restaurant)
    {
        ContentValues values = RestaurantBase.getContentValues(Restaurant);
        mDatabase.insert(RestaurantTable.NAME, null, values);
    }

    /**
     * Updates an existing Restaurant in the RestaurantBase
     * @param Restaurant the Restaurant to update
     */
    public void updateRestaurant(Restaurant Restaurant)
    {
        String uuidString = Restaurant.getId().toString();
        ContentValues values = RestaurantBase.getContentValues(Restaurant);

        mDatabase.update(RestaurantTable.NAME, values,
                RestaurantTable.Cols.UUID + " = ?",
                new String[] { uuidString });
    }

    /**
     * Delets a Restaurant from the RestaurantBase
     * @param Restaurant the Restaurant to be deleted
     */
    public void deleteRestaurant(Restaurant Restaurant)
    {
        String uuidString = Restaurant.getId().toString();

        mDatabase.delete(RestaurantTable.NAME,
                RestaurantTable.Cols.UUID + " = ?",
                new String[] { uuidString });
    }

    /**
     * Query the Restaurant table, filtering using the given where info
     * @param whereClause the where clause to use in our filtering
     * @param whereArgs any arguments needed in the where clause
     * @return a Cursor with the resulting values
     */
    private RestaurantCursorWrapper queryRestaurants(String whereClause, String[] whereArgs)
    {
        Cursor cursor = mDatabase.query(
                RestaurantTable.NAME,
                null,
                whereClause,
                whereArgs,
                null,
                null,
                null);

        return new RestaurantCursorWrapper(cursor);
    }

    /**
     * Creates a ContentValues instance based on the given Restaurant
     * @param Restaurant the Restaurant to convert into a ContentValues object
     * @return the resulting ContentValues instance
     */
    private static ContentValues getContentValues(Restaurant Restaurant)
    {
        ContentValues values = new ContentValues();
        values.put(RestaurantTable.Cols.UUID, Restaurant.getId().toString());

        values.put(RestaurantTable.Cols.RESTAURANT, Restaurant.getRestaurant());
        values.put(RestaurantTable.Cols.QUALITY, Restaurant.getQuality());

        values.put(RestaurantTable.Cols.PERSONAL_THIN_CRUST, Restaurant.getPersonal_Thin_Crust());
        values.put(RestaurantTable.Cols.SMALL_THIN_CRUST, Restaurant.getSmall_Thin_Crust());
        values.put(RestaurantTable.Cols.MEDIUM_THIN_CRUST, Restaurant.getMedium_Thin_Crust());
        values.put(RestaurantTable.Cols.LARGE_THIN_CRUST, Restaurant.getLarge_Thin_Crust());
        values.put(RestaurantTable.Cols.PERSONAL_NEW_YORK, Restaurant.getPersonal_New_York());
        values.put(RestaurantTable.Cols.SMALL_NEW_YORK, Restaurant.getSmall_New_York());
        values.put(RestaurantTable.Cols.MEDIUM_NEW_YORK, Restaurant.getMedium_New_York());
        values.put(RestaurantTable.Cols.LARGE_NEW_YORK, Restaurant.getLarge_New_York());
        values.put(RestaurantTable.Cols.MEDIUM_ITALIAN, Restaurant.getMedium_Italian());
        values.put(RestaurantTable.Cols.LARGE_ITALIAN, Restaurant.getLarge_Italian());
        values.put(RestaurantTable.Cols.MEDIUM_STUFFED_CRUST, Restaurant.getMedium_Stuffed_Crust());
        values.put(RestaurantTable.Cols.LARGE_STUFFED_CRUST, Restaurant.getLarge_Stuffed_Crust());
        values.put(RestaurantTable.Cols.SMALL_ORIGINAL, Restaurant.getSmall_Original());
        values.put(RestaurantTable.Cols.MEDIUM_ORIGINAL, Restaurant.getMedium_Original());
        values.put(RestaurantTable.Cols.LARGE_ORIGINAL, Restaurant.getLarge_Original());
        values.put(RestaurantTable.Cols.EXTRA_LARGE_ORIGINAL, Restaurant.getExtra_Large_Original());
        values.put(RestaurantTable.Cols.SMALL_GLUTEN_FREE, Restaurant.getSmall_Gluten_Free());
        values.put(RestaurantTable.Cols.PERSONAL_ORIGINAL_PAN, Restaurant.getPersonal_Original_Pan());
        values.put(RestaurantTable.Cols.MEDIUM_ORIGINAL_PAN, Restaurant.getMedium_Original_Pan());
        values.put(RestaurantTable.Cols.LARGE_ORIGINAL_PAN, Restaurant.getLarge_Original_Pan());
        values.put(RestaurantTable.Cols.MEDIUM_HAND_TOSSED, Restaurant.getMedium_Hand_Tossed());
        values.put(RestaurantTable.Cols.LARGE_HAND_TOSSED, Restaurant.getLarge_Hand_Tossed());


        values.put(RestaurantTable.Cols.PROPER_RADIUS, Restaurant.getProperRadius());
        values.put(RestaurantTable.Cols.TOPPING_PRICE, Restaurant.getToppingPrice());
        values.put(RestaurantTable.Cols.PEPPERONI, Restaurant.isPepperoni());
        values.put(RestaurantTable.Cols.ITALIAN_SAUSAGE, Restaurant.isItalian_sausage());
        values.put(RestaurantTable.Cols.MEATBALL, Restaurant.isMeatball());
        values.put(RestaurantTable.Cols.HAM, Restaurant.isHam());
        values.put(RestaurantTable.Cols.BACON, Restaurant.isBacon());
        values.put(RestaurantTable.Cols.GRILLED_CHICKEN, Restaurant.isGrilled_chicken());
        values.put(RestaurantTable.Cols.BEEF, Restaurant.isBeef());
        values.put(RestaurantTable.Cols.PORK, Restaurant.isPork());
        values.put(RestaurantTable.Cols.MUSHROOMS, Restaurant.isMushrooms());
        values.put(RestaurantTable.Cols.ROASTED_SPINACH, Restaurant.isRoasted_spinach());
        values.put(RestaurantTable.Cols.RED_ONIONS, Restaurant.isRed_onions());
        values.put(RestaurantTable.Cols.BLACK_OLIVES, Restaurant.isBlack_olives());
        values.put(RestaurantTable.Cols.GREEN_BELL_PEPPERS, Restaurant.isGreen_bell_peppers());
        values.put(RestaurantTable.Cols.BANANA_PEPPERS, Restaurant.isBanana_peppers());
        values.put(RestaurantTable.Cols.PINEAPPLE, Restaurant.isPineapple());
        values.put(RestaurantTable.Cols.JALAPENO, Restaurant.isJalapeno());
        values.put(RestaurantTable.Cols.ROMA_TOMATOES, Restaurant.isRoma_tomatoes());
        values.put(RestaurantTable.Cols.PHILLY_STEAK, Restaurant.isPhilly_steak());
        values.put(RestaurantTable.Cols.SAUSAGE, Restaurant.isSausage());
        values.put(RestaurantTable.Cols.ANCHOVIES, Restaurant.isAnchovies());
        values.put(RestaurantTable.Cols.CANADIAN_BACON, Restaurant.isCanadian_bacon());
        values.put(RestaurantTable.Cols.SALAMI, Restaurant.isSalami());
        values.put(RestaurantTable.Cols.ONIONS, Restaurant.isOnions());
        values.put(RestaurantTable.Cols.GREEN_OLIVES, Restaurant.isGreen_olives());
        values.put(RestaurantTable.Cols.LETTUCE, Restaurant.isLettuce());
        values.put(RestaurantTable.Cols.PICKLES, Restaurant.isPickles());
        values.put(RestaurantTable.Cols.FRESH_SPINACH, Restaurant.isFresh_spinach());


        return values;
    }
}
