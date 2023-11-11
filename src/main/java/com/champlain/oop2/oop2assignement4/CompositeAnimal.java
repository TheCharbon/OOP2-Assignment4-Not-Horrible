package com.champlain.oop2.oop2assignement4;

import java.util.ArrayList;
import java.util.List;

public class CompositeAnimal implements AnimalCollection{
    private String aName;
    private List<AnimalCollection> AnimalCollections;
    List<AnimalCollection> animalCollections = new ArrayList<>(AnimalCollections);

    public CompositeAnimal(String pName, List<AnimalCollection> pAnimalCollections) {
        this.aName = pName;
        this.AnimalCollections = pAnimalCollections;
    }

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
}
