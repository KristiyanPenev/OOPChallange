package com.company;

import java.util.*;

public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(){
        day = 0;
        month = 0;
        year = 0;
    }

    public MyDate(int day,int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean equals(MyDate date){
        if(this.year == date.getYear() && this.month == date.getMonth() && this.day == date.getDay()) {
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        return "" + month + "/" + day +"/" + year;
    }
}
