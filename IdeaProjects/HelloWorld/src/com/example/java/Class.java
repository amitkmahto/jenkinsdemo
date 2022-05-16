import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Lawyer[] lw = new Lawyer[n];
        for(int i=0;i<n;i++){
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            double salary = sc.nextDouble();
            sc.nextLine();
            int age = sc.nextInt();
            sc.nextLine();
            lw[i]= new Lawyer( id,name,salary,age);
        }
        String lawname = sc.nextLine();
        double avgage =  findAverageAgeOfLawyer(lw);
        if(avgage==0){
            System.out.println("No Lawyer found with mentioned attribute.");
        }else{
            System.out.println("Average of age "+avgage);
        }
        Lawyer la =searchLawyerByName(lw, lawname);
        if(la==null){
            System.out.println("No Lawyer found with mentioned attribute.");
        }else{
            System.out.println("id-"+la.getId());
            System.out.println("name-"+la.getName());
            System.out.println("salary-"+ la.getSalary());
            System.out.println("age-"+la.getAge());
        }
    }
    public static double findAverageAgeOfLawyer(Lawyer[] d)
    {
        double total=0;
        double avg=0;
        int c=0;
        for(int i=0;i<d.length;i++){
            total = total+ d[i].getAge();
            c++;
        }
        avg=total/c;
        return avg;

    }

    public static Lawyer searchLawyerByName(Lawyer[] d, String name)
    {
        Lawyer lawyer = null;
        for(int i=0;i<d.length;i++){
            if(d[i].getName().equalsIgnoreCase(name)){
                lawyer = d[i];
            }
        }
        return lawyer;
    }
}
class Lawyer
{
    private int id;
    private String name;
    private double salary;
    private int age;
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public double getSalary()
    {
        return salary;
    }
    public int getAge()
    {
        return age;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    Lawyer(int id, String name, double salary, int age){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
}
