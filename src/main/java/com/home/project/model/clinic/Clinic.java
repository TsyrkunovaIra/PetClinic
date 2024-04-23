package com.home.project.model.clinic;
import java.time.DayOfWeek;
import java.time.LocalDateTime;



public class Clinic {
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
                    System.out.println();

            }
        }

    }

}
