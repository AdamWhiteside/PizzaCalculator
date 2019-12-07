package com.pizza_pi.database;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * This is the basis of the database.
 * This is an object used to represent a restaurant.
 */
public class Restaurant implements Serializable
{
    private UUID mId;

    private String mRestaurant;

    private double mPersonal_Thin_Crust;
    private double mSmall_Thin_Crust;
    private double mMedium_Thin_Crust;
    private double mLarge_Thin_Crust;
    private double mPersonal_New_York;
    private double mSmall_New_York;
    private double mMedium_New_York;
    private double mLarge_New_York;
    private double mMedium_Italian;
    private double mLarge_Italian;
    private double mMedium_Stuffed_Crust;
    private double mLarge_Stuffed_Crust;
    private double mSmall_Original;
    private double mMedium_Original;
    private double mLarge_Original;
    private double mExtra_Large_Original;
    private double mSmall_Gluten_Free;
    private double mPersonal_Original_Pan;
    private double mMedium_Original_Pan;
    private double mLarge_Original_Pan;
    private double mMedium_Hand_Tossed;
    private double mLarge_Hand_Tossed;


    private double mProperRadius;
    private double mToppingPrice;
    private double mQuality;


    private boolean mPepperoni;
    private boolean mItalian_sausage;
    private boolean mMeatball;
    private boolean mHam;
    private boolean mBacon;
    private boolean mGrilled_chicken;
    private boolean mBeef;
    private boolean mPork;
    private boolean mMushrooms;
    private boolean mRoasted_spinach;
    private boolean mRed_onions;
    private boolean mBlack_olives;
    private boolean mGreen_bell_peppers;
    private boolean mBanana_peppers;
    private boolean mPineapple;
    private boolean mJalapeno;
    private boolean mRoma_tomatoes;
    private boolean mPhilly_steak;
    private boolean mSausage;
    private boolean mAnchovies;
    private boolean mCanadian_bacon;
    private boolean mSalami;
    private boolean mOnions;
    private boolean mGreen_olives;
    private boolean mLettuce;
    private boolean mPickles;
    private boolean mFresh_spinach;

    public Restaurant()
    {
        this(UUID.randomUUID());
    }

    public Restaurant(UUID id)
    {
        mId = id;

        mRestaurant = "";

        mPersonal_Thin_Crust = 0.0;
        mSmall_Thin_Crust = 0.0;
        mMedium_Thin_Crust = 0.0;
        mLarge_Thin_Crust = 0.0;
        mPersonal_New_York = 0.0;
        mSmall_New_York = 0.0;
        mMedium_New_York = 0.0;
        mLarge_New_York = 0.0;
        mMedium_Italian = 0.0;
        mLarge_Italian = 0.0;
        mMedium_Stuffed_Crust = 0.0;
        mLarge_Stuffed_Crust = 0.0;
        mSmall_Original = 0.0;
        mMedium_Original = 0.0;
        mLarge_Original = 0.0;
        mExtra_Large_Original = 0.0;
        mSmall_Gluten_Free = 0.0;
        mPersonal_Original_Pan = 0.0;
        mMedium_Original_Pan = 0.0;
        mLarge_Original_Pan = 0.0;
        mMedium_Hand_Tossed = 0.0;
        mLarge_Hand_Tossed = 0.0;


        mProperRadius = 0.0;
        mToppingPrice = 0.0;
        mQuality = 0.0;

        mPepperoni = false;
        mItalian_sausage = false;
        mMeatball = false;
        mHam = false;
        mBacon = false;
        mGrilled_chicken = false;
        mBeef = false;
        mPork = false;
        mMushrooms = false;
        mRoasted_spinach = false;
        mRed_onions = false;
        mBlack_olives = false;
        mGreen_bell_peppers = false;
        mBanana_peppers = false;
        mPineapple = false;
        mJalapeno = false;
        mRoma_tomatoes = false;
        mPhilly_steak = false;
        mSausage = false;
        mAnchovies = false;
        mCanadian_bacon = false;
        mSalami = false;
        mOnions = false;
        mGreen_olives = false;
        mLettuce = false;
        mPickles = false;
        mFresh_spinach = false;
    }

