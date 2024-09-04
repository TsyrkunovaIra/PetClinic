package com.home.project;

import com.home.project.model.animals.Animal;
import com.home.project.model.animals.Cat;
import com.home.project.model.clinic.Client;
import com.home.project.model.clinic.Clinic;

import java.util.ArrayList;
import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        Animal cat9 = new Cat("knhkn",  12);
        ArrayList<Animal> a1 = new ArrayList<>();
        a1.add(cat9);
        Client c1 = new Client("Rik", "gomel", 25);
        c1.setAnimals(a1);
        Clinic clinic = new Clinic();
        clinic.registration(c1);



    }
}
