package com.servbytefooddelivery.other_exercises.thinking_in_java.chapter2;

public class Chapter2Exercise3 {

    //Question:
    // Find the code fragments involving ATypeName and turn them into a program
    // that compiles and runs.

    public static void main(String[] args) {
        class ATypeName {
            int i;
            double d;
            boolean b;
            void show() {
                System.out.println(i);
                System.out.println(d);
                System.out.println(b);
            }
        }
        ATypeName a = new ATypeName();
        a.i = 3;
        a.d = 2.71828;
        a.b = false;
        a.show();
    }
}
