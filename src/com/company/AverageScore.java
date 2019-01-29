package com.company;

import java.util.Scanner;

public class AverageScore {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Enter a score: ");
        double score1= Keyboard.nextInt();
        double score2= Keyboard.nextInt();
        double score3= Keyboard.nextInt();
        double score4= Keyboard.nextInt();
        double score5= Keyboard.nextInt();
        double score6= Keyboard.nextInt();
        double score7= Keyboard.nextInt();
        double score8= Keyboard.nextInt();
        double score9= Keyboard.nextInt();
        double score10= Keyboard.nextInt();
        double average=(score1+score2+score3+score4+score5+score6+score7+score8+score9+score10)/10;
        System.out.println(average);

    }
}
