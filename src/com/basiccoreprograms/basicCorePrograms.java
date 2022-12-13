package com.basiccoreprograms;

import java.util.Random;
import java.util.Scanner;

public class basicCorePrograms {
    public static void main(String[] args) {
        System.out.println("Leap Year");
        System.out.println("*********");
        System.out.println(" ");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an year");
        int year=sc.nextInt();

        int count=0,rem,temp;
        temp=year;
        while(temp!=0){
            rem=temp%10;
            temp=temp/10;
            count++;
        }
        if(count!=4){
            System.out.println("Enter correct year");
        } else if (year>1582) {
            if (year%4==0) {
                if(year%100==0){
                    if(year%400==0){
                        System.out.println("Entered year is a leap year");
                    }
                    else{
                        System.out.println("Entered year is not a leap year");
                    }
                }
                else{
                    System.out.println("Entered year is leap year");
                }
            } else {
                System.out.println("Entered year is not leap year");
            }
        }
        System.out.println("Enter correct year");
    }
}

