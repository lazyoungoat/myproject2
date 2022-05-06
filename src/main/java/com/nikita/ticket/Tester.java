package com.nikita.ticket;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(Station.KAOHSIUNG, Station.TAICHUNG);
        System.out.println(ticket.price);
        System.out.println(ticket.arrival.name);
        System.out.println(ticket.departure.id);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Departure station (1.Taipei 2.Taichung 3.Kaohsiung): ");

        int choice1 = Integer.parseInt(scanner.next());
        switch (choice1){
            case 1:
                System.out.println("Departure : Taipei");
                break;
            case 2:
                System.out.println("Departure : Taichung");
                break;
            case 3:
                System.out.println("Departure : Kaohsiung");
                break;
            default:
                System.out.println("Error");
        }

        System.out.println();

        int choice2 = Integer.parseInt(scanner.next());
        System.out.println("Arrival station (1.Taipei 2.Taichung 3.Kaohsiung): ");
        choice2 = Integer.parseInt(scanner.next());
        switch (choice2){
            case 1:
                System.out.println("Arrival : Taipei");
                break;
            case 2:
                System.out.println("Arrival : Taichung");
                break;
            case 3:
                System.out.println("Arrival : Kaohsiung");
                break;
            default:
                System.out.println("ERROR");
        }
































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
