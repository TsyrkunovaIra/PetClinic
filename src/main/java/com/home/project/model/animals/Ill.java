package com.home.project.model.animals;
    public class Ill {
        private String Ill;
    private String nameIll;
    boolean is_Active;
    public String getNameIll() {return nameIll;}
    public void setNameIll(String nameIll) {
            this.nameIll = nameIll;}
    public String getIll() {return Ill;}
    public void setIll(String ill) {Ill = ill;}

        public void  setIs_Active(Animal animal){
        if (animal.getIll().is_Active){
            System.out.println(animal.getIll().getNameIll());
        }else {
            System.out.println("healthy");
        }}
        public String treatment (String recommendation, String procedure ){
        System.out.println("your pet needs:  " + recommendation + procedure);
        return recommendation;
        }
        public String treatment (String recommendation, int quantity){
        System.out.println("your pet needs:  " + recommendation + quantity);
        return recommendation;
        }
        public String treatment (String medicines, double duration, int quantity){
        System.out.println("your pet needs: " + medicines + " take during " + duration + "days" + quantity);
        return medicines;




    }}


