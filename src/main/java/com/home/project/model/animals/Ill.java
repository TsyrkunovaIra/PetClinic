package com.home.project.model.animals;
    public class Ill {
    private String Ill;
    private String nameIll;

    private String recomendation;
    public String getNameIll() {return nameIll;}
    public void setNameIll(String nameIll) {this.nameIll = nameIll;}
    public String getIll() {return Ill;}public String getRecomendation() {return recomendation;}
    public void setRecomendation(String recomendation) {this.recomendation = recomendation;
   }
    public void setIll(String ill) {Ill = ill;}
    public String toString(){
    return ("diagnosis: " + nameIll + "treatment: " + recomendation);
        }


    }


