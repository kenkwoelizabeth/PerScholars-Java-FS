package com.perscholas.java_basics;

public class BinaryOperator {
    public static void main(String[] args) {
        toBinary(787);
        toBinary(9);
        toBinary(17);
        toBinary(88);


        toBinary1(150);
        toBinary1(255);
        toBinary1(1555);
        toBinary1(32456);
    }
        public static void toBinary(int x){
        System.out.println(Integer.toBinaryString(x));
        System.out.println(x<<1);
    }
    public static void toBinary1(int x){
        System.out.println(Integer.toBinaryString(x));
        System.out.println(x>>2);
    }
    /*   // toBinary2();
        increment();
    }
        public static void toBinary2(){
           int x=7;
           int y=17;

            // bitwise and
            // 0101 & 0111=0101 = 5
           int z=x &= y;

            // bitwise or
            // 0101 | 0111=0111 = 7
           int a= x |=y;
            System.out.println(z);
            System.out.println(a);



            public static void increment(){
                    int var1 = 5;
                    int var2 = 8;

                    // 5 is displayed
                    // Then, var1 is increased to 6.
                    System.out.println(var1++);

                    // var2 is increased to 6
                    // Then, var2 is displayed
                    System.out.println(++var2);
                     System.out.println(var1+=var2);*/
                }
