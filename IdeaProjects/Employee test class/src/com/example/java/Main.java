package com.example.java;
import java.io.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee empone=new Employee("sujit");
        Employee emptwo=new Employee("Amit");
        Employee empthree=new Employee("Sumit");
       //Invoking methods for each object created
        empone.empAge(17);
        empone.empDesignation("Medical staff");
        empone.empSalary(2500);
        empone.printEmployee();
        emptwo.empAge(23);
        emptwo.empDesignation("assistant software engineer");
        emptwo.empSalary(25000);
        emptwo.printEmployee();
        empthree.empAge(21);
        empthree.empDesignation("tractor driver");
        empthree.empSalary(20000);
        empthree.printEmployee();
    }
}