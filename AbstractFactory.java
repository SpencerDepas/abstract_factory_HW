package com.clearfaun.algorythems;

/**
 * Created by SpencerDepas on 4/2/16.
 */
public abstract class AbstractFactory {
    abstract Food getFood(String food);
    abstract Vitamins getVitamins(String vitamins) ;
}
