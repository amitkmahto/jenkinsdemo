package com.example.java;

public class Main {
    private static int numInstances =0;
    protected static int getCount(){
        return numInstances;
    }
    private static void addInstance(){
        numInstances++;
    }
    Main(){
      Main.addInstance();
    }
    public static void main(String[] args) {
        // write your code here
     System.out.println("Starting with "+Main.getCount()+" instances.");
        for (int i = 0; i <500 ; i++) {
             new Main();
        }
        System.out.println("Created "+Main.getCount()+" instances.");
    }
}
