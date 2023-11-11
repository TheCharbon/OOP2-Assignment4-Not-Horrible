package com.champlain.oop2.oop2assignement4;

public class Animal {
    private String aName;
    public void setName(String pName){
        this.aName = pName;
    }
    public String getName(){
        return this.aName;
    }

    private double aWeight;
    public void setWeight(double pWeight){
        this.aWeight = pWeight;
    }
    public double getWeight(){
        return this.aWeight;
    }

    private int aAge;
    public void setAge(int pAge){
        this.aAge = pAge;
    }
    public int getAge(){
        return this.aAge;
    }
    public Animal(String pName, double pWeight, int pAge){
        this.setName(pName);
        this.setWeight(pWeight);
        this.setAge(pAge);
    }
}
