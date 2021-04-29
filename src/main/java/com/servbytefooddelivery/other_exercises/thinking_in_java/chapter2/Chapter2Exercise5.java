package com.servbytefooddelivery.other_exercises.thinking_in_java.chapter2;

public class Chapter2Exercise5 {
    //Question
    // Modify the previous exercise so that the values of the data in DataOnly are
    // assigned to and printed in main().

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
        data.i = 234;
        data.d = 2.1234545;
        data.b = true;
        data.show();
    }
}
