package com.servbytefooddelivery.other_exercises.thinking_in_java.chapter5;

/* Create a class with two methods. Within the first method, call the
 * second method twice: the first time without using this, and the second time
 * using this - just to see it working; you should not use this form in
 * practice.
 */

class Doc {
    void intubate() {
        System.out.println("prepare patient");
        laryngoscopy();
        this.laryngoscopy();
    }
    void laryngoscopy() {
        System.out.println("use laryngoscope");
    }
}
public class Chapter5Exercise8 {

    public static void main(String[] args) {
        new Doc().intubate();
    }
}
