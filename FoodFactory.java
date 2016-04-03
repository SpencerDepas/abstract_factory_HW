package com.clearfaun.algorythems;

/**
 * Created by SpencerDepas on 4/2/16.
 */
public class FoodFactory extends AbstractFactory{


    @Override
    Food getFood(String food) {

        if(food == null){
            return null;
        }

        if(food.equalsIgnoreCase("corn")){
            return new Corn();

        }else if(food.equalsIgnoreCase("fruit")){
            return new Fruit();

        }

        return null;
    }

    @Override
    Vitamins getVitamins(String vitamins) {
        return null;
    }
}
