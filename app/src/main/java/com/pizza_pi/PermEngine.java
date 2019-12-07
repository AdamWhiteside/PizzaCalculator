
package com.pizza_pi;

import java.util.*;

public class PermEngine {

    // Temp values to be sourced from the DB
    static double toppingPrice = 2;
    static double smallSicilianPrice = 6;
    static double mediumHandTossedPrice = 8.50;
    static double largeThinCrustPrice = 11.25;
    static List<String> fakeDBRest = new LinkedList<String>();
    static List<String> fakeDBTypeDom = new LinkedList<String>();
    static List<String> fakeDBTopDom = new LinkedList<String>();
    static List<String> fakeDBTypeHut = new LinkedList<String>();
    static List<String> fakeDBTopHut = new LinkedList<String>();
    static List<String> blacklist = new LinkedList<String>();





    public static void main(String[] args) {

        List<String> pi = new LinkedList<>();
        pi.add("blackOlives");

        fakeDBRest.add("Dominos");
        fakeDBRest.add("PizzaHut");
        fakeDBTypeDom.add("smallSicilian");
        fakeDBTypeDom.add("mediumHandTossed");
        fakeDBTypeHut.add("smallSicilian");
        fakeDBTypeHut.add("mediumHandTossed");
        fakeDBTypeDom.add("largeThinCrust");
        fakeDBTopDom.add("blackOlives");
        fakeDBTopDom.add("blueOlives");
        fakeDBTopDom.add("redOlives");
        fakeDBTopHut.add("blackOlives");
        fakeDBTopHut.add("blueOlives");

        PizzaObject desu = new PizzaObject(0, "mediumHandTossed", 100, pi);

        List<PizzaObject> inItGoes = new LinkedList<PizzaObject>();
        OrderObject li = new OrderObject(0, inItGoes);
        li.getOrder().add(desu);

        //values for testPi
        List<String> restaurant = new LinkedList<>();
        List<String> type = new LinkedList<>();
        int people = 5;
        List<String> toppings = new LinkedList<>();
        List<String> whitelist = new LinkedList<>();
        List<String> blacklist = new LinkedList<>();
        boolean white = false;
        boolean black = false;
        int foodUnits = 0;

        restaurant.add("Dominos");
        type.add("smallSicilian");
        type.add("mediumHandTossed");
        toppings.add("blackOlives");

        PiSet testPi = new PiSet(restaurant, type, people, toppings, whitelist, blacklist, white, black, foodUnits);

        List<OrderObject> out = permProcessor(testPi);


        for (OrderObject ord : out) {
            System.out.println(ord.getPrice());
            //System.out.println(fuCount(ord));
            for (PizzaObject pizza : ord.getOrder()) {
                System.out.println(pizza.getType());
            }
        }

        System.out.println(out.size());
        System.out.println("test worked");
        System.out.println(testPi.getFoodUnits());
        // orderCalc test
        // System.out.print(orderCalc(li).get(0).getPrice());



    }

    // Goes through an OrderObject and updates its price field with the sum of all prices of contained PizzaObjects
    // [[[DB ACCESS UPDATE NEEDED]]]
    private static OrderObject orderCalc(OrderObject pi) {
        System.out.println("Got here: orderCalc");
        if (pi.getOrder().get(0) == null) return null;
        for (int i = 0; pi.getOrder().get(i) != null; i++) {
            pi.getOrder().get(i).setPrice( (toppingPrice * pi.getOrder().get(i).getToppings().size()) + typeValue(pi.getOrder().get(i).getType()) );
        }
        return pi;
    }

    // Helper for orderCalc, will be deleted?
    // [[[DB ACCESS UPDATE NEEDED]]]
    private static double typeValue(String type) {
        System.out.println("Got here: typeValue");
        switch (type) {
            case "smallSicilian":
                return smallSicilianPrice;
            case "mediumHandTossed":
                return mediumHandTossedPrice;
            case "largeThinCrust":
                return largeThinCrustPrice;
            default:
                return 0;
        }
    }

