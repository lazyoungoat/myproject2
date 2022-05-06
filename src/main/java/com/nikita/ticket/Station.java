package com.nikita.ticket;

public class Station {
    public final static Station TAIPEI = new Station(100, "Taipei");
    public final static Station TAICHUNG = new Station(200, "Taichung");
    public final static Station KAOHSIUNG = new Station(400, "Kaohsiung");

    int id;
    String name;

    public Station(int id, String name){
        this.id = id;
        this.name = name;
    }
}
