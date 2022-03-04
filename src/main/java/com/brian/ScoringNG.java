package com.brian;

public class ScoringNG {
    public static void main(String[] args) {
        //2 students, Math and English grades
        int[] english = {34, 78};
        int[] math = {81, 94};
        String[] name = {"Ben", "Ken"};
        for (int i = 0; i < 2; i++) {
            System.out.println(name[i] + "\t" + english[i] + "\t" + math[i] + "\t" + (english[i] + math[i]) / 2);
        }
    }
}
