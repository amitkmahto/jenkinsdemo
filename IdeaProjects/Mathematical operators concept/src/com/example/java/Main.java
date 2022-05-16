package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter a=");
        double a= sc1.nextDouble();
        sc1.nextLine();
        Scanner sc2= new Scanner(System.in);
        System.out.println("Enter b=");
        double b=sc2.nextDouble();
        Scanner sc3= new Scanner(System.in);
        System.out.println("Enter c=");
        double c=sc3.nextDouble();
        Scanner sc4= new Scanner(System.in);
        System.out.println("Enter d=");
        double d=sc4.nextDouble();
        //add operation.
        System.out.println("a+b="+(a+b));
        //Substraction
        System.out.println("a-b="+(a-b));
        //multiplication
        System.out.println("a*b="+(a*b));
        //division
        System.out.println("a/b="+(a/b));
        //modulus i.e remainder
        System.out.println("b%a="+(b%a));
        System.out.println("c%a="+(c%a));
        //increment
        System.out.println("a++="+(a++));
        //decrement
        System.out.println("a--="+(--a));
        //compare between d++ and ++d
        System.out.println("d++="+(++d));
        System.out.println("++d="+(++d));
    }
}
