package com.perscholas.java_basics;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] targetArray = new int[sourceArray.length];
        System.out.println("Source Array: " + Arrays.toString(sourceArray));
        System.out.println("Target Array: " + Arrays.toString(targetArray));


        System.arraycopy(sourceArray, 0, targetArray, 1, 2);
        System.out.println("Source Array: " + Arrays.toString(sourceArray));
        System.out.println("Target Array: " + Arrays.toString(targetArray));


        // Calculate the sum of all elements of an array


        // an array of numbers
        int[] numbers = {3, 4, 5, -5, 0, 12};
        int sum = 0;

        //iterating through each element of the array
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(Arrays.stream(numbers).min());
        System.out.println(Arrays.stream(numbers).max());
        System.out.println("The sum of the arrays is :" + sum);


        int smallestNum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (smallestNum > numbers[i]) {
                smallestNum = numbers[i];
                System.out.println("The smallest number is : " + smallestNum);

            }
        }

        // binary search
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int index = Arrays.binarySearch(numbers, 3);
        System.out.println("The index of 3 is : " + index);

    }
}