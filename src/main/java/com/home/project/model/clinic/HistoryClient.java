package com.home.project.model.clinic;

import com.home.project.model.animals.Animal;

import java.util.ArrayList;
public class HistoryClient {
    private String dataVisit;
    private String nameIll;
    private String treatment;
    private double score;

    public HistoryClient(String dataVisit, String nameIll, String treatment, double score) {
        this.dataVisit = dataVisit;
        this.nameIll = nameIll;
        this.treatment = treatment;
        this.score = score;
    }

    public String getDataVisit() {return dataVisit;}
    public String getNameIll() {return nameIll;}
    public String getTreatment() {return treatment;}
    public double getScore() {return score;}
    public void setDataVisit(String dataVisit) {this.dataVisit = dataVisit;}
    public void setNameIll(String nameIll) {this.nameIll = nameIll;}
    public void setTreatment(String treatment) {this.treatment = treatment;}
    public void setScore(double score) {this.score = score;}
    public String toString() {return "History visit client: " + dataVisit + ", " + nameIll + ", " + treatment + ", " + score + "$";}
}





