package com.nikita.parking;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        String id = "KJD-4592";
        String enterTime = "04:00";
        String exitTime = "12:00";

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

        //Exception Handling
        Date d = null;
        try{
            d = sdf.parse(enterTime);
        }catch(Exception e){
            System.out.println("Wrong format");
        }
        System.out.println(d);
        System.out.println(d.getTime());


        try{
            Date d2 = sdf.parse(exitTime);
            System.out.println(d2);
            System.out.println(d2.getTime());
            long ms = d2.getTime() - d.getTime();
            int minutes = (int)(ms/(1000*60));
            System.out.println(minutes);
        }catch(Exception e){
            System.out.println("Exit wrong format");
        }





    }
}
