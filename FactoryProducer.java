package com.clearfaun.algorythems;

/**
 * Created by SpencerDepas on 4/2/16.
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){

        if(choice.equalsIgnoreCase("vitamin")){
            return new VitaminsFactory();

        }else if(choice.equalsIgnoreCase("food")){
            return new FoodFactory();
        }

        return null;
    }
}