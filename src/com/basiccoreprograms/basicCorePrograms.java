package com.basiccoreprograms;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class basicCorePrograms {
    public static void main(String[] args) {
        System.out.println("Prime Factors");
        System.out.println("*************");
        System.out.println(" ");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an number");
        int num=sc.nextInt();

        System.out.println("Prime Factors of "+num+" are:");
        primeFactorsOf(num);
    }
    public static void primeFactorsOf(int a){
        for(int i=2;i<=a;i++){
            if(isPrime(i)==1){
                int temp=a;
                while(a%i==0){
                    System.out.println(i);
                    a=a/i;
                }
            }
        }
    }

    public static int isPrime(int a){
        for(int i=2;i<a;i++){
            if(a%i==0){
                return 0;
            }
        }
        return 1;
    }
}

