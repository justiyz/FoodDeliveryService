package com.servbytefooddelivery.other_exercises.thinking_in_java.chapter5;

// Create a class wih a String that is initialized using instance initialization

class Tester1 {
    String s;
    {
        s = "Initializing string in Tester1";
        System.out.println(s);
    }
    Tester1() {
        System.out.println("Tester1()");
    }
}
public class Chapter5Exercise15 {
    public static void main(String[] args) {
        new Tester1();
    }
}
