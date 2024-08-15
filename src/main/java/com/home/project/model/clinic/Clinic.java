package com.home.project.model.clinic;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Clinic {
    private ArrayList<HistoryClient> historyVisit;
    private ArrayList<Client> basa;
    private long id;
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
    public ArrayList<HistoryClient> getHistoryVisit() {
        return historyVisit;
    }

    public void setHistoryVisit(ArrayList<HistoryClient> historyVisit) {
        this.historyVisit = historyVisit;
    }

    public void registration(Client client) {
        if (historyVisit == null){
           historyVisit = new ArrayList<>();
        }
        if (client.getHistoryVisit() == null) {
            Scanner scanner = new Scanner(System.in);
            HistoryClient historyClient = new HistoryClient(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextDouble());
         Card card = new Card();
         card.setHistoryClient(historyClient);
         historyVisit.add(historyClient);

        }



    }
}



