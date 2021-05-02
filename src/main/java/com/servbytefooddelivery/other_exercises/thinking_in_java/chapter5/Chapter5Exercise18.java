package com.servbytefooddelivery.other_exercises.thinking_in_java.chapter5;

/* Attach objects to the references in array in exercise 17: Create a class with
 * a constructor that takes a String argument. During constriction, print the
 * argument. Create and array of object references to this class, but don't
 * actually create objects to assign into the array. When you run the program,
 * notice whether the initialization messages from the constructor are printed.
 */

class InitTest1 {
    InitTest1(String s) {
        System.out.println("InitTest1()");
        System.out.println(s);
    }
}
public class Chapter5Exercise18 {
    public static void main(String[] args) {
        InitTest1[] it = new InitTest1[5];
        for(int i = 0; i < it.length; i++)
            it[i] = new InitTest1(Integer.toString(i));
    }
}
