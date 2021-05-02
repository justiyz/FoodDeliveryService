package com.servbytefooddelivery.other_exercises.thinking_in_java.chapter5;

/* Create an array of String objects and assign a String to each element. Print
 * the array by using an forloop.
 */

public class Chapter5Exercise16 {
    public static void main(String[] args) {
        String[] s = { "one", "two", "three", };
        for(int i = 0; i < s.length; i++)
            System.out.println("s[" + i + "] = " + s[i]);
    }
}
