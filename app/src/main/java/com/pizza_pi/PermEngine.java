package com.pizza_pi;

import java.util.*;

public class PermEngine {

    // Temp values to be sourced from the DB
    double toppingPrice = 2;
    double smallSicilianPrice = 6;
    double mediumHandTossedPrice = 8.50;
    double largeThinCrustPrice = 11.25;
    List<String> fakeDBRest = new LinkedList<String>();
    List<String> fakeDBTypeDom = new LinkedList<String>();
    List<String> fakeDBTopDom = new LinkedList<String>();
    List<String> fakeDBTypeHut = new LinkedList<String>();
    List<String> fakeDBTopHut = new LinkedList<String>();
    List<String> blacklist = new LinkedList<String>();





    public void main(String[] args) {

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

        // orderCalc test
        // System.out.print(orderCalc(li).get(0).getPrice());


    }

    // Goes through an OrderObject and updates its price field with the sum of all prices of contained PizzaObjects
    // [[[DB ACCESS UPDATE NEEDED]]]
    private OrderObject orderCalc(OrderObject pi) {
        if (pi.getOrder().get(0) == null) return null;
        for (int i = 0; pi.getOrder().get(i) != null; i++) {
            pi.getOrder().get(i).setPrice( (toppingPrice * pi.getOrder().get(i).getToppings().size()) + typeValue(pi.getOrder().get(i).getType()) );
        }
        return pi;
    }

    // Helper for orderCalc, will be deleted?
    // [[[DB ACCESS UPDATE NEEDED]]]
    private double typeValue(String type) {
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

    // Called by the main window, passed something that is or can be converted to a PiSet Object
    // [[[DB ACCESS UPDATE NEEDED]]]
    public List<OrderObject> permProcessor(PiSet gimme) {
        gimme.setFoodUnits(gimme.getPeople()*100);
        // List<PizzaObject> inItGoes = new LinkedList<PizzaObject>();
        // OrderObject li = new OrderObject(0, inItGoes);
        List<OrderObject> out = new LinkedList<OrderObject>();

        // This cycles restaurants and calls restperm on a per restaurant basis
        //
        for (String restaurant : fakeDBRest) {
            // add restaurant to blacklist if it doesn't have the desired toppings
            for (String topping : gimme.getToppings()) {
                // [[[DB ACCESS UPDATE NEEDED]]]
                if (fakeDBTopHut.contains(topping)) {
                    blacklist.add(restaurant);
                    continue;
                }
            }
            // add restaurant to blacklist if it doesn't have the desired type
            for (String type : gimme.getType()) {
                // [[[DB ACCESS UPDATE NEEDED]]]
                if (fakeDBTypeHut.contains(type)) {
                    blacklist.add(restaurant);
                    continue;
                }
            }

            // If either of those proc'd, skip this restaurant
            if (blacklist.contains(restaurant)) continue;

            restPerms(out, gimme, restaurant);

        }

        // [[[Vestigial?]]]
        //for (OrderObject l : out) {
        //		orderCalc(l);
        //}

        // two semi? is that meant to be?
        // what is this even sorting by? we want it by price, which is the first element, so maybe
        Collections.sort(out);;

        return out;
    }

    // Makes suitable input for restHelp
    private void restPerms(List<OrderObject> out, PiSet info, String restaurant){
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
    private void restHelp(List<OrderObject> out, PiSet info, OrderObject indiv, String restaurant, List<String> types){

        // add type at current location to indiv
        // [[[DB ACCESS UPDATE NEEDED]]]
        PizzaObject current = new PizzaObject(pizzaPrice(info.getToppings(), types.get(0), restaurant), types.get(0), fuCount(types.get(0)), info.getToppings());
        indiv.getOrder().add(current);

        OrderObject order = new OrderObject(0, null);
        order.getOrder().addAll(indiv.getOrder());

        if (fuCount(order) >= info.getFoodUnits()) {
            orderPrice(order);
            out.add(order);
            return;
        }

        if (types != null) {
            restHelp(out, info, order, restaurant, types);

            if (types.get(1) != null) {
                List<String> types2 = new LinkedList<String>();
                types2.addAll(types);
                types2.remove(0);
                restHelp(out, info, indiv, restaurant, types2);
            }
        }
    }

    // [[[DB ACCESS UPDATE NEEDED]]] REPLACE CONTENT WITH DB SEARCH FOR FOOD UNITS
    private int fuCount(OrderObject order) {
        return (int)typeValue(order.getOrder().get(order.getOrder().size()).getType());
    }
    private int fuCount(PizzaObject pizza) {
        return (int)typeValue(pizza.getType());
    }
    private int fuCount(String type) {
        return (int)typeValue(type);
    }

    // [[[DB ACCESS UPDATE NEEDED]]]
    private double pizzaPrice(List<String> top, String type, String Restaurant) {

        // make this return based on a search of the DB
        return 0;
    }



    private void orderPrice(OrderObject order) {
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

