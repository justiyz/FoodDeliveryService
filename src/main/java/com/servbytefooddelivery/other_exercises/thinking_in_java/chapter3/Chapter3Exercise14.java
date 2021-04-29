package com.servbytefooddelivery.other_exercises.thinking_in_java.chapter3;

/* Write a method that takes two String arguments uses all the boolean
 * comparisons to compare the two Stings and print the results. For the == and
 * !=, also perform the equals() test. In main(), test your method with some
 * different String objects.
 */


public class Chapter3Exercise14 {

    static void f(boolean b) {
        if(b == true){
            System.out.println(true);
        }
    else {
            System.out.println(false);
        }
    }
    static void stringTest(String s, String t) {
        f(s == t);
        f(s.equals(t));
        f(t.equals(s));
        f(s != t);
        // f(!s);
        //f(!t);
        // s = s && t;
        // s = s || t;
        // s = ~t;
        // s = s  & t;
        // s = s | t;
        // s = s ^ t;
        // s &= t;
        // s ^= t;
        // s |= t;
    }
    public static void main(String[] args) {
        String s = "one", t = "two";
//        StringWork.stringTest(s, t);
    }
}
