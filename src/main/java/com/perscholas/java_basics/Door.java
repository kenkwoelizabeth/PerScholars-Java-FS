package com.perscholas.java_basics;

public class Door {
    Boolean isOpen;

    public static void main(String[] args) {
        Door s = new Door();
        //s.close();

        if (s.isOpen) {
            System.out.println("Door is open");
        } else {

            System.out.println("Door is closed");


        }
    }
        void open () {
            isOpen = true;
        }
        void close () {
            isOpen = false;

        }
    }

