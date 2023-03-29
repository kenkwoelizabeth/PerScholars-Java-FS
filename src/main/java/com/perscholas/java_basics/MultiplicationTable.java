package com.perscholas.java_basics;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
      /*  int n = 12;

        for (int i = 1; i <= n; i++) {
          //  for (int j = 1; j <= n; j++) {
                System.out.println(i*n);
            }


            System.out.println( );
        }
    } */



                Scanner sc=new Scanner(System.in);
        System.out.println("Yes");
                String A=sc.next();
                /* Enter your code here. Print output to STDOUT. */
                String reverse="";

                for (int i=A.length()-1; i>=0; i--) {
                    reverse = reverse + A.charAt(i);
                }
                    if(reverse.equals(A)){
                        System.out.println("Yes");
                    }else{
                        System.out.println("No");


                }
            }
        }





