package com.champlain.oop2.oop2assignement4;

import java.util.List;

public interface AnimalCollection {
    String showAnimals();
    void setName(String pName);
    String getName();
    List<Animal> getAnimals();

    void addAnimal(Animal newAnimal);

}

