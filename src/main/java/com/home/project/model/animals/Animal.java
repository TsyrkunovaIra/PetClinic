package com.home.project.model.animals;

import java.util.ArrayList;

public abstract class Animal {
    private ArrayList<Animal> animals;
    private String animalName;
    private int animalAge;
    private Ill ill;
    public Animal (String animalName, int animalAge){
        this.animalAge = animalAge;
        this.animalName = animalName;}
    public Ill getIll(){return ill;}
    public int getAnimalAge() {return animalAge;}
    public String getAnimalName() {return animalName;}
    public void setAnimalAge(int animalAge) {this.animalAge = animalAge;}
    public void setAnimalName(String animalName) {this.animalName = animalName;}
    public String toString(){
        return " animal name: "+ animalName + ", " + " age: " + animalAge + " " + ill;
    }

}
