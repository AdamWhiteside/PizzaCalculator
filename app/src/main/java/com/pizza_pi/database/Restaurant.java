package com.pizza_pi.database;

import java.io.Serializable;
import java.util.UUID;

public class Restaurant implements Serializable
{
    private UUID mId;
    private String mRestaurant;
    private String mStyle;
    private double mProperRadius;
    private double mToppingPrice;
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
        mStyle = "";
        mProperRadius = 0.0;
        mToppingPrice = 0.0;
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

    public Restaurant(String Restaurant, String style, Double properRadius, Double toppingPrice, boolean pepperoni, boolean italianSausage,
                 boolean meatball, boolean ham, boolean bacon, boolean grilledChicken, boolean beef, boolean pork,
                 boolean mushrooms, boolean roastedSpinach, boolean redOnions, boolean blackOlives, boolean greenBellPeppers,
                 boolean bananaPeppers, boolean pineapple, boolean jalapeno, boolean romaTomatoes,
                 boolean phillySteak, boolean sausage, boolean anchovies, boolean canadianBacon, boolean salami,
                 boolean onions, boolean greenOlives, boolean lettuce, boolean pickles, boolean freshSpinach
    )
    {
        mId = UUID.randomUUID();
        mRestaurant = Restaurant;
        mStyle = style;
        mProperRadius = properRadius;
        mToppingPrice = toppingPrice;
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

    public String getStyle() {
        return mStyle;
    }

    public void setStyle(String style) {
        mStyle = style;
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


}
