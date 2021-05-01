package com.servbytefooddelivery.other_exercises.thinking_in_java.chapter5;

/* Create a class without a constructor, and then create an object of that
 * class in main() to verify that the default constructor is automatically
 * synthesized.
 */

class Aso {
    void bark() {System.out.println("woof");}
}

public class Chapter5Exercise7 {
    public static void main(String[] args) {
        Aso a = new Aso();
        a.bark();
    }
}
