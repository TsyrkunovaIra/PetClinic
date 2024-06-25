package com.home.project.model.clinic;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Clinic {
    private ArrayList<Client> basa;
    private long id;
    private boolean Work;
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

    @Override
    public boolean equals(Object client) {
        return super.equals(client);
        if (this == client) return true;
        if ((client == null || getClass() != client.getClass())) return false;
        Client that = (Client) client;}

    }
}