    public Restaurant(String Restaurant, Double properRadius, Double toppingPrice, double quality, boolean pepperoni, boolean italianSausage,
                      boolean meatball, boolean ham, boolean bacon, boolean grilledChicken, boolean beef, boolean pork,
                      boolean mushrooms, boolean roastedSpinach, boolean redOnions, boolean blackOlives, boolean greenBellPeppers,
                      boolean bananaPeppers, boolean pineapple, boolean jalapeno, boolean romaTomatoes, boolean phillySteak, boolean sausage,
                      boolean anchovies, boolean canadianBacon, boolean salami, boolean onions, boolean greenOlives, boolean lettuce,
                      boolean pickles, boolean freshSpinach, double personalThinCrust, double smallThinCrust, double mediumThinCrust,
                      double largeThinCrust, double personalNewYork, double smallNewYork, double mediumNewYork, double largeNewYork,
                      double mediumItalian, double largeItalian, double mediumStuffedCrust, double largeStuffedCrust, double smallOriginal,
                      double mediumOriginal, double largeOriginal, double extraLargeOriginal, double smallGlutenFree,
                      double personalOriginalPan, double mediumOriginalPan, double largeOriginalPan, double mediumHandTossed,
                      double largeHandTossed

    )
    {
        mId = UUID.randomUUID();
        
        mRestaurant = Restaurant;

        mPersonal_Thin_Crust = personalThinCrust;
        mSmall_Thin_Crust = smallThinCrust;
        mMedium_Thin_Crust = mediumThinCrust;
        mLarge_Thin_Crust = largeThinCrust;
        mPersonal_New_York = personalNewYork;
        mSmall_New_York = smallNewYork;
        mMedium_New_York = mediumNewYork;
        mLarge_New_York = largeNewYork;
        mMedium_Italian = mediumItalian;
        mLarge_Italian = largeItalian;
        mMedium_Stuffed_Crust = mediumStuffedCrust;
        mLarge_Stuffed_Crust = largeStuffedCrust;
        mSmall_Original = smallOriginal;
        mMedium_Original = mediumOriginal;
        mLarge_Original = largeOriginal;
        mExtra_Large_Original = extraLargeOriginal;
        mSmall_Gluten_Free = smallGlutenFree;
        mPersonal_Original_Pan = personalOriginalPan;
        mMedium_Original_Pan = mediumOriginalPan;
        mLarge_Original_Pan = largeOriginalPan;
        mMedium_Hand_Tossed = mediumHandTossed;
        mLarge_Hand_Tossed = largeHandTossed;
        
        mProperRadius = properRadius;
        mToppingPrice = toppingPrice;
        mQuality = quality;
        
        mPepperoni = pepperoni;
        mItalian_sausage = italianSausage;
        mMeatball = meatball;
        mHam = ham;
        mBacon = bacon;
        mGrilled_chicken = grilledChicken;
        mBeef = beef;
        mPork = pork;
        mMushrooms = mushrooms;
        mRoasted_spinach = roastedSpinach;
        mRed_onions = redOnions;
        mBlack_olives = blackOlives;
        mGreen_bell_peppers = greenBellPeppers;
        mBanana_peppers = bananaPeppers;
        mPineapple = pineapple;
        mJalapeno = jalapeno;
        mRoma_tomatoes = romaTomatoes;
        mPhilly_steak = phillySteak;
        mSausage = sausage;
        mAnchovies = anchovies;
        mCanadian_bacon = canadianBacon;
        mSalami = salami;
        mOnions = onions;
        mGreen_olives = greenOlives;
        mLettuce = lettuce;
        mPickles = pickles;
        mFresh_spinach = freshSpinach;
    }

    public UUID getId() {
        return mId;
    }

    public void setId(UUID id) {
        mId = id;
    }

    public String getRestaurant() {
        return mRestaurant;
    }

    public void setRestaurant(String restaurant) {
        mRestaurant = restaurant;
    }

    public double getProperRadius() {
        return mProperRadius;
    }

    public void setProperRadius(double properRadius) {
        mProperRadius = properRadius;
    }

    public double getToppingPrice() {
        return mToppingPrice;
    }

    public void setToppingPrice(double toppingPrice) {
        mToppingPrice = toppingPrice;
    }

    public boolean isPepperoni() {
        return mPepperoni;
    }

    public void setPepperoni(boolean pepperoni) {
        mPepperoni = pepperoni;
    }

    public boolean isItalian_sausage() {
        return mItalian_sausage;
    }

    public void setItalian_sausage(boolean italian_sausage) {
        mItalian_sausage = italian_sausage;
    }

    public boolean isMeatball() {
        return mMeatball;
    }

    public void setMeatball(boolean meatball) {
        mMeatball = meatball;
    }

    public boolean isHam() {
        return mHam;
    }

    public void setHam(boolean ham) {
        mHam = ham;
    }

    public boolean isBacon() {
        return mBacon;
    }

