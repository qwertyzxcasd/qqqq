package com.company;

public class Main {

    public static void main(String[] args) {
        Hero[] Heroes = {new Magic(), new Medic(), new Warrior()};
        for (int i = 0; i < Heroes.length; i++) {
            System.out.println(Heroes[i].applySuperAbility());


        }
        System.out.println(new Medic().increaseExperience());
    }

}
