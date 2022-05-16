package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Inter number between 1 to 100:-");
        Scanner number=new Scanner(System.in);
        double i=number.nextDouble();
        if(i>100) {
            System.out.println("Invalid Number");
        }
        else if(i>80){
            System.out.println("you got A+.");
        }
        else if(i>60){
            System.out.println("you got A.");
        }
        else if(i>45){
            System.out.println("you got B.");
        }
        else if(i>33) {
            System.out.println("you got c.");
        }
        else{
            System.out.println("FAil");
        }
        }
   }

