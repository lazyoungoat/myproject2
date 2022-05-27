package com.nikita.ui;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFrame extends JFrame {
    //Fields
    JButton button = new JButton("Guess");
    JTextField number = new JTextField(10);
    JLabel label = new JLabel("number");
    Random random = new Random();
    int secret = random.nextInt(10+1);




    //constructor
    public GuessFrame(){
        super();
        setSize(500,300);
        setLocation(444,245);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        System.out.println(secret);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println("Hehe");
                int num = Integer.parseInt(number.getText());
                System.out.println(num);
                label.setText("number: " + num);

                if (num>secret)
                    label.setText("Smaller");
                else if (num<secret)
                    label.setText("Bigger");
                else
                    label.setText("Congratulations");
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
