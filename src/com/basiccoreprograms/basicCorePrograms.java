package com.basiccoreprograms;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class basicCorePrograms {
    public static void main(String[] args) {
        System.out.println("Swapping");
        System.out.println("********");
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number");
        int num2 = sc.nextInt();
        int temp;

        System.out.println("Numbers before swapping: "+num1+" "+num2);

        temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("Numbers before swapping: "+num1+" "+num2);
    }
}

