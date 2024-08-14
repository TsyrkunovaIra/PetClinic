package com.home.project.model.clinic;

public enum Schedule {
    Monday ("weekend"),
    Tuesday ("working hous from 7 a.m. to 8 p.m., without interruption"),
    Wednesday ("working hous from 7 a.m. to 8 p.m., without interruption"),
    Thursday ("weekend"),
    Friday ("working hous from 7 a.m. to 8 p.m., without interruption"),
    Saturday ("working hous from 7 a.m. to 8 p.m., without interruption"),
    Sunday ("working hous from 7 a.m. to 8 p.m., without interruption");

    private String clincSchedule;
    Schedule (String clincSchedule) {this.clincSchedule = clincSchedule;}
    public String getClincSchedule() {return clincSchedule;}

    @Override
    public String toString() {
        return getClincSchedule();
    }
}
