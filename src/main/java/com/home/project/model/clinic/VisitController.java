package com.home.project.model.clinic;

import java.util.ArrayList;
import java.util.HashMap;

public class VisitController {
    private HistoryClient historyClient;
    private Client client;
    private ArrayList<HistoryClient> historyVisit;
    private ArrayList<VisitController> card;
    private HashMap<Long, ArrayList<HistoryClient>> visitController;
    public ArrayList<HistoryClient> getHistoryVisit() {return historyVisit;}
    public HistoryClient getHistoryClient() {return historyClient;}
    public Client getClient() {return client;}
    public void setHistoryVisit(ArrayList<HistoryClient> historyVisit) {this.historyVisit = historyVisit;}
    public void setHistoryClient(HistoryClient historyClient) {this.historyClient = historyClient;}
    public void setClient(Client client) {this.client = client;}
    public HashMap<Long, ArrayList<HistoryClient>> getVisitController() {return visitController;}
    public void setVisitController(HashMap<Long, ArrayList<HistoryClient>> visitController) {this.visitController = visitController;}
    public ArrayList<VisitController> getCard() {return card;}
    public void setCard(ArrayList<VisitController> card) {this.card = card;}
}

