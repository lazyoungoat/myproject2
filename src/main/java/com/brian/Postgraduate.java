package com.brian;

public class Postgraduate extends Student {
    int thesis;

    public Postgraduate(String name, int english, int math, int thesis) {
        super(name, english, math);
        this.thesis = thesis;
    }

    @Override
    public void print() {
        super.print();
    }

    public void println() {
        System.out.println(name + "\t" + english + "\t" + math + '\t' + thesis);
    }
}