    public void setBacon(boolean bacon) {
        mBacon = bacon;
    }

    public boolean isGrilled_chicken() {
        return mGrilled_chicken;
    }

    public void setGrilled_chicken(boolean grilled_chicken) {
        mGrilled_chicken = grilled_chicken;
    }

    public boolean isBeef() {
        return mBeef;
    }

    public void setBeef(boolean beef) {
        mBeef = beef;
    }

    public boolean isPork() {
        return mPork;
    }

    public void setPork(boolean pork) {
        mPork = pork;
    }

    public boolean isMushrooms() {
        return mMushrooms;
    }

    public void setMushrooms(boolean mushrooms) {
        mMushrooms = mushrooms;
    }

    public boolean isRoasted_spinach() {
        return mRoasted_spinach;
    }

    public void setRoasted_spinach(boolean roasted_spinach) {
        mRoasted_spinach = roasted_spinach;
    }

    public boolean isRed_onions() {
        return mRed_onions;
    }

    public void setRed_onions(boolean red_onions) {
        mRed_onions = red_onions;
    }

    public boolean isBlack_olives() {
        return mBlack_olives;
    }

    public void setBlack_olives(boolean black_olives) {
        mBlack_olives = black_olives;
    }

    public boolean isGreen_bell_peppers() {
        return mGreen_bell_peppers;
    }

    public void setGreen_bell_peppers(boolean green_bell_peppers) {
        mGreen_bell_peppers = green_bell_peppers;
    }

    public boolean isBanana_peppers() {
        return mBanana_peppers;
    }

    public void setBanana_peppers(boolean banana_peppers) {
        mBanana_peppers = banana_peppers;
    }

    public boolean isPineapple() {
        return mPineapple;
    }

    public void setPineapple(boolean pineapple) {
        mPineapple = pineapple;
    }

    public boolean isJalapeno() {
        return mJalapeno;
    }

    public void setJalapeno(boolean jalapeno) {
        mJalapeno = jalapeno;
    }

    public boolean isRoma_tomatoes() {
        return mRoma_tomatoes;
    }

    public void setRoma_tomatoes(boolean roma_tomatoes) {
        mRoma_tomatoes = roma_tomatoes;
    }

    public boolean isPhilly_steak() {
        return mPhilly_steak;
    }

    public void setPhilly_steak(boolean philly_steak) {
        mPhilly_steak = philly_steak;
    }

    public boolean isSausage() {
        return mSausage;
    }

    public void setSausage(boolean sausage) {
        mSausage = sausage;
    }

    public boolean isAnchovies() {
        return mAnchovies;
    }

    public void setAnchovies(boolean anchovies) {
        mAnchovies = anchovies;
    }

    public boolean isCanadian_bacon() {
        return mCanadian_bacon;
    }

    public void setCanadian_bacon(boolean canadian_bacon) {
        mCanadian_bacon = canadian_bacon;
    }

    public boolean isSalami() {
        return mSalami;
    }

    public void setSalami(boolean salami) {
        mSalami = salami;
    }

    public boolean isOnions() {
        return mOnions;
    }

    public void setOnions(boolean onions) {
        mOnions = onions;
    }

    public boolean isGreen_olives() {
        return mGreen_olives;
    }

    public void setGreen_olives(boolean green_olives) {
        mGreen_olives = green_olives;
    }

    public boolean isLettuce() {
        return mLettuce;
    }

    public void setLettuce(boolean lettuce) {
        mLettuce = lettuce;
    }

    public boolean isPickles() {
        return mPickles;
    }

    public void setPickles(boolean pickles) {
        mPickles = pickles;
    }

    public boolean isFresh_spinach() {
        return mFresh_spinach;
    }

    public void setFresh_spinach(boolean fresh_spinach) {
        mFresh_spinach = fresh_spinach;
    }

    public double getPersonal_Thin_Crust() {
        return mPersonal_Thin_Crust;
    }

    public void setPersonal_Thin_Crust(double Personal_Thin_Crust) {
        mPersonal_Thin_Crust = Personal_Thin_Crust;
    }

    public double getSmall_Thin_Crust() {
        return mSmall_Thin_Crust;
    }

    public void setSmall_Thin_Crust(double Small_Thin_Crust) {
        mSmall_Thin_Crust = Small_Thin_Crust;
    }

    public double getMedium_Thin_Crust() {
        return mMedium_Thin_Crust;
    }

    public void setMedium_Thin_Crust(double Medium_Thin_Crust) {
        mMedium_Thin_Crust = Medium_Thin_Crust;
    }

