package com.perscholas.java_basics;

public class Looping {
    public static void main(String[] args) {
    /*    //For Loop
        // for (int i=0; i<2; i++){
        System.out.println("Welcome to Java!");
    }
        System.out.println("Goodbye!");

*/
//

        int weeks = 3;
        int days = 7;

        // outer loop prints weeks
        for (int i = 1; i <= weeks; ++i) {
            System.out.println("Week: " + i);

            // inner loop prints days
            for (int j = 1; j <= days; ++j) {
                System.out.println("  Day: " + j);
            }
        }
    }}



