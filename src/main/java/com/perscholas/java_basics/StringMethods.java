package com.perscholas.java_basics;

import java.util.Scanner;

public class StringMethods {

        public static void main(String args[]) {

            /* GET USER INPUT */
            String text = getUserInput();

            /* CREATE TO UPPERCASE STRING */
            String toUpperCase = upperCase(text);

            /* COUNT THE OCCURRENCES OF KEYWORD */
            int result = spiltAndCount(text);

            /* PRINT OUTPUT */
            printOutput(text, toUpperCase, result);
        }

        /* GET USER INPUT */
        public static String getUserInput(){
            /* GET TEXT FROM USER */
            Scanner keyboard = new Scanner(System.in);
            String text = "";
            text = keyboard.nextLine();
            return text;
        }

        /* CREATE UPPERCASE STRING */
        public static String upperCase(String text){
            String toUpperCase = text.replace("love", ("love").toUpperCase());
            return toUpperCase;
        }

        public static int spiltAndCount(String text){
            String a[] = text.split(" ");
            int result = 0;
            String word = "love";

            /* COUNT HOW MANY TIMES THE WORD LOVE APPEARS */
            for (int i = 0; i < a.length; i++) {
                if (a[i].contains("love")) {
                    result++;}
            }
            return result;
        }

        /* PRINT OUTPUT */
        public static void printOutput(String text, String upperCase, int result){
            System.out.println(text);
            System.out.println(upperCase);
            System.out.println(result);
        }
    }

        //I love Java more than my friend loves apple

