package com.perscholas.java_basics;


import java.io.*;
import java.util.*;

public class HankeRank1Strings {

    public static void main(String[] args) {

        Scanner a=new Scanner(System.in);
        System.out.println("Enter Hello: ");
        String A=a.next();
        System.out.println("Enter Java : ");
        String B=a.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length() );
        // Since h is less than j its going to be -2
        int word = A.compareTo(B);

        if (word > 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1) + " ");

    }
}






