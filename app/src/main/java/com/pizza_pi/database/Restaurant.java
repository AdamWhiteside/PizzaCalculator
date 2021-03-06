package com.pizza_pi.database;

import java.io.Serializable;
import java.lang.reflect.Array;
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

    private int mPersonal_Thin_Crust_Food_Units;
    private int mSmall_Thin_Crust_Food_Units;
    private int mMedium_Thin_Crust_Food_Units;
    private int mLarge_Thin_Crust_Food_Units;
    private int mPersonal_New_York_Food_Units;
    private int mSmall_New_York_Food_Units;
    private int mMedium_New_York_Food_Units;
    private int mLarge_New_York_Food_Units;
    private int mMedium_Italian_Food_Units;
    private int mLarge_Italian_Food_Units;
    private int mMedium_Stuffed_Crust_Food_Units;
    private int mLarge_Stuffed_Crust_Food_Units;
    private int mSmall_Original_Food_Units;
    private int mMedium_Original_Food_Units;
    private int mLarge_Original_Food_Units;
    private int mExtra_Large_Original_Food_Units;
    private int mSmall_Gluten_Free_Food_Units;
    private int mPersonal_Original_Pan_Food_Units;
    private int mMedium_Original_Pan_Food_Units;
    private int mLarge_Original_Pan_Food_Units;
    private int mMedium_Hand_Tossed_Food_Units;
    private int mLarge_Hand_Tossed_Food_Units;


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

        mPersonal_Thin_Crust_Food_Units = 0;
        mSmall_Thin_Crust_Food_Units = 0;
        mMedium_Thin_Crust_Food_Units = 0;
        mLarge_Thin_Crust_Food_Units = 0;
        mPersonal_New_York_Food_Units = 0;
        mSmall_New_York_Food_Units = 0;
        mMedium_New_York_Food_Units = 0;
        mLarge_New_York_Food_Units = 0;
        mMedium_Italian_Food_Units = 0;
        mLarge_Italian_Food_Units = 0;
        mMedium_Stuffed_Crust_Food_Units = 0;
        mLarge_Stuffed_Crust_Food_Units = 0;
        mSmall_Original_Food_Units = 0;
        mMedium_Original_Food_Units = 0;
        mLarge_Original_Food_Units = 0;
        mExtra_Large_Original_Food_Units = 0;
        mSmall_Gluten_Free_Food_Units = 0;
        mPersonal_Original_Pan_Food_Units = 0;
        mMedium_Original_Pan_Food_Units = 0;
        mLarge_Original_Pan_Food_Units = 0;
        mMedium_Hand_Tossed_Food_Units = 0;
        mLarge_Hand_Tossed_Food_Units = 0;


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

    public Restaurant(String Restaurant, Double properRadius, Double toppingPrice, double quality, int foodUnit, boolean pepperoni, boolean italianSausage,
                      boolean meatball, boolean ham, boolean bacon, boolean grilledChicken, boolean beef, boolean pork,
                      boolean mushrooms, boolean roastedSpinach, boolean redOnions, boolean blackOlives, boolean greenBellPeppers,
                      boolean bananaPeppers, boolean pineapple, boolean jalapeno, boolean romaTomatoes, boolean phillySteak, boolean sausage,
                      boolean anchovies, boolean canadianBacon, boolean salami, boolean onions, boolean greenOlives, boolean lettuce,
                      boolean pickles, boolean freshSpinach, double personalThinCrust, double smallThinCrust, double mediumThinCrust,
                      double largeThinCrust, double personalNewYork, double smallNewYork, double mediumNewYork, double largeNewYork,
                      double mediumItalian, double largeItalian, double mediumStuffedCrust, double largeStuffedCrust, double smallOriginal,
                      double mediumOriginal, double largeOriginal, double extraLargeOriginal, double smallGlutenFree,
                      double personalOriginalPan, double mediumOriginalPan, double largeOriginalPan, double mediumHandTossed,
                      double largeHandTossed, int Personal_Thin_Crust_Food_Units, int Small_Thin_Crust_Food_Units,
                      int Medium_Thin_Crust_Food_Units, int Large_Thin_Crust_Food_Units, int Personal_New_York_Food_Units,
                      int Small_New_York_Food_Units, int Medium_New_York_Food_Units, int Large_New_York_Food_Units,
                      int Medium_Italian_Food_Units, int Large_Italian_Food_Units, int Medium_Stuffed_Crust_Food_Units,
                      int Large_Stuffed_Crust_Food_Units, int Small_Original_Food_Units, int Medium_Original_Food_Units,
                      int Large_Original_Food_Units, int Extra_Large_Original_Food_Units, int Small_Gluten_Free_Food_Units,
                      int Personal_Original_Pan_Food_Units, int Medium_Original_Pan_Food_Units, int Large_Original_Pan_Food_Units,
                      int Medium_Hand_Tossed_Food_Units, int Large_Hand_Tossed_Food_Units

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

        mPersonal_Thin_Crust_Food_Units = Personal_Thin_Crust_Food_Units;
        mSmall_Thin_Crust_Food_Units = Small_Thin_Crust_Food_Units;
        mMedium_Thin_Crust_Food_Units = Medium_Thin_Crust_Food_Units;
        mLarge_Thin_Crust_Food_Units = Large_Thin_Crust_Food_Units;
        mPersonal_New_York_Food_Units = Personal_New_York_Food_Units;
        mSmall_New_York_Food_Units = Small_New_York_Food_Units;
        mMedium_New_York_Food_Units = Medium_New_York_Food_Units;
        mLarge_New_York_Food_Units = Large_New_York_Food_Units;
        mMedium_Italian_Food_Units = Medium_Italian_Food_Units;
        mLarge_Italian_Food_Units = Large_Italian_Food_Units;
        mMedium_Stuffed_Crust_Food_Units = Medium_Stuffed_Crust_Food_Units;
        mLarge_Stuffed_Crust_Food_Units = Large_Stuffed_Crust_Food_Units;
        mSmall_Original_Food_Units = Small_Original_Food_Units;
        mMedium_Original_Food_Units = Medium_Original_Food_Units;
        mLarge_Original_Food_Units = Large_Original_Food_Units;
        mExtra_Large_Original_Food_Units = Extra_Large_Original_Food_Units;
        mSmall_Gluten_Free_Food_Units = Small_Gluten_Free_Food_Units;
        mPersonal_Original_Pan_Food_Units = Personal_Original_Pan_Food_Units;
        mMedium_Original_Pan_Food_Units = Medium_Original_Pan_Food_Units;
        mLarge_Original_Pan_Food_Units = Large_Original_Pan_Food_Units;
        mMedium_Hand_Tossed_Food_Units = Medium_Hand_Tossed_Food_Units;
        mLarge_Hand_Tossed_Food_Units = Large_Hand_Tossed_Food_Units;


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

    public int getmPersonal_Thin_Crust_Food_Units() {
        return mPersonal_Thin_Crust_Food_Units;
    }

    public void setmPersonal_Thin_Crust_Food_Units(int mPersonal_Thin_Crust_Food_Units) {
        this.mPersonal_Thin_Crust_Food_Units = mPersonal_Thin_Crust_Food_Units;
    }

    public int getmSmall_Thin_Crust_Food_Units() {
        return mSmall_Thin_Crust_Food_Units;
    }

    public void setmSmall_Thin_Crust_Food_Units(int mSmall_Thin_Crust_Food_Units) {
        this.mSmall_Thin_Crust_Food_Units = mSmall_Thin_Crust_Food_Units;
    }

    public int getmMedium_Thin_Crust_Food_Units() {
        return mMedium_Thin_Crust_Food_Units;
    }

    public void setmMedium_Thin_Crust_Food_Units(int mMedium_Thin_Crust_Food_Units) {
        this.mMedium_Thin_Crust_Food_Units = mMedium_Thin_Crust_Food_Units;
    }

    public int getmLarge_Thin_Crust_Food_Units() {
        return mLarge_Thin_Crust_Food_Units;
    }

    public void setmLarge_Thin_Crust_Food_Units(int mLarge_Thin_Crust_Food_Units) {
        this.mLarge_Thin_Crust_Food_Units = mLarge_Thin_Crust_Food_Units;
    }

    public int getmPersonal_New_York_Food_Units() {
        return mPersonal_New_York_Food_Units;
    }

    public void setmPersonal_New_York_Food_Units(int mPersonal_New_York_Food_Units) {
        this.mPersonal_New_York_Food_Units = mPersonal_New_York_Food_Units;
    }

    public int getmSmall_New_York_Food_Units() {
        return mSmall_New_York_Food_Units;
    }

    public void setmSmall_New_York_Food_Units(int mSmall_New_York_Food_Units) {
        this.mSmall_New_York_Food_Units = mSmall_New_York_Food_Units;
    }

    public int getmMedium_New_York_Food_Units() {
        return mMedium_New_York_Food_Units;
    }

    public void setmMedium_New_York_Food_Units(int mMedium_New_York_Food_Units) {
        this.mMedium_New_York_Food_Units = mMedium_New_York_Food_Units;
    }

    public int getmLarge_New_York_Food_Units() {
        return mLarge_New_York_Food_Units;
    }

    public void setmLarge_New_York_Food_Units(int mLarge_New_York_Food_Units) {
        this.mLarge_New_York_Food_Units = mLarge_New_York_Food_Units;
    }

    public int getmMedium_Italian_Food_Units() {
        return mMedium_Italian_Food_Units;
    }

    public void setmMedium_Italian_Food_Units(int mMedium_Italian_Food_Units) {
        this.mMedium_Italian_Food_Units = mMedium_Italian_Food_Units;
    }

    public int getmLarge_Italian_Food_Units() {
        return mLarge_Italian_Food_Units;
    }

    public void setmLarge_Italian_Food_Units(int mLarge_Italian_Food_Units) {
        this.mLarge_Italian_Food_Units = mLarge_Italian_Food_Units;
    }

    public int getmMedium_Stuffed_Crust_Food_Units() {
        return mMedium_Stuffed_Crust_Food_Units;
    }

    public void setmMedium_Stuffed_Crust_Food_Units(int mMedium_Stuffed_Crust_Food_Units) {
        this.mMedium_Stuffed_Crust_Food_Units = mMedium_Stuffed_Crust_Food_Units;
    }

    public int getmLarge_Stuffed_Crust_Food_Units() {
        return mLarge_Stuffed_Crust_Food_Units;
    }

    public void setmLarge_Stuffed_Crust_Food_Units(int mLarge_Stuffed_Crust_Food_Units) {
        this.mLarge_Stuffed_Crust_Food_Units = mLarge_Stuffed_Crust_Food_Units;
    }

    public int getmSmall_Original_Food_Units() {
        return mSmall_Original_Food_Units;
    }

    public void setmSmall_Original_Food_Units(int mSmall_Original_Food_Units) {
        this.mSmall_Original_Food_Units = mSmall_Original_Food_Units;
    }

    public int getmMedium_Original_Food_Units() {
        return mMedium_Original_Food_Units;
    }

    public void setmMedium_Original_Food_Units(int mMedium_Original_Food_Units) {
        this.mMedium_Original_Food_Units = mMedium_Original_Food_Units;
    }

    public int getmLarge_Original_Food_Units() {
        return mLarge_Original_Food_Units;
    }

    public void setmLarge_Original_Food_Units(int mLarge_Original_Food_Units) {
        this.mLarge_Original_Food_Units = mLarge_Original_Food_Units;
    }

    public int getmExtra_Large_Original_Food_Units() {
        return mExtra_Large_Original_Food_Units;
    }

    public void setmExtra_Large_Original_Food_Units(int mExtra_Large_Original_Food_Units) {
        this.mExtra_Large_Original_Food_Units = mExtra_Large_Original_Food_Units;
    }

    public int getmSmall_Gluten_Free_Food_Units() {
        return mSmall_Gluten_Free_Food_Units;
    }

    public void setmSmall_Gluten_Free_Food_Units(int mSmall_Gluten_Free_Food_Units) {
        this.mSmall_Gluten_Free_Food_Units = mSmall_Gluten_Free_Food_Units;
    }

    public int getmPersonal_Original_Pan_Food_Units() {
        return mPersonal_Original_Pan_Food_Units;
    }

    public void setmPersonal_Original_Pan_Food_Units(int mPersonal_Original_Pan_Food_Units) {
        this.mPersonal_Original_Pan_Food_Units = mPersonal_Original_Pan_Food_Units;
    }

    public int getmMedium_Original_Pan_Food_Units() {
        return mMedium_Original_Pan_Food_Units;
    }

    public void setmMedium_Original_Pan_Food_Units(int mMedium_Original_Pan_Food_Units) {
        this.mMedium_Original_Pan_Food_Units = mMedium_Original_Pan_Food_Units;
    }

    public int getmLarge_Original_Pan_Food_Units() {
        return mLarge_Original_Pan_Food_Units;
    }

    public void setmLarge_Original_Pan_Food_Units(int mLarge_Original_Pan_Food_Units) {
        this.mLarge_Original_Pan_Food_Units = mLarge_Original_Pan_Food_Units;
    }

    public int getmMedium_Hand_Tossed_Food_Units() {
        return mMedium_Hand_Tossed_Food_Units;
    }

    public void setmMedium_Hand_Tossed_Food_Units(int mMedium_Hand_Tossed_Food_Units) {
        this.mMedium_Hand_Tossed_Food_Units = mMedium_Hand_Tossed_Food_Units;
    }

    public int getmLarge_Hand_Tossed_Food_Units() {
        return mLarge_Hand_Tossed_Food_Units;
    }

    public void setmLarge_Hand_Tossed_Food_Units(int mLarge_Hand_Tossed_Food_Units) {
        this.mLarge_Hand_Tossed_Food_Units = mLarge_Hand_Tossed_Food_Units;
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

    /**
     * Finds and gets all the styles and sizes that a restaurant serves
     * @return List of strings that are the styles and sizes
     */
    public List<String> getStylesAndSizes()
    {
        List<String> StylesAndSizes = new ArrayList<>();

        if(getPersonal_Thin_Crust() != 0.0)
        {
            StylesAndSizes.add("Personal_Thin_Crust");
        }
        if(getSmall_Thin_Crust() != 0.0)
        {
            StylesAndSizes.add("Small_Thin_Crust");
        }
        if(getMedium_Thin_Crust() != 0.0)
        {
            StylesAndSizes.add("Medium_Thin_Crust");
        }
        if(getLarge_Thin_Crust() != 0.0)
        {
            StylesAndSizes.add("Large_Thin_Crust");
        }
        if(getPersonal_New_York() != 0.0)
        {
            StylesAndSizes.add("Personal_New_York");
        }
        if(getSmall_New_York() != 0.0)
        {
            StylesAndSizes.add("Small_New_York");
        }
        if(getMedium_New_York() != 0.0)
        {
            StylesAndSizes.add("Medium_New_York");
        }
        if(getLarge_New_York() != 0.0)
        {
            StylesAndSizes.add("Large_New_York");
        }
        if(getMedium_Italian() != 0.0)
        {
            StylesAndSizes.add("Medium_Italian");
        }
        if(getLarge_Italian() != 0.0)
        {
            StylesAndSizes.add("Large_Italian");
        }
        if(getMedium_Stuffed_Crust() != 0.0)
        {
            StylesAndSizes.add("Medium_Stuffed_Crust");
        }
        if(getLarge_Stuffed_Crust() != 0.0)
        {
            StylesAndSizes.add("Large_Stuffed_Crust");
        }
        if(getSmall_Original() != 0.0)
        {
            StylesAndSizes.add("Small_Original");
        }
        if(getMedium_Original() != 0.0)
        {
            StylesAndSizes.add("Medium_Original");
        }
        if(getLarge_Original() != 0.0)
        {
            StylesAndSizes.add("Large_Original");
        }
        if(getExtra_Large_Original() != 0.0)
        {
            StylesAndSizes.add("Extra_Large_Original");
        }
        if(getSmall_Gluten_Free() != 0.0)
        {
            StylesAndSizes.add("Small_Gluten_Free");
        }
        if(getPersonal_Original_Pan() != 0.0)
        {
            StylesAndSizes.add("Personal_Original_Pan");
        }
        if(getMedium_Original_Pan() != 0.0)
        {
            StylesAndSizes.add("Medium_Original_Pan");
        }
        if(getLarge_Original_Pan() != 0.0)
        {
            StylesAndSizes.add("Large_Original_Pan");
        }
        if(getMedium_Hand_Tossed() != 0.0)
        {
            StylesAndSizes.add("Medium_Hand_Tossed");
        }
        if(getLarge_Hand_Tossed() != 0.0)
        {
            StylesAndSizes.add("Large_Hand_Tossed");
        }
        return StylesAndSizes;
    }

    /**
     * Returns all the styles that a restaurant has
     * @return a list of strings of styles
     */
    public List<String> getStyles()
    {
        List<String> styles = new ArrayList<>();

        if(getPersonal_Thin_Crust() != 0.0 || getSmall_Thin_Crust() != 0.0 ||
                getMedium_Thin_Crust() != 0.0 || getLarge_Thin_Crust() != 0.0)
        {
            styles.add("Thin_Crust");
        }
        if(getPersonal_New_York() != 0.0 || getSmall_New_York() != 0.0 ||
                getMedium_New_York() != 0.0 || getLarge_New_York() != 0.0)
        {
            styles.add("New_York");
        }
        if(getMedium_Italian() != 0.0 || getLarge_Italian() != 0.0)
        {
            styles.add("Italian");
        }
        if(getMedium_Stuffed_Crust() != 0.0 || getLarge_Stuffed_Crust() != 0.0)
        {
            styles.add("Stuffed_Crust");
        }
        if(getSmall_Original() != 0.0 || getMedium_Original() != 0.0 ||
                getLarge_Original() != 0.0 || getExtra_Large_Original() != 0.0)
        {
            styles.add("Original");
        }
        if(getSmall_Gluten_Free() != 0.0)
        {
            styles.add("Gluten_Free");
        }
        if(getPersonal_Original_Pan() != 0.0 || getMedium_Original_Pan() != 0.0 ||
                getLarge_Original_Pan() != 0.0)
        {
            styles.add("Original_Pan");
        }
        if(getMedium_Hand_Tossed() != 0.0 || getLarge_Hand_Tossed() != 0.0)
        {
            styles.add("Hand_Tossed");
        }
        return styles;
    }

    /**
     * Given a style of pizza returns all available sizes of that pizza.
     * @param style
     * @return
     */
    public List<String> getSizes(String style)
    {
        List<String> sizes = new ArrayList<>();
        List<String> stylesAndSizes = new ArrayList<>();
        stylesAndSizes = this.getStylesAndSizes();
        if(style.equalsIgnoreCase("Thin_Crust"))
        {
            if(stylesAndSizes.contains("Personal_Thin_Crust"))
            {
                sizes.add("Personal");
            }
            if(stylesAndSizes.contains("Small_Thin_Crust"))
            {
                sizes.add("Small");
            }
            if(stylesAndSizes.contains("Medium_Thin_Crust"))
            {
                sizes.add("Medium");
            }
            if(stylesAndSizes.contains("Large_Thin_Crust"))
            {
                sizes.add("Large");
            }
        }
        if(style.equalsIgnoreCase("New_York"))
        {
            if(stylesAndSizes.contains("Personal_New_York"))
            {
                sizes.add("Personal");
            }
            if(stylesAndSizes.contains("Small_New_York"))
            {
                sizes.add("Small");
            }
            if(stylesAndSizes.contains("Medium_New_York"))
            {
                sizes.add("Medium");
            }
            if(stylesAndSizes.contains("Large_New_York"))
            {
                sizes.add("Large");
            }
        }
        if(style.equalsIgnoreCase("Italian"))
        {
            if(stylesAndSizes.contains("Medium_Italian"))
            {
                sizes.add("Medium");
            }
            if(stylesAndSizes.contains("Large_Italian"))
            {
                sizes.add("Large");
            }
        }
        if(style.equalsIgnoreCase( "Stuffed_Crust"))
        {
            if(stylesAndSizes.contains("Medium_Stuffed_Crust"))
            {
                sizes.add("Medium");
            }
            if(stylesAndSizes.contains("Large_Stuffed_Crust"))
            {
                sizes.add("Large");
            }
        }
        if(style.equalsIgnoreCase("Original"))
        {
            if(stylesAndSizes.contains("Small_Original"))
            {
                sizes.add("Small");
            }
            if(stylesAndSizes.contains("Medium_Original"))
            {
                sizes.add("Medium");
            }
            if(stylesAndSizes.contains("Large_Original"))
            {
                sizes.add("Large");
            }
            if(stylesAndSizes.contains("Extra_Large_Original"))
            {
                sizes.add("Extra_Large");
            }
        }
        if(style.equalsIgnoreCase("Gluten_Free"))
        {
            if(stylesAndSizes.contains("Small_Gluten_Free"))
            {
                sizes.add("Small");
            }
        }
        if(style.equalsIgnoreCase("Original_Pan"))
        {
            if(stylesAndSizes.contains("Personal_Original_Pan"))
            {
                sizes.add("Personal");
            }
            if(stylesAndSizes.contains("Medium_Original_Pan"))
            {
                sizes.add("Medium");
            }
            if(stylesAndSizes.contains("Large_Original_Pan"))
            {
                sizes.add("Large");
            }
        }
        if(style.equalsIgnoreCase( "Hand_Tossed"))
        {
            if(stylesAndSizes.contains("Medium_Hand_Tossed"))
            {
                sizes.add("Medium");
            }
            if(stylesAndSizes.contains("Large_Hand_Tossed"))
            {
                sizes.add("Large");
            }
        }
        return sizes;
    }

    /**
     * Given a string, the style and size of a pizza, returns a double, the price
     * @param styleAndSize the requested features of a pizza
     * @return a double that represents the price
     */
    public double getPrice(String styleAndSize)
    {
        double price = 0.0;
        if(styleAndSize.equalsIgnoreCase("Personal_Thin_Crust"))
        {
            price = getPersonal_Thin_Crust();
        }
        if(styleAndSize.equalsIgnoreCase("Small_Thin_Crust"))
        {
            price = getSmall_Thin_Crust();
        }
        if(styleAndSize.equalsIgnoreCase("Medium_Thin_Crust"))
        {
            price = getMedium_Thin_Crust();
        }
        if(styleAndSize.equalsIgnoreCase("Large_Thin_Crust"))
        {
            price = getLarge_Thin_Crust();
        }
        if(styleAndSize.equalsIgnoreCase("Personal_New_York"))
        {
            price = getPersonal_New_York();
        }
        if(styleAndSize.equalsIgnoreCase("Small_New_York"))
        {
            price = getSmall_New_York();
        }
        if(styleAndSize.equalsIgnoreCase("Medium_New_York"))
        {
            price = getMedium_New_York();
        }
        if(styleAndSize.equalsIgnoreCase("Large_New_York"))
        {
            price = getLarge_New_York();
        }
        if(styleAndSize.equalsIgnoreCase("Medium_Italian"))
        {
            price = getMedium_Italian();
        }
        if(styleAndSize.equalsIgnoreCase("Large_Italian"))
        {
            price = getLarge_Italian();
        }
        if(styleAndSize.equalsIgnoreCase("Medium_Stuffed_Crust"))
        {
            price = getMedium_Stuffed_Crust();
        }
        if(styleAndSize.equalsIgnoreCase("Large_Stuffed_Crust"))
        {
            price = getLarge_Stuffed_Crust();
        }
        if(styleAndSize.equalsIgnoreCase("Small_Original"))
        {
            price = getSmall_Original();
        }
        if(styleAndSize.equalsIgnoreCase("Medium_Original"))
        {
            price = getMedium_Original();
        }
        if(styleAndSize.equalsIgnoreCase("Large_Original"))
        {
            price = getLarge_Original();
        }
        if(styleAndSize.equalsIgnoreCase("Extra_Large_Original"))
        {
            price = getExtra_Large_Original();
        }
        if(styleAndSize.equalsIgnoreCase("Small_Gluten_Free"))
        {
            price = getSmall_Gluten_Free();
        }
        if(styleAndSize.equalsIgnoreCase("Personal_Original_Pan"))
        {
            price = getPersonal_Original_Pan();
        }
        if(styleAndSize.equalsIgnoreCase("Medium_Original_Pan"))
        {
            price = getMedium_Original_Pan();
        }
        if(styleAndSize.equalsIgnoreCase("Large_Original_Pan"))
        {
            price = getLarge_Original_Pan();
        }
        if(styleAndSize.equalsIgnoreCase("Medium_Hand_Tossed"))
        {
            price = getMedium_Hand_Tossed();
        }
        if(styleAndSize.equalsIgnoreCase("Large_Hand_Tossed"))
        {
            price = getLarge_Hand_Tossed();
        }

        return price;
    }

    /**
     * Given a string, the style and size of a pizza, returns an int, the food_units
     * @param styleAndSize the requested features of a pizza
     * @return a int that represents the food_units
     */
    public int getFood_Units(String styleAndSize)
    {
        int food_units = 0;
        if(styleAndSize.equalsIgnoreCase("Personal_Thin_Crust"))
        {
            food_units = getmPersonal_Thin_Crust_Food_Units();
        }
        if(styleAndSize.equalsIgnoreCase("Small_Thin_Crust"))
        {
            food_units = getmSmall_Thin_Crust_Food_Units();
        }
        if(styleAndSize.equalsIgnoreCase("Medium_Thin_Crust"))
        {
            food_units = getmMedium_Thin_Crust_Food_Units();
        }
        if(styleAndSize.equalsIgnoreCase("Large_Thin_Crust"))
        {
            food_units = getmLarge_Thin_Crust_Food_Units();
        }
        if(styleAndSize.equalsIgnoreCase("Personal_New_York"))
        {
            food_units = getmPersonal_New_York_Food_Units();
        }
        if(styleAndSize.equalsIgnoreCase("Small_New_York"))
        {
            food_units = getmSmall_New_York_Food_Units();
        }
        if(styleAndSize.equalsIgnoreCase("Medium_New_York"))
        {
            food_units = getmMedium_New_York_Food_Units();
        }
        if(styleAndSize.equalsIgnoreCase("Large_New_York"))
        {
            food_units = getmLarge_New_York_Food_Units();
        }
        if(styleAndSize.equalsIgnoreCase("Medium_Italian"))
        {
            food_units = getmMedium_Italian_Food_Units();
        }
        if(styleAndSize.equalsIgnoreCase("Large_Italian"))
        {
            food_units = getmLarge_Italian_Food_Units();
        }
        if(styleAndSize.equalsIgnoreCase("Medium_Stuffed_Crust"))
        {
            food_units = getmMedium_Stuffed_Crust_Food_Units();
        }
        if(styleAndSize.equalsIgnoreCase("Large_Stuffed_Crust"))
        {
            food_units = getmLarge_Stuffed_Crust_Food_Units();
        }
        if(styleAndSize.equalsIgnoreCase("Small_Original"))
        {
            food_units = getmSmall_Original_Food_Units();
        }
        if(styleAndSize.equalsIgnoreCase("Medium_Original"))
        {
            food_units = getmMedium_Original_Food_Units();
        }
        if(styleAndSize.equalsIgnoreCase("Large_Original"))
        {
            food_units = getmLarge_Original_Food_Units();
        }
        if(styleAndSize.equalsIgnoreCase("Extra_Large_Original"))
        {
            food_units = getmExtra_Large_Original_Food_Units();
        }
        if(styleAndSize.equalsIgnoreCase("Small_Gluten_Free"))
        {
            food_units = getmSmall_Gluten_Free_Food_Units();
        }
        if(styleAndSize.equalsIgnoreCase("Personal_Original_Pan"))
        {
            food_units = getmPersonal_Original_Pan_Food_Units();
        }
        if(styleAndSize.equalsIgnoreCase("Medium_Original_Pan"))
        {
            food_units = getmMedium_Original_Pan_Food_Units();
        }
        if(styleAndSize.equalsIgnoreCase("Large_Original_Pan"))
        {
            food_units = getmLarge_Original_Pan_Food_Units();
        }
        if(styleAndSize.equalsIgnoreCase("Medium_Hand_Tossed"))
        {
            food_units = getmMedium_Hand_Tossed_Food_Units();
        }
        if(styleAndSize.equalsIgnoreCase("Large_Hand_Tossed"))
        {
            food_units = getmLarge_Hand_Tossed_Food_Units();
        }

        return food_units;
    }



}
