package com.clearfaun.algorythems;

public class Main {

    public static void main(String[] args) {
        // write your code here


        //As I have two sorts of pigs they need to be treated difrently
        //I must feed them dirent food and on occasion
        //i must suplement their food with vitimens


        //I have a factory capable of making all
        //that I need
        //all I need to do is specfy which factory I want
        //since my red pig needs vitamins today lets get some vitamins
        AbstractFactory abstractFactory = FactoryProducer.getFactory("vitamin");

        //after we have a vitamin factory we can request specific vitimens for
        //our japanes red pig
        //our red pigs need extra vitamin c
        Vitamins vitaminC = abstractFactory.getVitamins("vitaminc");

        //here vitamin c is ingested but we could also select any vitimen
        vitaminC.ingestVitiments(); //output vitimin c will be consumed
        //output vitimin c will be consumed

        //now we need to feed our red pig
        abstractFactory = FactoryProducer.getFactory("food");

        //our red pig eats corn
        //the factory returns the corn type of food
        //it could also return fruit or
        //my favorite chocolate
        Food food = abstractFactory.getFood("corn");


        //lets feed our red pigs
        food.feed();  //output you will be fed corn





        System.out.println();



        abstractFactory = FactoryProducer.getFactory("vitamin");

        Vitamins vitaminB12 = abstractFactory.getVitamins("vitaminb12");

        vitaminB12.ingestVitiments();//output vitimin b 12 will be consumed

        abstractFactory = FactoryProducer.getFactory("food");

        food = abstractFactory.getFood("fruit"); //output you will be fed fruit

        food.feed();

    }
}
