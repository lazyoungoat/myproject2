package com.brian;

public class SilverCustomer extends Customer {
    int rebate;

    public SilverCustomer(String number, int spentMoney) {
        super(number, spentMoney);
    }

    public int getRebate() {
        return (int) (moneySpent * 0.1f);

    }

    @Override
    public void print() {
        System.out.println(number + "\t" + moneySpent + "\t" + discountMoney + "\t" + rebate);

    }

}
