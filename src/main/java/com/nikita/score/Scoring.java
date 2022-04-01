package com.nikita.score;

import java.util.ArrayList;
import java.util.List;

public class Scoring {
    public static void main(String[] args) {
        Graduate ben = new Graduate("Ben", 34, 81);
/*      ben.name = "Ben";
        ben.english = 34;
        ben.math = 81;
        System.out.println(ben.english);
*/
        ben.print();

        Postgraduate beatrice = new Postgraduate("Beatrice", 45, 97, 81);
        beatrice.print();



        List<Graduate> students = new ArrayList<>();
        students.add(new Graduate("Ben", 34, 81));
        students.add(new Postgraduate("Beatrice", 45, 97, 81));

        for (Graduate stu:
             students) {
            stu.print();
        }


    }
}
