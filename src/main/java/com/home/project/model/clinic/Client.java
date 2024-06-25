package com.home.project.model.clinic;
import com.home.project.model.animals.Animal;

import java.util.ArrayList;

public class Client extends Person {

    private ArrayList<Animal> animals;
    public ArrayList<Animal> getAnimals() {return animals;}
    public void setAnimals(ArrayList<Animal> animals) {this.animals = animals;}
    public Client(String name, String address, int age) {super(name, address, age);}
    public void setPrintAnimalName(String printAnimalName) {}
    public void getPrintAnimalName() {
        for (Animal aN : animals) {
            System.out.println(aN.getAnimalName());
        }
    }

}



