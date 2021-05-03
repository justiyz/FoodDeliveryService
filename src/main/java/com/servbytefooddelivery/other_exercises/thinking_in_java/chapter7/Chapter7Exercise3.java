package com.servbytefooddelivery.other_exercises.thinking_in_java.chapter7;

/* Prove the previous sentence. (Even if you don't create a constructor for
 * Cartoon(), the compiler will synthesize a default constructor for you that
 * calls the base-class constructor.
 */

class Art {
    Art() {
        System.out.println("Art constructor"); }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing constructor"); }
}
public class Chapter7Exercise3 {
    public static void main(String[] args) {
        Chapter7Exercise3 x = new Chapter7Exercise3();
    }
}
