package com.example.java;

public class Employee {
    String name;
    int age;
    String designation;
    double salary;
    //it is constructor of Employee class.
    public Employee(String name){
        this.name=name;
    }

    public void empAge(int empAge){
        age=empAge;
    }
    //Assign the designation to the variable designation.

    public void empDesignation(String empDesig){
    designation = empDesig;
    }
    //Assign the salary to the variable salary
    public void empSalary(double empSalary){
        salary=empSalary;
    }
    //print the employee details.
    public void printEmployee(){
        System.out.println("Name:-"+name);
        System.out.println("Age:-"+age);
        System.out.println("Designation:-"+designation);
        System.out.println("Salary:-"+salary);

    }
}
