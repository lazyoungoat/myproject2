package com.nikita.sales;

public class Customer {
    String number;
    int spent;
    float discount = 0.1f;

    public Customer(String number, int spent) {
        this.number = number;
        this.spent = spent;
    }

    //1000-100, 2000-200......
    public float getDiscount(){
        return (spent/1000)*discount*1000;

    }


    public void print() {
        float money = spent - getDiscount();

        System.out.println(number + "\t" + spent + "\t" + (spent-getDiscount()));
    }


}
