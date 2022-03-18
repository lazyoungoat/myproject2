package com.brian;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Customer {
    String number;
    int moneySpent;
    float discount;
    float discountMoney;

    public Customer(String number, int moneySpent) {
        this.number = number;
        this.moneySpent = moneySpent;
    }


    public void print() {
        discount = 0.1f;

        discountMoney = moneySpent - 1000 * ((moneySpent / 1000) * discount);

        System.out.println(number + "\t" + moneySpent + "\t" + discountMoney);
    }


}
