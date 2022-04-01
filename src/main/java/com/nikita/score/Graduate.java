package com.nikita.score;

public class Graduate {
    String name;
    int math;
    int english;

    public Graduate(String name) {//Constructor
        this.name = name;
    }

    public Graduate(String name, int english, int math) {//Constructor
        this(name);//呼叫public class內constructor的code。要放在constructor的第一行
        //重複利用this.name = name;
//        this.name = name;
        this.english = english;
        this.math = math;
    }

    public Graduate() {//Default constructor

    }

    public void print() {
        int average = (math + english) / 2;
        System.out.print(name + "\t" + english + "\t" + math + "\t");
        if (average < 60) {
            System.out.println(average + "**");
        }
        System.out.println();
    }

    public int average() {
        return (english / math) / 2;
        //why do you use return?
        //what does return means?
    }
}
