package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*Input is given in decimal but program
        itself convert into byte code
         */
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter any number a=");
        int a= sc1.nextInt();
        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter any number b=");
        int b= sc1.nextInt();
        int c=0;
        // bitwise AND operator
        c=a & b;
        System.out.println("a & b="+c);
        //bitwise OR operator
        c=a | b;
        System.out.println("a | b="+c);
        //bitwise XOR operator
        c=a ^ b;
        System.out.println("a ^ b="+c);
        //bitwise compliment
        c= ~a;
        System.out.println("~a="+c);
        //bitwise left shift operator
        c= a<<2;
        System.out.println("a<<2="+c);
        //bitwise Right shift operator
        c= a>>2;
        System.out.println("a>>2="+c);
        //bitwise zero fill right shift operator
        c= a>>>2;
        System.out.println("a>>>2="+c);

    }
}
