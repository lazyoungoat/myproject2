package com.nikita.sales;

public class PlatinumCustomer extends SilverCustomer{
    public PlatinumCustomer(String number, int spent) {
        super(number, spent);
    }

    @Override
    public float getDiscount() {
        return spent*0.3f;
    }

    @Override
    public float rebate() {
        return (spent*0.2f);
    }
}
