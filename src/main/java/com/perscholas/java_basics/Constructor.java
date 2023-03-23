package com.perscholas.java_basics;
// Constructor and Encapsulation
public class Constructor {
    private String carName;
    private String carColor;


    public Constructor(String n, String c) {
        carName = n;
        carColor = c;


    }

    public void setName(String n) {
        carName = n;
    }


    public String getName() {
        return carName;
    }


    public void setColor(String c) {
        carColor = c;
    }


    public String getColor() {
        return carColor;
    }

    public static void main(String[] args) {
        Constructor we = new Constructor("Toyota", "Red");
        System.out.println("The color of the " + we.getName() + " car  is " + we.getColor() );


    }
}