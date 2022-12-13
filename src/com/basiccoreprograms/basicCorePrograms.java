package com.basiccoreprograms;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class basicCorePrograms {
    public static void main(String[] args) {
        System.out.println("Even or Odd");
        System.out.println("***********");
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
}

