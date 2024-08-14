package com.home.project.model.clinic;
import com.home.project.model.animals.Animal;

import java.util.ArrayList;

public class Client extends Person {

    private ArrayList<Animal> animals;
    private ArrayList<HistoryClient> historyVisit;
    public ArrayList<Animal> getAnimals() {return animals;}
    public Client (String name, String address, int age)
    {super (name, address, age);}
    public void setAnimals(ArrayList<Animal> animals) {this.animals = animals;}
    public void setPrintAnimalName(String printAnimalName){}
    public void getPrintAnimalName() {
        for (Animal aN : animals) { System.out.println(aN.getAnimalName());}}
    public ArrayList <HistoryClient> historyVisits() {
        return historyVisit;}
    public void setHistoryVisit(ArrayList<HistoryClient> historyVisit) {
        this.historyVisit = historyVisit;}

    public String toString(){
        return "Client: " + getName() + ", " + getAge()+ ", " + getAddress() + getAnimals() + historyVisit;}
    @Override
    public boolean equals(Object c) {
        if (this == c) return true;
        if ((c == null || getClass() != c.getClass())) return false;
        Client that = (Client) c;
        if (getName() != that.getName()) return false;
        if (getAge() != that.getAge()) return false;
        if (getAddress() != that.getAddress()) return false;
        return getName().equals(that.getName());}
    @Override
    public int hashCode() {
        int result = getName() == null ? 0 : getName().hashCode();
        int result1 = getAddress() == null ? 0 : getAddress().hashCode();
        result = result + result1 + getAge();
        return result;}
    private static void card(Object aObject){
        System.out.println(String.valueOf(aObject));}}



