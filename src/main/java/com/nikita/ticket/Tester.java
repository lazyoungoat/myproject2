package com.nikita.ticket;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(Station.KAOHSIUNG, Station.TAICHUNG);
        System.out.println(ticket.price);
        System.out.println(ticket.arrival.name);
        System.out.println(ticket.departure.id);

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many tickets?");
        int amount = Integer.parseInt(scanner.next());

        for (int i = 0; i < amount; i++) {

            System.out.println("Departure station (1.Taipei 2.Taichung 3.Kaohsiung): ");

            Station departure;
            departure = null;
            int choice1 = Integer.parseInt(scanner.next());
            while ((choice1 != 1) && (choice1 != 2) && (choice1 != 3)) {
                System.out.println("Error");
                choice1 = Integer.parseInt(scanner.next());
            }
            switch (choice1) {
                case 1:
                    System.out.println("Departure : Taipei");
                    departure = Station.TAIPEI;
                    break;
                case 2:
                    System.out.println("Departure : Taichung");
                    departure = Station.TAICHUNG;
                    break;
                case 3:
                    System.out.println("Departure : Kaohsiung");
                    departure = Station.KAOHSIUNG;
                    break;
            }

            System.out.println();

            System.out.println("Arrival station (1.Taipei 2.Taichung 3.Kaohsiung): ");
            Station arrival;
            arrival = null;
            int choice2 = Integer.parseInt(scanner.next());
            while ((choice2 != 1) && (choice2 != 2) && (choice2 != 3)) {
                System.out.println("Error");
                choice2 = Integer.parseInt(scanner.next());
            }
            switch (choice2) {
                case 1:
                    System.out.println("Arrival : Taipei");
                    arrival = Station.TAIPEI;
                    break;
                case 2:
                    System.out.println("Arrival : Taichung");
                    arrival = Station.TAICHUNG;
                    break;
                case 3:
                    System.out.println("Arrival : Kaohsiung");
                    arrival = Station.KAOHSIUNG;
                    break;
            }
            System.out.println();
            Ticket ticket1 = new Ticket(departure, arrival);


            System.out.println("Your ticket is " + ticket1.price + " dollar.");
            ArrayList<Integer> total = new ArrayList<>();
            total.add(ticket1.price);

        }
        System.out.println();

































        /*
        boolean choose = true;
        while (choose){
            System.out.println("Please choose a starting station:(Taipei:1, Taichung:2, Kaohsiung:3)");
            Scanner scan_start = new Scanner(System.in);
            String str_start = scan_start.next();
            int start = Integer.parseInt(str_start);
            switch (start) {
                case 1:
                    System.out.println("Taipei");
                    break;
                case 2:
                    System.out.println("Taichung");
                    break;
                case 3:
                    System.out.println("Kaohsiung");
                    break;
                default:
                    System.out.println("Invalid");
            }choose = false;
            break;
        }
        System.out.println("Please choose a ending station:(Taipei:1, Taichung:2, Kaohsiung:3)");
        Scanner scan_end = new Scanner(System.in);
        String str_end = scan_end.next();
        int end = Integer.parseInt(str_end);
        */

    }

}
