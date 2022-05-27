package com.nikita.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {
    //Fields
    JButton button = new JButton("Guess");
    JTextField number = new JTextField(10);
    JLabel label = new JLabel("number");

    //constructor
    public GuessFrame(){
        super();
        setSize(500,300);
        setLocation(444,245);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println("Hehe");
                int num = Integer.parseInt(number.getText());
                System.out.println(num);
                label.setText("hehe");
                label.setText("number: " + num);
            }
        });

        setLayout(new FlowLayout());
        add(number);
        add(label);
        add(button);
//        label.setText("know");
        setVisible(true);

    }



    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();

    }

}
