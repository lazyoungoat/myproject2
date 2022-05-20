package com.nikita.ui;

import javax.swing.*;
import java.awt.*;

public class MainWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(450,400);
        frame.setLocation(1000, 222);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JButton button = new JButton("okay");
        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.setVisible(true);
        System.out.println("ee");

    }
}
