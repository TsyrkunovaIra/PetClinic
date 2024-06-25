package com.home.project.model.clinic;

import java.util.ArrayList;

public class Card {
    private HistoryClient historyClient;
    private Client client;
    private ArrayList<HistoryClient> historyVisit;
    public ArrayList<HistoryClient> getHistoryVisit() {return historyVisit;}
    public HistoryClient getHistoryClient() {return historyClient;}
    public Client getClient() {return client;}
    public void setHistoryVisit(ArrayList<HistoryClient> historyVisit) {this.historyVisit = historyVisit;}
    public void setHistoryClient(HistoryClient historyClient) {this.historyClient = historyClient;}
    public void setClient(Client client) {this.client = client;}

}
}
