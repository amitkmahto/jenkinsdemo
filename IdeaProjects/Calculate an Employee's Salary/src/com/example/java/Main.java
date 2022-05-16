package com.example.java;

import java.util.Scanner;

public class Main {
    public static double Numberofhourinweek(){
        Scanner sc=new Scanner(System.in);
        System.out.println("No of working hour in a day-");
        double Noofhourinaday= sc.nextDouble();
        double numberofhourinweek=7*Noofhourinaday;
        System.out.println("duration of work in a week(in hrs)-"+numberofhourinweek);
        return numberofhourinweek;
    }
    public static double Bonus(){
        Scanner ci=new Scanner(System.in);
        System.out.println("Total no of vacation in a week-");
        double vacationday=ci.nextDouble();
        double nooftotalvacationhour=8*vacationday;
        System.out.println("No of total vacation in a week(in hrs)"+nooftotalvacationhour);
        return nooftotalvacationhour;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);
        System.out.println("Amount of money/hour-");
        double amountofmoneyperhour=in.nextDouble();
        double amountofmoneyperweek=7*amountofmoneyperhour;
        System.out.println("Total amount in Weak"+amountofmoneyperweek);
        double nh=Numberofhourinweek();
        double bonus=Bonus();
        double totalbonus=bonus*amountofmoneyperhour;
        double calculatesalary=amountofmoneyperweek*nh-totalbonus;
        System.out.println("Total Salary in a weak"+calculatesalary);

    }
}
