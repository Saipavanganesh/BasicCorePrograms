package com.basiccoreprograms;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

public class basicCorePrograms {
    public static void main(String[] args) {
        System.out.println("Sum of Harmonic Numbers");
        System.out.println("***********************");
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        double sum=0;
        if(num!=0){
            for(int i=1;i<=num;i++){
                System.out.print("(1/"+i+") + ");
                sum=sum+((double)1/i);
            }
        }
        else{
            System.out.println("Enter another number");
        }
        System.out.println("");
        System.out.println("Sum is "+sum);
    }
}

