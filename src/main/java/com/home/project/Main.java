package com.home.project;

import com.home.project.model.animals.Animal;
import com.home.project.model.animals.Cat;
import com.home.project.model.animals.Dog;
import com.home.project.model.animals.Ill;
import com.home.project.model.clinic.Client;
import com.home.project.model.clinic.Clinic;
import com.home.project.model.clinic.HistoryClient;
import com.home.project.utils.IdGenerator;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
public static void main(String[] args) {

Animal cat1 = new Cat("tom", 6);
Animal cat2 = new Cat("nom", 8);
Animal cat3 = new Cat("pot", 5);
Animal dog1 = new Dog("not", 12);
Animal dog2 = new Dog("ter", 16);
Animal dog3 = new Dog("kol", 7);

ArrayList<Animal> o1 = new ArrayList<>(Arrays.asList(cat1, dog1));
ArrayList<Animal> o2 = new ArrayList<>(Arrays.asList(cat2, dog2));
ArrayList<Animal> o3 = new ArrayList<>(Arrays.asList(dog3));
 ArrayList<Animal> o4 = new ArrayList<>(Arrays.asList(cat3));

Client c1 = new Client("Rik", "gomel", 25);
Client c2 = new Client("Rok", "gomel", 36);
Client c3 = new Client("Nona", "gomel", 45);
Client c4 = new Client("Dons", "gomel", 85);
Client c5 = new Client("hfhf", "gomel", 46);
Client c6 = new Client("hfhf", "gomel", 46);

c1.setAnimals(o1);
c2.setAnimals(o2);
c3.setAnimals(o3);
c4.setAnimals(o4);

System.out.println("name: " + c1.getName() + " id: " + c1.getId());
System.out.println("name: " + c2.getName() + " id: " + c2.getId());
System.out.println("name: " + c3.getName() + " id: " + c3.getId());
System.out.println("name: " + c4.getName() + " id: " + c4.getId());

System.out.println(IdGenerator.generateId());
System.out.println(IdGenerator.generateId());

ArrayList<Client> basa = new ArrayList<>(Arrays.asList(c1, c2, c3, c4));
for (Client c : basa) {
    System.out.println("clietn name: " + c.getName() + " , " + "client animal name: ");
    c.getPrintAnimalName();
    System.out.println(c);

    Clinic clinic = new Clinic();
    clinic.toWork();


    System.out.println();
    System.out.println(cat1.getAnimalName() != null ? cat1.getAnimalName() : cat1.getIll().getNameIll());

    HistoryClient h1 = new HistoryClient("01 may 2023", "ticks", "hfhhfg", 25.5);
    HistoryClient h2 = new HistoryClient("02 september 2024", "lechen", "jkfkjh", 26.9);

    ArrayList<HistoryClient> hC1 = new ArrayList<>(Arrays.asList(h1, h2));
    c1.setHistoryVisit(hC1);
    System.out.println(c1);

    HistoryClient h3 = new HistoryClient("03 mart 2024", "vomiting", "hgbjhg", 30.5);
    ArrayList<HistoryClient> hC3 = new ArrayList<>(Arrays.asList(h3));

    Client c8 = new Client(",bmlkn", "jnkjn;j," , 26);


    clinic.registration(c1);

}}}


