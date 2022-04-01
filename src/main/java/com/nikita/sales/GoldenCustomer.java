package com.nikita.sales;

public class GoldenCustomer extends SilverCustomer{


    public GoldenCustomer (String number, int spent){
        super (number, spent);
    }


    @Override
    public float getDiscount(){
        return (float)(spent*0.1);
    }














}
