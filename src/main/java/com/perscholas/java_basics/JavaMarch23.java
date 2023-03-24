package com.perscholas.java_basics;

import java.util.Locale;
import java.util.Scanner;

public class JavaMarch23 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your words: ");
        String input = scanner.nextLine();
        String findWord = input.replace("love", "LOVE");
        System.out.println(findWord);

        int count = 1;

        for (int i = 0; i < findWord.length() ; i++)
        {
            if ((findWord.contains("love")))
            {
                count++;
            }
        }
        System.out.println("Number of words in a string : " + count);
    }
}

        //I love Java more than my friend loves apple

