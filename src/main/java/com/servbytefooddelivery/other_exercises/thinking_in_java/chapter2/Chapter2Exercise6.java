package com.servbytefooddelivery.other_exercises.thinking_in_java.chapter2;

public class Chapter2Exercise6 {

    // Write a program that includes and calls the storage() method defined as a
    // code fragment in this chapter.


        public static void main(String[] args) {
            class StoreStuff {
                int storage(String s) {
                    return s.length() * 2;
                }
            }
            StoreStuff x = new StoreStuff();
            System.out.println(x.storage("hi"));
        }
}
