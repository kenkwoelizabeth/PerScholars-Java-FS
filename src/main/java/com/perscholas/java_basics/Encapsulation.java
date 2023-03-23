package com.perscholas.java_basics;

public class Encapsulation {
    private int age;
    private String name;
    private int height;
    private int width;

    public void setAge(int a) {
        age = a;
    }


    public int getAge() {
        return age;
    }


    public void setName(String n) {
        name = n;
    }


    public String getName() {
        return name;
    }
    public void setHeight(int h) {
        height = h;
    }


    public int getHeight() {
        return height;
    }
    public void setWidth(int w) {
        width = w;
    }


    public int getWidth() {
        return width;
    }


        public static void main (String[]args){
            Encapsulation sa = new Encapsulation();
              sa.setAge(20);
              sa.setName("Lizzy");
              sa.setHeight(50);
              sa.setWidth(10);
              int rectangleArea= sa.getHeight() * sa.getWidth();
            System.out.println(sa.getName() + " is " + sa.getAge() + " years old " );
            System.out.println( "The area of the rectangle is " + rectangleArea);

        }
}




