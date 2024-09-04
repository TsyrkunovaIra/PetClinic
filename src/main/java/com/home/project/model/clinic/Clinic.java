package com.home.project.model.clinic;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Clinic {
    private ArrayList<Client> basa;
    private long id;
    private ArrayList<HistoryClient> historyVisit;
    public DayOfWeek getDayOfWeek(){
        return LocalDateTime.now().getDayOfWeek();}
    public void setDayOfWeek(DayOfWeek dayOfWeek){}
    public void toWork(){
        Schedule[] values = Schedule.values();
        for (int i = 0; i < values.length; i++){
            {
                Schedule day = values[i];
                if(LocalDateTime.now().getDayOfWeek().name().equals(day.name()))
                    System.out.println();}}}

    public long getId() {return id;}
    public void setId(long id) {this.id = id;}
    public ArrayList<Client> getBasa() {return basa;}
    public void setBasa(ArrayList<Client> basa) {this.basa = basa;}

    public void registration(Client client) {



    }

    public ArrayList<HistoryClient> getHistoryVisit() {
        return historyVisit;
    }

    public void setHistoryVisit(ArrayList<HistoryClient> historyVisit) {
        this.historyVisit = historyVisit;
    }
}

