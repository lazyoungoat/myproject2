package com.brian.score;

public class Postgraduate extends Graduate {
    int thesis;

    public Postgraduate(String name, int english, int math, int thesis) {
        super(name, english, math);
        this.thesis = thesis;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("override");
    }

    public void println() {
        System.out.println(name + "\t" + english + "\t" + math + '\t' + thesis);
    }
}
