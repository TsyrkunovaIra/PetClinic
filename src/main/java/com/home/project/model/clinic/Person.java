package com.home.project.model.clinic;

import com.home.project.utils.IdGenerator;

import java.util.ArrayList;

public abstract class Person {
    private final long id;
    private String name;
    private String address;
    private int age;
    private ArrayList<HistoryClient> historyVisit;
    public Person(String name, String address, int age){
        this.id = IdGenerator.generateId();
        this.name = name;
        this.address = address;
        this.age = age;
    }
    public String getName()
    {return name;}
    public void setName(String name)
    {this.name = name;}
    public int getAge()
    {return age;}
    public void setAge(int age)
    {this.age = age;}
    public String getAddress()
    {return address;}
    public void setAddress(String address)
    {this.address = address;}
    public final long getId()
    {return id;}
    public ArrayList<HistoryClient> getHistoryVisit() {
        return historyVisit;}
    public void setHistoryVisit(ArrayList<HistoryClient> historyVisit) {
        this.historyVisit = historyVisit;}

    public boolean equals(Object p){
        if (this == p) return true;
        if (p==null || getClass() != p.getClass()) return false;

        Person that = (Person)  p;
        if (name != that.name) return false;
        if (age != that.age) return false;
        if (address != that.address ) return false;
        return  name.equals(that.name);}
    public int hahCode(){
        int result = name == null ? 0 : name.hashCode();
        int result1 = address == null ? 0 : address.hashCode();
        result = result1 + result + age;
        return  result;}
}
