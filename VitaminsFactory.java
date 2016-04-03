package com.clearfaun.algorythems;

/**
 * Created by SpencerDepas on 4/2/16.
 */
public class VitaminsFactory extends AbstractFactory {
    @Override
    Food getFood(String food) {
        return null;
    }

    @Override
    Vitamins getVitamins(String vitamins) {
        if(vitamins == null){
            return null;
        }

        if(vitamins.equalsIgnoreCase("vitaminb12")){
            return new Vitamins_B12();

        }else if(vitamins.equalsIgnoreCase("vitaminc")){
            return new Vitamins_C();

        }

        return null;
    }
}
