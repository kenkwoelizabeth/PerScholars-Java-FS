package com.perscholas.java_basics;

import java.util.Scanner;

public class LoopReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");

        String word = sc.nextLine();
        String reversedString = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedString += word.charAt(i);
        }
        System.out.print("The reversed string of the word" + word + "' is: ");
        System.out.println(reversedString);

    }}