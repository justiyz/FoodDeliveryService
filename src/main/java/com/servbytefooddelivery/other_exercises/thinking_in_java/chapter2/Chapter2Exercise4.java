package com.servbytefooddelivery.other_exercises.thinking_in_java.chapter2;

public class Chapter2Exercise4 {

    //Question
    // Turn the DataOnly code fragments into a program that compiles and runs

    public static void main(String[] args) {
        class DataOnly {
            int i;
            double d;
            boolean b;
            void show() {
                System.out.println(i);
                System.out.println(d);
                System.out.println(b);
            }
        }
        DataOnly data = new DataOnly();
        data.i = 3;
        data.d = 2.71828;
        data.b = false;
        data.show();
    }
}