    public double getLarge_Thin_Crust() {
        return mLarge_Thin_Crust;
    }

    public void setLarge_Thin_Crust(double Large_Thin_Crust) {
        mLarge_Thin_Crust = Large_Thin_Crust;
    }

    public double getPersonal_New_York() {
        return mPersonal_New_York;
    }

    public void setPersonal_New_York(double Personal_New_York) {
        mPersonal_New_York = Personal_New_York;
    }

    public double getSmall_New_York() {
        return mSmall_New_York;
    }

    public void setSmall_New_York(double Small_New_York) {
        mSmall_New_York = Small_New_York;
    }

    public double getMedium_New_York() {
        return mMedium_New_York;
    }

    public void setMedium_New_York(double Medium_New_York) {
        mMedium_New_York = Medium_New_York;
    }

    public double getMedium_Italian() {
        return mMedium_Italian;
    }

    public void setMedium_Italian(double Medium_Italian) {
        mMedium_Italian = Medium_Italian;
    }

    public double getSmall_Original() {
        return mSmall_Original;
    }

    public void setSmall_Original(double Small_Original) {
        mSmall_Original = Small_Original;
    }

    public double getLarge_New_York() {
        return mLarge_New_York;
    }

    public void setLarge_New_York(double Large_New_York) {
        mLarge_New_York = Large_New_York;
    }

    public double getLarge_Italian() {
        return mLarge_Italian;
    }

    public void setLarge_Italian(double Large_Italian) {
        mLarge_Italian = Large_Italian;
    }

    public double getMedium_Stuffed_Crust() {
        return mMedium_Stuffed_Crust;
    }

    public void setMedium_Stuffed_Crust(double Medium_Stuffed_Crust) {
        mMedium_Stuffed_Crust = Medium_Stuffed_Crust;
    }

    public double getLarge_Stuffed_Crust() {
        return mLarge_Stuffed_Crust;
    }

    public void setLarge_Stuffed_Crust(double Large_Stuffed_Crust) {
        mLarge_Stuffed_Crust = Large_Stuffed_Crust;
    }

    public double getMedium_Original() {
        return mMedium_Original;
    }

    public void setMedium_Original(double Medium_Original) {
        mMedium_Original = Medium_Original;
    }

    public double getLarge_Original() {
        return mLarge_Original;
    }

    public void setLarge_Original(double Large_Original) {
        mLarge_Original = Large_Original;
    }

    public double getExtra_Large_Original() {
        return mExtra_Large_Original;
    }

    public void setExtra_Large_Original(double Extra_Large_Original) {
        mExtra_Large_Original = Extra_Large_Original;
    }

    public double getSmall_Gluten_Free() {
        return mSmall_Gluten_Free;
    }

    public void setSmall_Gluten_Free(double Small_Gluten_Free) {
        mSmall_Gluten_Free = Small_Gluten_Free;
    }

    public double getPersonal_Original_Pan() {
        return mPersonal_Original_Pan;
    }

    public void setPersonal_Original_Pan(double Personal_Original_Pan) {
        mPersonal_Original_Pan = Personal_Original_Pan;
    }

    public double getMedium_Original_Pan() {
        return mMedium_Original_Pan;
    }

    public void setMedium_Original_Pan(double Medium_Original_Pan) {
        mMedium_Original_Pan = Medium_Original_Pan;
    }

    public double getLarge_Original_Pan() {
        return mLarge_Original_Pan;
    }

    public void setLarge_Original_Pan(double Large_Original_Pan) {
        mLarge_Original_Pan = Large_Original_Pan;
    }

    public double getMedium_Hand_Tossed() {
        return mMedium_Hand_Tossed;
    }

    public void setMedium_Hand_Tossed(double Medium_Hand_Tossed) {
        mMedium_Hand_Tossed = Medium_Hand_Tossed;
    }

    public double getLarge_Hand_Tossed() {
        return mLarge_Hand_Tossed;
    }

    public void setLarge_Hand_Tossed(double Large_Hand_Tossed) {
        mLarge_Hand_Tossed = Large_Hand_Tossed;
    }

    public double getQuality() {
        return mQuality;
    }

    public void setQuality(double mQuality) {
        this.mQuality = mQuality;
    }