    private static int foodUnitDB(String type) {
        System.out.println("Got here: foodUnitDB");
        switch (type) {
            case "smallSicilian":
                return 100;
            case "mediumHandTossed":
                return 150;
            case "largeThinCrust":
                return 200;
            default:
                return 0;
        }
    }

    // Called by the main window, passed something that is or can be converted to a PiSet Object
    // [[[DB ACCESS UPDATE NEEDED]]]
    public static LinkedList<OrderObject> permProcessor(PiSet gimme) {
        System.out.println("Got here: permProcessorStart");
        gimme.setFoodUnits(gimme.getPeople()*100);
        // List<PizzaObject> inItGoes = new LinkedList<PizzaObject>();
        // OrderObject li = new OrderObject(0, inItGoes);
        LinkedList<OrderObject> out = new LinkedList<OrderObject>();

        // This cycles restaurants and calls restperm on a per restaurant basis
        //
        for (String restaurant : fakeDBRest) {
            System.out.println("Got here: permProcessorFor1");
            // add restaurant to blacklist if it doesn't have the desired toppings
            for (String topping : gimme.getToppings()) {
                System.out.println("Got here: permProcessorFor1a");
                // [[[DB ACCESS UPDATE NEEDED]]]
                if (!fakeDBTopDom.contains(topping)) {
                    System.out.println("Got here: permprocessorIf1");
                    blacklist.add(restaurant);
                    System.out.println("Got here: permprocessorIf1alt");
                    continue;
                }
            }
            // add restaurant to blacklist if it doesn't have the desired type
            for (String type : gimme.getType()) {
                System.out.println("Got here: permProcessorFor1b");
                // [[[DB ACCESS UPDATE NEEDED]]]
                if (!fakeDBTypeDom.contains(type)) {
                    System.out.println("Got here: permprocessorIf2");
                    blacklist.add(restaurant);
                    continue;
                }
            }

            // If either of those proc'd, skip this restaurant

            // DEBUG
            for (String rest : blacklist) {
                System.out.println(rest);
            }
            System.out.println(blacklist.contains(restaurant));

            // DEBUG
            if (blacklist.contains(restaurant)) continue;
            System.out.println("Got here: permProcessorIf3");

            restPerms(out, gimme, restaurant);

        }

        // [[[Vestigial?]]]
        //for (OrderObject l : out) {
        //		orderCalc(l);
        //}

        // hash test
        //LinkedHashSet<OrderObject> noDups = new LinkedHashSet<>(out);

        // two semi? is that meant to be?
        // what is this even sorting by? we want it by price, which is the first element, so maybe
        Collections.sort(out);;
        cullDups(out);
        System.out.println("Got here: permProcessorReturn");
        //out.reverse();
        return out;
    }

    // maybe test this
    private static void findDup(LinkedList<OrderObject> out, OrderObject order) {

    }

    // maybe test this
    private static void cullDups(LinkedList<OrderObject> out) {
        for (int i = 0; i < out.size(); i++) {
            cullHelp(out, i+1, out.get(i));
        }
    }

    private static void cullHelp(LinkedList<OrderObject> out, int index, OrderObject order) {
        System.out.println("Got here: cullHelp");
        if (out.size() > index) {
            System.out.println("Got here: cullHelpIf1");
            for (int i = index; i < out.size(); i++) {
                boolean found = true;

                if (order.getOrder().size() != out.get(i).getOrder().size()) found = false;
                System.out.println("Got here: cullHelpIf2");

                if (found == true) {
                    System.out.println("Got here: cullHelpIf3");
                    for (int k = 0; k < order.getOrder().size(); k++) {
                        if(!order.getOrder().get(k).getType().equals(out.get(i).getOrder().get(k).getType())) found = false;
                    }
                }

                if (found == true) {
                    System.out.println("Got here: cullHelpIf4");
                    out.remove(i);
                }
            }
        }
    }

