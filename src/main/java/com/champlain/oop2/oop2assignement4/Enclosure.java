package com.champlain.oop2.oop2assignement4;

import java.util.ArrayList;
import java.util.List;

public class Enclosure implements AnimalCollection{
    private String aName;

    public final List<Animal> aAnimals = new ArrayList<Animal>();

    @Override
    public String showAnimals() {
        StringBuilder allAnimals = new StringBuilder();
        for (Animal animal : aAnimals) {
            allAnimals.append(animal.toString());
        }
        return allAnimals.toString();
    }

    @Override
    public void setName(String pName) {
        aName = pName;
    }

    @Override
    public String getName() {
        return this.aName;
    }
}