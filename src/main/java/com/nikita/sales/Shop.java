package com.nikita.sales;

public class Shop {
    public static void main(String[] args) {
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


    }


}
