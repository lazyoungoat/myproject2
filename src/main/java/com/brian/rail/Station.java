package com.brian.rail;

public class Station {
    public final static Station TAIPEI_CITY = new Station(1000, "Taipei");
    public final static Station TAICHUNG_CITY = new Station(2000, "Taichung");
    public final static Station KAOHSIUNG_CITY = new Station(3000, "Kaohsiung");

    int id;
    String name;

    public Station(int id, String name){
        this.id = id;
        this.name = name;
    }
}
