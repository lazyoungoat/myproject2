package com.brian;

public class Scoring {
    public static void main(String[] args) {
        Student ben = new Student("Ben", 34, 81);
/*      ben.name = "Ben";
        ben.english = 34;
        ben.math = 81;
        System.out.println(ben.english);
*/
        ben.print();

        Postgraduate beatrice = new Postgraduate("Beatrice", 45, 97, 81);
        beatrice.print();
        beatrice.println();
    }
}
