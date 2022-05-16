package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* write your code here
	Enter the numbers your own.
	 */
        Scanner Sc1= new Scanner(System.in);
        System.out.println("Enter a=");
        double a= Sc1.nextDouble();
        Scanner Sc2= new Scanner(System.in);
        System.out.println("Enter b=");
        double b= Sc2.nextDouble();
        //equal to (==) operator
        System.out.println("a==b="+(a==b));
        //Not equal(!=) to operator
        System.out.println("a!=b="+(a!=b));
        //greater than (>) operator
        System.out.println("a>b="+(a>b));
        //less than(<) operator
        System.out.println("a<b="+(a<b));
        //greater than or equal to(>=) operator
        System.out.println("a>=b="+(a>=b));
        //less than or equal to(<=) operator
        System.out.println("a<=b="+(a<=b));
    }
}
