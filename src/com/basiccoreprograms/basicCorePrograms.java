package com.basiccoreprograms;

import java.util.Random;
import java.util.Scanner;

public class basicCorePrograms {
    public static void main(String[] args) {
        System.out.println("Percentage of Heads and Tails");
        System.out.println("*****************************");
        System.out.println(" ");
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter how many time you want to flip the coin...");
        int flip=sc.nextInt();
        Random ran=new Random();
        int count=0;
        double percentage;

        for(int i=0;i<flip;i++){
            double toss=ran.nextDouble();
            System.out.println(toss);
            if(toss<0.5){
                System.out.println("Tails");
                count++;
            }
            else{
                System.out.println("Heads");
            }
        }
        double Count=count;
        double Flip=flip;

        percentage=(Count/Flip)*100;
        System.out.println("Heads Percentage="+(100.0-percentage));
        System.out.println("Tails Percentage="+percentage);
    }
}

