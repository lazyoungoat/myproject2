package com.brian.sales;

public class SilverCustomer extends Customer {


    public SilverCustomer(String number, int spentMoney) {
        super(number, spentMoney);
    }

    public int rebate() {
        return (int) (moneySpent * 0.1f);

    }

    @Override
    public void print() {
        System.out.println(number + "\t" + moneySpent + "\t" + discountMoney + "\t" + rebate());

    }

}
