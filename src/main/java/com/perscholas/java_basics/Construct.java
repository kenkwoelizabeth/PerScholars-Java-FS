package com.perscholas.java_basics;

public class Construct {
// just constructor
    String carName;
    String carColor;
    String carSize;


    public Construct(String n, String c, String s) {
       this.carName = n;
       this.carColor = c;
       this.carSize=s;

    }
   void car(){
       System.out.println("The color of the " + this.carName + " car  is " + this.carColor + " and the size is " + this.carSize );
   // inside a method you use this.whatever

   }
    // To do it in method
    public static void main(String[] args) {
        Construct we = new Construct("Toyota", "Red", "Big");
        System.out.println("The color of the " + we.carName + " car  is " + we.carColor );
        we.car(); // call the method


    }

}