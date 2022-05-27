package com.nikita.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWin {
    public static void main(String[] args) {
        //Graphical User Interface(GUI)
        //swing, JavaFX
        //eXtension
        JFrame frame = new JFrame();
        frame.setSize(450,400);
        frame.setLocation(1000, 222);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JButton button = new JButton("okay");
        //匿名類別 Anonymous class
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hey");
            }
        });

        frame.setLayout(new FlowLayout());
//        frame.setLayout(new BorderLayout());
        frame.add(button);
        //Layout
        frame.setVisible(true);
        System.out.println("ee");

    }
}
