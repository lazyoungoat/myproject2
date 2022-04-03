package com.nikita.ticket;

public class Ticket {

    public final static int TAIPEI_CITY = 1000;
    public final static int TAICHUNG_CITY = 2000;
    public final static int KAOHSIUNG_CITY = 3000;

    Station start;
    Station arrival;
    int price;


    public Ticket(Station start, Station destination) {
        this.start = start;
        this.arrival = destination;


    }


}
