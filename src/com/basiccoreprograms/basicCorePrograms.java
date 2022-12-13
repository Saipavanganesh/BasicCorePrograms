package com.basiccoreprograms;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class basicCorePrograms {
    public static void main(String[] args) {
        System.out.println("Quotient and Remainder");
        System.out.println("**********************");
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an number");
        int num = sc.nextInt();

        System.out.println("Quotient of "+num+" and 2 is: "+(num/2));
        System.out.println("Remainder of "+num+" and 2 is: "+(num%2));
    }
}

