package com.nikita.sales;

import java.util.ArrayList;

public class Shop {
    public static void main(String[] args) {






        //No.2
        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer("001", 1300));
        customers.add(new Customer("002", 540));
        customers.add(new SilverCustomer("003", 760));
        customers.add(new Customer("004", 2670));
        customers.add(new GoldenCustomer("005", 8700));

        //customers.get(0).print();
        //#1
        for (int i = 0; i < 5; i++) {
            //customers.get(i).print();
        }
        System.out.println();
        //#2
        for (Customer cus: customers) {
            cus.print();
        }





        //No.1
        /*
        Customer customer1 = new Customer("001", 1300);
        customer1.print();

        Customer customer2 = new Customer("002", 540);
        customer2.print();

        SilverCustomer customer3 = new SilverCustomer("003", 760);
        customer3.print();

        Customer customer4 = new Customer("004", 2670);
        customer4.print();

        GoldenCustomer customer5 = new GoldenCustomer("005", 8700);
        customer5.print();

        PlatinumCustomer customer6 = new PlatinumCustomer("006", 440);
        customer6.print();
        */

    }


}
