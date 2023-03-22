package com.perscholas.java_basics;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNum {

    public static void main(String[] args) {
        //  int num= ThreadLocalRandom.current().nextInt(6, 10);
        //  System.out.println(" you rolled a "  + num);


        //Write a program which prints numbers from 89 to 117.
      /*  for(int i=89; i<118; i++){
            System.out.println(i);
        }  */

       /* int count = 1;
        for (int i = 1; i < 41; i++) {

            System.out.println(i);
            if (count == 3) {
                System.out.println("Quack");
                count = 0;
            }
            count++;
        }

    }*/
      /*  String passWord = "Shark50";
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Password : ");
        String i = scan.nextLine();
        if (passWord != i) {
            String b = scan.nextLine();
        } else {
            System.out.println("ACCESS APPROVED");


        }
   int [] a= {10, 2,6,7,8, 9, 23, 28, 50, 49};
      for(int i= 0; i<a.length; i++){
          System.out.println(a[i]);
      }
        int x = (10 % 3) * 5;
        int y = 4 / 2 + 8 * 4 - ( 5+ 2 ) % 3;
        System.out.println(x );
        System.out.println(y );*/
        int x = 5;
        x *= 6;
        System.out.println(x );
    }

}

