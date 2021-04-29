package com.servbytefooddelivery.other_exercises.thinking_in_java.chapter2;

public class Chapter2Exercise1 {

    // Create a class containing an int and a char that are not initialize
    // and print their values to verify that Java performs default initialization.


    int i;
    char c;

    public static void main(String[] args) {
        Chapter2Exercise1 obj = new Chapter2Exercise1();
        System.out.println("int i = " + obj.i);
        System.out.println("char c = " + obj.c);
    }

}
