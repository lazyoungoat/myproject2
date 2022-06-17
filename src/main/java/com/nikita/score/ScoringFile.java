package com.nikita.score;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScoringFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("scores.txt");
            int data = fileReader.read();
            while (data != -1){
                System.out.print((char) data);
                data = fileReader.read();
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }catch (IOException e){
            System.out.println("reader failed");
        }
        System.out.println("good");
    }
}
