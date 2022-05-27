package com.nikita.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {
    //Fields

    //constructor
    public GuessFrame(){
        super();
        setSize(500,300);
        setLocation(444,245);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JButton button = new JButton("boom");
        JLabel label = new JLabel("come");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println("Hehe");
                label.setText("Hehe");
            }
        });


        setVisible(true);

    }



    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();

    }

}
