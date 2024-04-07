package org.neirology;

import java.util.ArrayList;

public class ShowAllAnimals {

    public ShowAllAnimals() {
    }

    public void showAllAnimals(ArrayList<Animals> animalsList) {

        System.out.println();
        System.out.println("+++++++ Журнал домашних животных +++++++");
        for (Animals animals : animalsList) {
            System.out.println(animals);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
    }
}
