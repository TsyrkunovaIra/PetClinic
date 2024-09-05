package com.home.project.model.clinic;
import com.home.project.model.animals.Animal;

import java.util.ArrayList;

public class Client extends Person {
    private ArrayList<Animal> animals;
    private ArrayList<HistoryClient> historyVisits;
    private Animal animal;
    public ArrayList<Animal> getAnimals() {return animals;}
    public Client (String name, String address, int age)
    {super (name, address, age);}
    public void setAnimals(ArrayList<Animal> animals) {this.animals = animals;}

    public ArrayList<HistoryClient> getHistoryVisits() {
        return historyVisits;
    }

    public ArrayList <HistoryClient> historyVisits() {return historyVisits;}
    public void setHistoryVisit(ArrayList<HistoryClient> historyVisits) {this.historyVisits = historyVisits;}
    public Animal getAnimal() {return animal;}
    public void setAnimal(Animal animal) {this.animal = animal;}
    public void getPrintAnimalName() {
        for (Animal aN : animals) { System.out.println(aN.getAnimalName());}}
    public String toString(){
        return "Client: " + getName() + ", " + getAge()+ ", " + getAddress() + getAnimals() + historyVisits;}
    @Override
    public boolean equals(Object p) { return super.equals(p);}
    @Override
    public int hashCode() {
        return super.hashCode();}
}



