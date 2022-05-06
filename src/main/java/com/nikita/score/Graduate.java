package com.nikita.score;

public class Graduate implements Printer{
    String name;
    int math;
    int english;
    public Graduate(String name) {
        this.name = name;
    }
    public Graduate(String name, int english, int math) {
        this(name);
        //重複利用this.name = name;
        this.english = english;
        this.math = math;
    }

    @Override
    public void print(){
        int average = (math + english) / 2;
        System.out.print(name + "\t" + english + "\t" + math + "\t");
        if (average < 60) {
            System.out.println(average + "**");
        }
    }


    public Graduate() {//Default constructor
    }

 /*   public void print() {
        int average = (math + english) / 2;
        System.out.print(name + "\t" + english + "\t" + math + "\t");
        if (average < 60) {
            System.out.println(average + "**");
        }
        System.out.println();
    }*/

    public int average() {
        return (english / math) / 2;
        //why do you use return?
        //what does return means?
    }
}
