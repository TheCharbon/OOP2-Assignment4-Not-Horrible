package com.champlain.oop2.oop2assignement4;

import java.util.ArrayList;
import java.util.List;

public class CompositeAnimal implements AnimalCollection{
    private String aName;
    List<AnimalCollection> animalCollections = new ArrayList<AnimalCollection>();

    public void addAnimalCollection(AnimalCollection pAnimalCollection) {
        this.animalCollections.add(pAnimalCollection);
    }

    public void removeAnimalCollection(AnimalCollection pAnimalCollection) {
        this.animalCollections.remove(pAnimalCollection);
    }

    @Override
    public String showAnimals() {
        return null;
    }

    @Override
    public void setName(String pName) {
        this.aName = pName;
    }

    @Override
    public String getName() {
        return this.aName;
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public List<Animal> getAnimals() {
        List<Animal> allAnimals = new ArrayList<>();
        for (AnimalCollection animalGroup : animalCollections) {
            allAnimals.addAll(animalGroup.getAnimals());
        }
        return allAnimals;
    }
}