    // Makes suitable input for restHelp
    private static void restPerms(List<OrderObject> out, PiSet info, String restaurant){
        System.out.println("Got here: restPerms");
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
        System.out.println("Got here: restHelp");
        // add type at current location to indiv
        // [[[DB ACCESS UPDATE NEEDED]]]
        PizzaObject current = new PizzaObject(pizzaPrice(info.getToppings(), types.get(0), restaurant), types.get(0),
                fuCount(types.get(0)), info.getToppings());
        indiv.getOrder().add(current);

        List<PizzaObject> temp = new LinkedList<>();
        OrderObject order = new OrderObject(0, temp);
        order.getOrder().addAll(indiv.getOrder());

        if (fuCount(order) >= info.getFoodUnits()) {
            System.out.println("Got here: restHelpIf1");
            orderPrice(order);
            out.add(order);
            return;
        }

        if (types != null) {
            System.out.println("Got here: restHelpIf2");
            restHelp(out, info, order, restaurant, types);

            if (types.size() != 1) {
                System.out.println("Got here: restHelpIf3");
                List<String> types2 = new LinkedList<String>();
                types2.addAll(types);
                types2.remove(0);
                restHelp(out, info, indiv, restaurant, types2);
            }
        }
    }

    // [[[DB ACCESS UPDATE NEEDED]]] REPLACE CONTENT WITH DB SEARCH FOR FOOD UNITS
    private static int fuCount(OrderObject order) {
        System.out.println("Got here: fuCount1");
        int total = 0;

        for (PizzaObject pizza : order.getOrder()) {
            total += foodUnitDB(pizza.getType());
        }

        return total;
    }
    private static int fuCount(PizzaObject pizza) {
        System.out.println("Got here: fuCount2");
        return foodUnitDB(pizza.getType());
    }
    private static int fuCount(String type) {
        System.out.println("Got here: fuCount3");
        return (int)typeValue(type);
    }

    // [[[DB ACCESS UPDATE NEEDED]]]
    private static double pizzaPrice(List<String> top, String type, String Restaurant) {
        System.out.println("Got here: pizzaPrice");
        // make this return based on a search of the DB
        return typeValue(type);
    }



    private static void orderPrice(OrderObject order) {
        System.out.println("Got here: orderPrice");
        double price = 0;

        for (PizzaObject pi : order.getOrder()) {
            price += pi.getPrice();
        }

        order.setPrice(price);
    }

    //private void sortOut(List<OrderObject> out) {
    //out.sort(Comparator.comparing(OrderObject::getPrice()));

    //}


    // old stuff
    // DO THIS PART AT PISET CREATION
    //if (info.type == null) {
    //	List<String> types = new LinkedList<>();
    //	types.add("smallSicilian");
    //	types.add("mediumHandTossed");
    //	types.add("largeThinCrust");
    //}

    //PiSet.type = types;

	/*
	private List<OrderObject> restHelp(List<OrderObject> out, PiSet info, OrderObject indiv){
		// add to out

		restHelp(out, info, indiv);
		restHelp(out.subList(0, out.size()), info.type.subList(0, type.size()), indiv);
		if (!indiv.isEmpty()) {
			out.add(indiv)
			return out;
		}
		return out;
	}

	private List<OrderObject> restPerms(List<OrderObject> out, PiSet info){
		OrderObject indiv = new LinkedList<>();
		return restHelp(out, info, indiv);
	}


		private void sortOut(List<OrderObject> out) {
		out.sort(new Comparator<OrderObject>() {
			@Override
			public double desu(OrderObject pi1, OrderObject pi2) {
				return compare(pi1.getPrice(), pi2.getPrice());
			}
		});
	}

			for (String restaurant : fakeDBRest) {
			// add restaurant to blacklist if it doesn't have the desired toppings
			if (gimme.getToppings() == null) {
				//lister(gimme.getrestaurant());
				continue;
			}
			// add restaurant to blacklist if it doesn't have the desired type
			if (gimme.getType() == null) {
				//lister(PiSet.restaurant);
				continue;
			}

			restPerms(out, gimme);

		}

	*/
}


