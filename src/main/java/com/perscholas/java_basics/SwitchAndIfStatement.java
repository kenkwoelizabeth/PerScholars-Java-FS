package com.perscholas.java_basics;
import java.util.Scanner;
public class SwitchAndIfStatement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter your First Number : ");
        int num1 = s.nextInt();
        System.out.print("Enter your Second Number : ");
        int num2 = s.nextInt();
        System.out.print("Enter operator (+, -, *, /) :");
        char operator = s.next().charAt(0);
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;

      /*  switch (operator) {
            case '+': {
                System.out.print("Total after Addition is : " + addition);
                break;
            }
            case '-': {
                System.out.print("Total after Subtraction is : " + subtraction);
                break;
            }
            case '*': {
                System.out.print("Total after Multiplication is : " + multiplication);
                break;
            }
            case '/': {
                System.out.print("Total after Division is : " + division);
                break;
            }
            default: {
                System.out.print("Please select proper operator");
                return;
            }
        } */

        if (operator == '+') {
            System.out.println("Total after Addition is : " + addition);
        } else if (operator == '-') {
            System.out.println("Total after Subtraction is : " + subtraction);
        } else if (operator == '*') {
            System.out.println("Total after Multiplication is : " + multiplication);
        } else if (operator == '/') {
            System.out.println("Total after Division is : " + division);
        } else {
            System.out.println("Please select proper operator");
        }

    }
}

