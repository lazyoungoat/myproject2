package com.nikita.ticket;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(Station.KAOHSIUNG_CITY, Station.TAICHUNG_CITY);
        System.out.println(ticket.destination.name);


        System.out.println("Please choose a station:(Taipei, Taichung, Kaohsiung)");
        Scanner scanner = new Scanner(System.in);
        int station = Integer.parseInt(scanner.next());


    }

}
