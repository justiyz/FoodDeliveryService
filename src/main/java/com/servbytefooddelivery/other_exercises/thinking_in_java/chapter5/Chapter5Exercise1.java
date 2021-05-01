package com.servbytefooddelivery.other_exercises.thinking_in_java.chapter5;

// Create a class containing an uninitialized String reference. Demonstrate that // this reference is initialized by Java to null.

class Tester {
    String s;
}

public class Chapter5Exercise1 {

    public static void main(String[] args) {
        Tester t = new Tester();
        System.out.println(t.s);
    }
}
