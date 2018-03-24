package org.unitec.mensajitoandroid;

/**
 * Created by luisabrahamaquinocastillo on 3/23/18.
 */

public class Fecha {
    int year;
    String month;
    Chronology chronology;
    boolean leapYear;
    int dayOfMonth;
    int dayOfYear;
    String era;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Chronology getChronology() {
        return chronology;
    }

    public void setChronology(Chronology chronology) {
        this.chronology = chronology;
    }

    public boolean isLeapYear() {
        return leapYear;
    }

    public void setLeapYear(boolean leapYear) {
        this.leapYear = leapYear;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public int getDayOfYear() {
        return dayOfYear;
    }

    public void setDayOfYear(int dayOfYear) {
        this.dayOfYear = dayOfYear;
    }

    public String getEra() {
        return era;
    }

    public void setEra(String era) {
        this.era = era;
    }
}
