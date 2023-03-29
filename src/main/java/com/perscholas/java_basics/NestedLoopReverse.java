package com.perscholas.java_basics;

import java.util.Scanner;

public class NestedLoopReverse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //for loop
        String userWord, alteredWord = "";
        System.out.print("Please enter a word (For Loop): ");

        userWord = in.nextLine();
        int length = userWord.length();

        for (int i = 0; i <= length - 1; i++) {
            for (int j = 0; j <= i; j++) {
                alteredWord = alteredWord + userWord.charAt(i);
            }
        }
        System.out.println(alteredWord);

        //while loop
        String userWord1, alteredWord1 = "";
        System.out.print("Please enter a word (While Loop): ");

        userWord1 = in.nextLine();
        int length1 = userWord1.length();

        int w = 0;
        while (w < length1) {
            int x = 0;
            while (x <= w) {
                alteredWord1 = alteredWord1 + userWord1.charAt(w);
                x++;
            }
            w++;
        }
        System.out.println(alteredWord1);

        //do while
        String userWord2;
        System.out.print("Please enter a word (Do While): ");

        userWord2 = in.nextLine();
        int length2 = userWord2.length();
        int a = 0;
        do {
            //alteredWord2 = alteredWord2 + userWord2.charAt(a);
            int b = 0;
            do {
                System.out.print(userWord2.charAt(a));
                b++;
            }while (b <= a);
            a++;
        }while (a < length2);

    }
}

