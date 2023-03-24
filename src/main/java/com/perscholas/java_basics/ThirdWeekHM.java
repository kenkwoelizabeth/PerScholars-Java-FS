package com.perscholas.java_basics;

import java.util.Scanner;

public class ThirdWeekHM {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);  // Introducing scanner class
        System.out.println("Enter your first input in words: ");  // getting first input
        String firstInput=scanner.nextLine();
        System.out.println("Enter the Second input in words: ");  // getting second input
        String secondInput=scanner.nextLine();
        int lineLength= firstInput.length() + secondInput.length();  // getting the sum of the length

        if(lineLength % 2 ==0){          // if statement for
            System.out.println( "The sum total for the length of the two line is " + lineLength + " which is an even number");
        }else{
            System.out.println( "The sum total for the length of the two line is " + lineLength + " which is an odd number");
        }
}
}
