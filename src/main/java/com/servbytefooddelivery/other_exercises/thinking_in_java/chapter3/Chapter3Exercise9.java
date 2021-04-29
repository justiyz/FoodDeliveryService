package com.servbytefooddelivery.other_exercises.thinking_in_java.chapter3;


// Display the largest and smallest numbers for both float and double
// exponential notation.


public class Chapter3Exercise9 {

    public static void main(String[] args) {
        double max = java.lang.Double.MAX_VALUE;
        System.out.println("Max double = " + max);
        double min = java.lang.Double.MIN_VALUE;
        System.out.println("Min double = " + min);
        float maxf = java.lang.Float.MAX_VALUE;
        System.out.println("Max float = " + maxf);
        float minf = java.lang.Float.MIN_VALUE;
        System.out.println("Min float = " + minf);
    }
}
