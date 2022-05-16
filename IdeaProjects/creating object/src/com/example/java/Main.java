package com.example.java;
import java.io.*;

public class Main {
    String dogBreed;

    public Main(String name,double age){
        System.out.println("My dog name is"+name);
        System.out.println("His dog age is "+age);
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public String getDogBreed() {
        System.out.println("My dog is "+dogBreed+" breed.");
        return dogBreed;
    }

    public static void main(String[] args) {
	// write your code here
        Main dog=new Main(" tommy.",23);
        dog.setDogBreed("hermat");
        dog.getDogBreed();
        System.out.println("Dog breed:- "+dog.dogBreed);

    }
}
