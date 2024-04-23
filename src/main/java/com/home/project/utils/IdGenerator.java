package com.home.project.utils;

public class IdGenerator {
    private static long gV = 0;
    public static long generateId(){
        gV = gV+1;
        return gV;
    }
}
