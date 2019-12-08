// PermEngine is called from the outside via the permProcessor method, which takes a PiSet object as input
// PermEngine, via permProcessor, returns a linked list of OrderObjects, pre-sorts from lowest to greatest price
// The returned list contains every possible combination of orders that meet or barely exceed the
// the need for food provided in the PiSet object.


package com.pizza_pi;

import com.pizza_pi.database.*;

import java.util.*;

public class PermEngine {
    private static List<String> blacklist = new LinkedList<String>();
    private static RestaurantBase database;


    // Called by the main window, passed something that is or can be converted to a PiSet Object

    public static LinkedList<OrderObject> permProcessor(PiSet gimme) {
        whiteLister(gimme);
        blackLister(gimme);


        gimme.setFoodUnits(gimme.getPeople()*100);
        LinkedList<OrderObject> out = new LinkedList<OrderObject>();

        // This cycles restaurants and calls restperm on a per restaurant basis
        for (String restaurant : database.getRestaurantNames()) {
            Restaurant name = database.getRestaurantName(restaurant);

            // add restaurant to blacklist if it doesn't have the desired toppings
            for (String topping : gimme.getToppings()) {
                if (name.getToppings().contains(topping)) {
                    blacklist.add(restaurant);
                    continue;
                }
            }

            // add restaurant to blacklist if it doesn't have the desired type
            for (String type : gimme.getType()) {
                if (name.getStyles().contains(type)) {
                    blacklist.add(restaurant);
                    continue;
                }
            }

            if (blacklist.contains(restaurant)) continue;

            restPerms(out, gimme, restaurant);
        }

        Collections.sort(out);
        cullDups(out);
        return out;
    }

    // This function checks to see if the user decided to use a whitelist of restaurants and
    // updates their data to reflect it
    private static void whiteLister(PiSet gimme) {
        if (gimme.getWhiteB()) {
            gimme.setrestaurant(gimme.getWhitelist());
        }
    }

    // This function checks to see if the user decided to use a blacklist of restaurants and
    // updates their data to reflect it
    private static void blackLister(PiSet gimme) {
        List<String> postBlack = gimme.getrestaurant();

        if (gimme.getBlackB()) {
            for (String desu : gimme.getBlacklist()) {
                postBlack.remove(desu);
            }
            gimme.setrestaurant(postBlack);
        }
    }


    // Culls duplicates from a linked list of OrderObjects
    private static void cullDups(LinkedList<OrderObject> out) {
        for (int i = 0; i < out.size(); i++) {
            cullHelp(out, i+1, out.get(i));
        }
    }

    // Helps cullDups do its job by being the recursive unit
    private static void cullHelp(LinkedList<OrderObject> out, int index, OrderObject order) {
        if (out.size() > index) {
            // cycle remaining items in our great "out" list, run tests to check for duplicates
            for (int i = index; i < out.size(); i++) {
                boolean found = true;

                if (order.getOrder().size() != out.get(i).getOrder().size()) found = false;

                if (found == true) {
                    for (int k = 0; k < order.getOrder().size(); k++) {
                        if(!order.getOrder().get(k).getType().equals(out.get(i).getOrder().get(k).getType())) found = false;
                    }
                }

                if (found == true) {
                    out.remove(i);
                }
            }
        }
    }

    // Makes suitable input for restHelp
    private static void restPerms(List<OrderObject> out, PiSet info, String restaurant){
        List<PizzaObject> inItGoes = new LinkedList<PizzaObject>();
        OrderObject indiv = new OrderObject(0, inItGoes);

        List<String> types = new LinkedList<String>();
        types.addAll(info.getType());
        for (String ty : types) {
            List<String> types2 = new LinkedList<String>();
            types2.addAll(types);
            restHelp(out, info, indiv, restaurant, types2);
            types.remove(ty);
        }
    }

    // Fill out with all order permutation that pertain to a specific restaurant
    private static void restHelp(List<OrderObject> out, PiSet info, OrderObject indiv, String restaurant, List<String> types){
        PizzaObject current = new PizzaObject(pizzaPrice(info.getToppings(), types.get(0), restaurant), types.get(0),
                fuCount(types.get(0), restaurant), info.getToppings());
        indiv.getOrder().add(current);

        List<PizzaObject> temp = new LinkedList<>();
        OrderObject order = new OrderObject(0, temp);
        order.getOrder().addAll(indiv.getOrder());

        if (fuCount(order, restaurant) >= info.getFoodUnits()) {
            orderPrice(order);
            out.add(order);
            return;
        }

        if (types != null) {
            restHelp(out, info, order, restaurant, types);

            if (types.size() != 1) {
                List<String> types2 = new LinkedList<String>();
                types2.addAll(types);
                types2.remove(0);
                restHelp(out, info, indiv, restaurant, types2);
            }
        }
    }

    // Overloaded method to calculate the foodUnits of a given item
    private static int fuCount(OrderObject order, String restaurant) {
        Restaurant name = database.getRestaurantName(restaurant);
        int total = 0;

        for (PizzaObject pizza : order.getOrder()) {
            total += name.getFood_Units(pizza.getType());
        }

        return total;
    }
    private static int fuCount(PizzaObject pizza, String restaurant) {
        Restaurant name = database.getRestaurantName(restaurant);
        int total = 0;

        total += name.getFood_Units(pizza.getType());

        return total;
    }
    private static int fuCount(String type, String restaurant) {
        Restaurant name = database.getRestaurantName(restaurant);
        int total = 0;

        total += name.getFood_Units(type);

        return total;
    }

    // Returns the price of a given pizza order
    private static double pizzaPrice(List<String> top, String type, String restaurant) {
        double topPrice = 0.0;
        Restaurant name = database.getRestaurantName(restaurant);
        if (top != null) {
            topPrice += name.getToppingPrice();
        }

        double totalPrice = topPrice+name.getPrice(type);

        return totalPrice;
    }


    // Determines the price of an entire order and updates the given order's price field
    private static void orderPrice(OrderObject order) {
        double price = 0;

        for (PizzaObject pi : order.getOrder()) {
            price += pi.getPrice();
        }

        order.setPrice(price);
    }
}


