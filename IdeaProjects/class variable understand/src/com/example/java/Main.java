package com.example.java;

public class Main {
    //salary variablke is private static variable
    private static double salary;
    //DEPARTMENT is a constant.
    public static final String DEPARTMENT="Development";

    public static void main(String[] args) {
	// write your code here
        salary=20000;
        System.out.println(DEPARTMENT+" average salary is "+salary);
    }
}
