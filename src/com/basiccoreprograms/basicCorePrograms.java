package com.basiccoreprograms;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

public class basicCorePrograms {
    public static void main(String[] args) {
        System.out.println("Largest of 3 numbers");
        System.out.println("********************");
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        int[] numArr=new int[3];
        for(int i=0;i<3;i++){
            System.out.println("Enter number");
            int num= sc.nextInt();
            numArr[i]=num;
        }
        Arrays.sort(numArr);
        System.out.println("Largest number is: "+numArr[2]);
    }
}

