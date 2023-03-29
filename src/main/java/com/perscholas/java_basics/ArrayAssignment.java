package com.perscholas.java_basics;

import java.util.Arrays;

public class ArrayAssignment {
    public static void main(String[] args) {
        /*
        Write a program that creates an array of integers with a length of 3. Assign the
values 1, 2, and 3 to the indexes. Print out each array element.
         */
        int[] work1 = new int[3];
        work1[0] = 1;
        work1[1] = 2;
        work1[2] = 3;
        System.out.println(Arrays.toString(work1));
        for (int i = 0; i < 3; i++) {
            System.out.println(work1[i]);
        }
        for (int value : work1) {

            System.out.println(value);
        }
/*Write a program that returns the middle element in an array. Give the following
values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7 */
        int[] work2 = {13, 5, 7, 68, 2};
        System.out.println(work2[2]);

        /*Write a program that creates an array of String type and initializes it with the
strings “red”, “green”, “blue” and “yellow”. Print out the array length. Make a
copy using the clone( ) method. Use the Arrays.toString( ) method on the new
array to verify that the original array was copied.*/
        String[] work3= {"red", "green", "blue", "yellow"};
        int length=work3.length;
        System.out.println(length);
        String[] copyWork3= new String[4];
        System.arraycopy(work3, 0, copyWork3, 0, 4);
        System.out.println(Arrays.toString(copyWork3));
/*Write a program that creates an integer array with 5 elements (i.e., numbers).
The numbers can be any integers. Print out the value at the first index and the
last index using length - 1 as the index. Now try printing the value at index =
length ( e.g., myArray[myArray.length ] ). Notice the type of exception which is
produced. Now try to assign a value to the array index 5. You should get the
same type of exception. */
        int[] work4= {5, 6, 7, 9,12};
        System.out.println(work4[0]); // first index
        System.out.println(work4.length-1);
    }

}
