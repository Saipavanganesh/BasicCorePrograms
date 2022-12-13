package com.basiccoreprograms;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class basicCorePrograms {
    public static void main(String[] args) {
        System.out.println("Vowel or Consonant");
        System.out.println("******************");
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet");
        char ch = sc.next().charAt(0);
        switch(ch){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println("Vowel");
                break;
            default :
                System.out.println("Consonant");
                break;
        }

    }
}

