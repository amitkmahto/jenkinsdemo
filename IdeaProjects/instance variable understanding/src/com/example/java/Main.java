package com.example.java;

public class Main {
    //this instance variable is visible for any child case.
    public String name;
    //salary variable is visible in Main class only.
    private double salary;
    //the name variable is assigned in the constructor.
    public Main(String empName){
        name=empName;
    }
    //the salary variable is assigned a value.

    public void setSalary(double empSalary) {
        salary = empSalary;
    }
    //this method prints the employee details.
    public void printEmp(){
        System.out.println("Name:-"+name);
        System.out.println("salary:-"+salary);
    }
    public static void main(String[] args) {
	// write your code here
        Main empOne= new Main("Satya");
        empOne.setSalary(2000);
        empOne.printEmp();
    }
}
