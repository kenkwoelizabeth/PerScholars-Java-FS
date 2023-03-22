package com.perscholas.java_basics;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the amount of Seconds: ");
        int secondsTotal=scanner.nextInt();


        // Hours are determined by dividing the number of seconds in an hour
        int hours = secondsTotal / 3600;

        /*
         * Minutes are determined by finding the remainder of seconds after hour is
         * calculated then dividing by number of seconds in a minute
         */
        int minutes = (secondsTotal % 3600) / 60;

        /*
         * Seconds are determined by finding the remainder of seconds after hours is
         * calculated then finding the remainder after minutes is calculated in seconds
         */
        int seconds = (secondsTotal % 3600) % 60;

        System.out.print( hours + ":" + minutes + ":" + seconds);
        System.out.print("\n");
    }
    }

