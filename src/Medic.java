package com.company;


public class Medic extends Hero {
    private int healPoints = 10;

    public String increaseExperience(){
        return applySuperAbility() +" " +healPoints + "%";
    }
    @Override
    public String applySuperAbility() {
        return "medic heal magic";
    }

}
