package com.perscholas.java_basics;

public class PracticeClass {

    public static final double PI = 3.14159;

    public static void main(String[] args){
       //question 1
        int x=20;
        int y=50;
        int sum1=x +y;
        System.out.println(sum1);

        double a=20.5;
        double b=50.25;
        double sum2=a +b;
        System.out.println(sum2);

        int c=20;
        double d=50.25;
        double sum3=c + d ; // it must be double
        System.out.println(sum3);

        int e=20;
        double f=50.60;  // change the f and sum4  to double
        double sum4 = f/e;
        System.out.println(sum4);

        double g=20.5;
        double h=50.25;
        double sum5=(h /g);
        double sum6=(int)(h/g);
        System.out.println(sum5);
        System.out.println(sum6);

        int x1=5;
        int y1=6;
        int q=y1/x1;
        System.out.println(q);
        int y3=y1;
        int q2=y3/x1;
        System.out.println(q2);

        double radius;
        double area;
        // Assign a radius
        radius = 20;
        // Compute area
        area = radius * radius * PI;
        // Display results
        System.out.println("The area for the circle of radius " + radius + " is " + area);

        /* Write a program where you create 3 variables that represent products at a cafe.
        The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
        Assign prices to each product. Create 2 more variables called subtotal and totalSale
        and complete an “order” for 3 items of the first product, 4 items of the second product,
         and 2 items of the third product. Add them all together to calculate the subtotal.
         Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the
         totalSale amount. Be sure to format the results to 2 decimal places.
         */
             double cappuccino= 12.50;
             double espresso= 10.25;
             double greenTea= 8.34;
             double subTotal= (3 * cappuccino) + (4 * espresso) + (2 * greenTea);
             double salesTax=.03 * subTotal;
             double totalSale=salesTax + subTotal;
             System.out.printf("Your total price for the coffee is " + "%.2f", totalSale);
    }
}
