package com.home.project.model.clinic;
import com.home.project.model.animals.Animal;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.*;

public class Clinic {
    private ArrayList<Client> basa;
    private long id;
    private ArrayList<HistoryClient> historyVisits;
    private Client client;
    private Animal animal;
    private ArrayList<Animal> animals;
    private DayOfWeek day;
    private ArrayList<VisitController> card;
    public long getId() {return id;}
    public void setId(long id) {this.id = id;}
    public ArrayList<Client> getBasa() {return basa;}
    public void setBasa(ArrayList<Client> basa) {this.basa = basa;}
    public ArrayList<HistoryClient> getHistoryVisits() {return historyVisits;}
    public void setHistoryVisits(ArrayList<HistoryClient> historyVisits) {this.historyVisits = historyVisits;}
    public Client getClient() {return client;}
    public void setClient(Client client) {this.client = client;}
    public Animal getAnimal() {return animal;}
    public void setAnimal(Animal animal) {this.animal = animal;}
    public ArrayList<Animal> getAnimals() {return animals;}
    public void setAnimals(ArrayList<Animal> animals) {this.animals = animals;}
    public DayOfWeek getDay() {return day;}
    public void setDay(DayOfWeek day) {this.day = day;}
    public ArrayList<VisitController> getCard() {return card;}
    public void setCard(ArrayList<VisitController> card) {this.card = card;}
    public void toWork(){
        Schedule[] values = Schedule.values();
        for (Schedule day : values){
        if(LocalDateTime.now().getDayOfWeek().name().equals(day.name()))
        System.out.println();}
    }
    public void registration(Client client) {
        HashMap<Long, ArrayList<HistoryClient>> visitController = new HashMap<>();

        for (Map.Entry<Long, ArrayList<HistoryClient>> entry : visitController.entrySet()){
            ArrayList<HistoryClient> historyVisits = entry.getValue();
            if (historyVisits == null){
                historyVisits = new ArrayList<>();
            }


        }



    }


}

