package com.nikita.ticket;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(Station.KAOHSIUNG_CITY, Station.TAICHUNG_CITY);
        System.out.println(ticket.destination.name);
        System.out.println(ticket.start.id);


        System.out.println("Please choose a starting station:(Taipei:1, Taichung:2, Kaohsiung:3)");
        Scanner scan_start = new Scanner(System.in);
        String str_start = scan_start.next();
        int start = Integer.parseInt(str_start);

        System.out.println("Please choose a ending station:(Taipei:1, Taichung:2, Kaohsiung:3)");
        Scanner scan_end = new Scanner(System.in);
        String str_end = scan_end.next();
        int end = Integer.parseInt(str_end);


    }

}
