package com.brian.sales;

import com.brian.sales.Customer;
import com.brian.sales.SilverCustomer;

public class Shop {
    public static void main(String[] args) {
        Customer customer1 = new Customer("001", 1300);
        customer1.print();

        Customer customer2 = new Customer("002", 5400);
        customer2.print();

        SilverCustomer customer3 = new SilverCustomer("003", 3670);
        customer3.print();
    }


}
