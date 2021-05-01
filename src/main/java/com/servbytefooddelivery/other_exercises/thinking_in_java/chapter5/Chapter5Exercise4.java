package com.servbytefooddelivery.other_exercises.thinking_in_java.chapter5;

/* Add an overloaded constructor to the previous exercise that takes a String argument and prints it along with your message.*/

class Kabayo2 {
    Kabayo2() {
        System.out.println("isa lang kabayo");
    }
    Kabayo2(String s) {
        System.out.println(s);
    }
}

public class Chapter5Exercise4 {
    public static void main(String[] args) {
        Kabayo2 k = new Kabayo2();
        Kabayo2 k2 = new Kabayo2("tumutugtog ng gitara");
    }
}
