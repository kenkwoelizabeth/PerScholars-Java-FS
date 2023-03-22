package com.perscholas.java_basics;

public class Encapsulation {
    private int age;
    private String name;


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


        public static void main (String[]args){
            Encapsulation sa = new Encapsulation();
              sa.setAge(20);
              sa.setName("Lizzy");

            System.out.println(sa.getName() + " is " + sa.getAge() + " years old " );

        }
}




