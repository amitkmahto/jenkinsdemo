package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student name:-");
        String student = sc.nextLine();
            Scanner input1 = new Scanner(System.in);
            System.out.println("Enter math marks:-");
            double math = input1.nextDouble();
            input1.nextLine();
            Scanner input2 = new Scanner(System.in);
            System.out.println("Enter Science marks:-");
            double science = input2.nextDouble();
            input2.nextLine();
            Scanner input3 = new Scanner(System.in);
            System.out.println("Enter Social Science marks:-");
            double Socialscience = input3.nextDouble();
            input3.nextLine();
            Scanner input4 = new Scanner(System.in);
            System.out.println("Enter Hindi marks:-");
            double hindi = input4.nextDouble();
            input4.nextLine();
            Scanner input5 = new Scanner(System.in);
            System.out.println("Enter English marks:-");
            double english = input5.nextDouble();
            double percentage = ((math + science + Socialscience + hindi + english)/ 500)*100;
            System.out.println(student+".You got "+percentage+"% Marks.");
            if (percentage >= 80) {
                System.out.println("you got First class with Distinction.");
            } else if (percentage >= 60) {
                System.out.println("you got First division.");
            } else if (percentage >= 45) {
                System.out.println("You got Second division.");
            } else if (percentage >= 33) {
                System.out.println("You got Third division.");
            } else if(percentage<33) {
                System.out.println("Regret");
            }else{
                System.out.println("Invalid Percentage");
            }
        }
    }


