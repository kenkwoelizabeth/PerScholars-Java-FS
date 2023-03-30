package com.perscholas.java_basics;

import java.util.Arrays;

import static java.util.Collections.binarySearch;

public class BinarySearchExercise {

        public static void main(String[] args) {
            int[] myIntArray = {5, 6, 2, 10, 20, 40};
            boolean searchResult = binarySearch(myIntArray, 6);
            System.out.println(searchResult);
        }

        private static boolean binarySearch(int[] myIntArray,
                                            int targetNumber) {
            // TODO - write your code here
            Arrays.sort(myIntArray);
            int startIndex=0;
            int endIndex= myIntArray.length-1;

            while(startIndex<=endIndex){
                int middleIndex=(endIndex - startIndex)/2;
                int middleValue=myIntArray[middleIndex];
                if (targetNumber==middleValue){
                    return true;
                }else if(targetNumber > middleValue) {
                    startIndex = middleIndex + 1;


                }else{ endIndex=middleIndex-1;
                }
            }

            return false;

        }
    }