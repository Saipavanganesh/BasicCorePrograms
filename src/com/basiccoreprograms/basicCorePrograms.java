package com.basiccoreprograms;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class basicCorePrograms {
    public static void main(String[] args) {
        System.out.println("Power of 2");
        System.out.println("**********");
        System.out.println(" ");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an number");
        int num=sc.nextInt();

        if(num<31){
            System.out.println("Powers of 2 upto "+num);
            for(int i=0;i<=num;i++){
                System.out.println(Math.pow(2,i));
            }
        }
        else{
            System.out.println("Enter a number less than 31");
        }
    }
}