    public List<String> getToppings()
    {
        List<String> toppings = new ArrayList<>();

        if(isPepperoni())
        {
            toppings.add("Pepperoni");
        }
        if(isItalian_sausage())
        {
            toppings.add("Italian_Sausage");
        }
        if(isMeatball())
        {
            toppings.add("Meatball");
        }
        if(isHam())
        {
            toppings.add("Ham");
        }
        if(isBacon())
        {
            toppings.add("Bacon");
        }
        if(isGrilled_chicken())
        {
            toppings.add("Grilled_Chicken");
        }
        if(isBeef())
        {
            toppings.add("Beef");
        }
        if(isPork())
        {
            toppings.add("Pork");
        }
        if(isMushrooms())
        {
            toppings.add("Mushrooms");
        }
        if(isRoasted_spinach())
        {
            toppings.add("Roasted_Spinach");
        }
        if(isRed_onions())
        {
            toppings.add("Red_Onions");
        }
        if(isBlack_olives())
        {
            toppings.add("Black_Olives");
        }
        if(isGreen_bell_peppers())
        {
            toppings.add("Green_Bell_Peppers");
        }
        if(isBanana_peppers())
        {
            toppings.add("Banana_Peppers");
        }
        if(isPineapple())
        {
            toppings.add("Pineapple");
        }
        if(isJalapeno())
        {
            toppings.add("Jalapeno");
        }
        if(isRoma_tomatoes())
        {
            toppings.add("Roma_Tomatoes");
        }
        if(isPhilly_steak())
        {
            toppings.add("Philly_Steak");
        }
        if(isSausage())
        {
            toppings.add("Sausage");
        }
        if(isAnchovies())
        {
            toppings.add("Anchovies");
        }
        if(isCanadian_bacon())
        {
            toppings.add("Canadian_Bacon");
        }
        if(isSalami())
        {
            toppings.add("Pepperoni");
        }
        if(isOnions())
        {
            toppings.add("Pepperoni");
        }
        if(isGreen_olives())
        {
            toppings.add("Green_Olives");
        }
        if(isLettuce())
        {
            toppings.add("Lettuce");
        }
        if(isPickles())
        {
            toppings.add("Pickles");
        }
        if(isFresh_spinach())
        {
            toppings.add("Fresh_Spinach");
        }
        return toppings;
    }

    public List<String> getStyles()
    {
        List<String> styles = new ArrayList<>();

        if(getPersonal_Thin_Crust() != 0.0)
        {
            styles.add("Personal_Thin_Crust");
        }
        if(getSmall_Thin_Crust() != 0.0)
        {
            styles.add("Small_Thin_Crust");
        }
        if(getMedium_Thin_Crust() != 0.0)
        {
            styles.add("Medium_Thin_Crust");
        }
        if(getLarge_Thin_Crust() != 0.0)
        {
            styles.add("Large_Thin_Crust");
        }
        if(getPersonal_New_York() != 0.0)
        {
            styles.add("Personal_New_York");
        }
        if(getSmall_New_York() != 0.0)
        {
            styles.add("Small_New_York");
        }
        if(getMedium_New_York() != 0.0)
        {
            styles.add("Medium_New_York");
        }
        if(getLarge_New_York() != 0.0)
        {
            styles.add("Large_New_York");
        }
        if(getMedium_Italian() != 0.0)
        {
            styles.add("Medium_Italian");
        }
        if(getLarge_Italian() != 0.0)
        {
            styles.add("Large_Italian");
        }
        if(getMedium_Stuffed_Crust() != 0.0)
        {
            styles.add("Medium_Stuffed_Crust");
        }
        if(getLarge_Stuffed_Crust() != 0.0)
        {
            styles.add("Large_Stuffed_Crust");
        }
        if(getSmall_Original() != 0.0)
        {
            styles.add("Small_Original");
        }
        if(getMedium_Original() != 0.0)
        {
            styles.add("Medium_Original");
        }
        if(getLarge_Original() != 0.0)
        {
            styles.add("Large_Original");
        }
        if(getExtra_Large_Original() != 0.0)
        {
            styles.add("Extra_Large_Original");
        }
        if(getSmall_Gluten_Free() != 0.0)
        {
            styles.add("Small_Gluten_Free");
        }
        if(getPersonal_Original_Pan() != 0.0)
        {
            styles.add("Personal_Original_Pan");
        }
        if(getMedium_Original_Pan() != 0.0)
        {
            styles.add("Medium_Original_Pan");
        }
        if(getLarge_Original_Pan() != 0.0)
        {
            styles.add("Large_Original_Pan");
        }
        if(getMedium_Hand_Tossed() != 0.0)
        {
            styles.add("Medium_Hand_Tossed");
        }
        if(getLarge_Hand_Tossed() != 0.0)
        {
            styles.add("Large_Hand_Tossed");
        }
        return styles;
    }
}
