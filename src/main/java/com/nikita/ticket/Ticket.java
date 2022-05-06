package com.nikita.ticket;

public class Ticket {

    public final static int TAIPEI = 100;
    public final static int TAICHUNG = 200;
    public final static int KAOHSIUNG = 300;

    Station departure;
    Station arrival;
    int price;


    public Ticket(Station departure, Station arrival) {
        this.departure = departure;
        this.arrival = arrival;
        int diff = Math.abs(departure.id - arrival.id);
        switch(diff){
            case 100:
                price = 600;
                break;
            case 200:
                price = 700;
                break;
            case 300:
                price = 1300;
                break;
        }




        /*
        if (departure == Station.TAIPEI){
            if (arrival == Station.TAICHUNG){
                price = 600;
            }else price = 1300;
        }
        if (departure == Station.TAICHUNG){
            if (arrival == Station.TAIPEI){
                price = 600;
            }else price = 700;
        }
        if (departure == Station.KAOHSIUNG){
            if (arrival == Station.TAIPEI){
                price = 1300;
            }else price = 700;
        }*/
    }



    public void print(){
        System.out.println(departure.name + " to " + arrival.name + " $" + price);
    }


}
