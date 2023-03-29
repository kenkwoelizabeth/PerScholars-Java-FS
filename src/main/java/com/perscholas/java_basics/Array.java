package com.perscholas.java_basics;
import java.util.Arrays;
public class Array {

    public static void main(String[] args) {
        int[] values = {3, 9, 6, 7, 4};
        for (int i = 1; i <=4; i++) {
            values[i] = i + values[i - 1];
            System.out.println(values[i]);
        }
        System.out.println(Arrays.toString(values));

        // Enhanced for loop
        for (int value : values) {

            System.out.println(value);
        }

    }
}

