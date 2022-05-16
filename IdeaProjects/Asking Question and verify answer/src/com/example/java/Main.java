package com.example.java;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String question = "What is Indian most populated city?";
        String option1 = "Mumbai";
        String option2 = "Delhi";
        String option3 = "Kolkata";
        String option4 = "chennai";
        String input = null;
        while (!Objects.equals(input, option2)) {
            Scanner sc = new Scanner(System.in);
            System.out.println(question);
            System.out.println(option1 + " " + option2 + " " + option3 + " " + option4);
            input = sc.nextLine();
            if (Objects.equals(input, option2)) {
                System.out.println("Your Answer is correct.");
            } else {
                System.out.println("your answer is incorrect.");
            }
        }
    }
}
