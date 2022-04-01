package com.nikita.sales;

public class SilverCustomer extends Customer {


    public SilverCustomer(String number, int spent) {
        super(number, spent);
    }

    public float rebate() {
        return  (spent * 0.1f);

    }

    @Override
    public void print() {


        System.out.println(number + "\t" + spent + "\t" + (spent-getDiscount()) + "\t" + rebate());

    }

}
