package com.servbytefooddelivery.other_exercises.thinking_in_java.chapter5;

// Create a class with two (overloaded) constructors. Using 'this', call
// the second constructor from inside the first one.

class Doc1 {
    Doc1(int i) {
        this("MD");
        int yearsTraining = i;
        System.out.println("New doc with " + i + " years of training");
    }
    Doc1(String s) {
        String degree = s;
        System.out.println("New doc with " + s + " degree");
    }
    void intubate() {
        System.out.println("prepare patient");
        laryngoscopy();
    }
    void laryngoscopy() {
        System.out.println("use laryngoscope");
    }
}

public class Chapter5Exercise9 {
    public static void main(String[] args) {
        new Doc1(8).intubate();
    }
}
