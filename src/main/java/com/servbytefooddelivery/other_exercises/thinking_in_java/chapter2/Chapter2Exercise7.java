package com.servbytefooddelivery.other_exercises.thinking_in_java.chapter2;

//Question
// Turn the Incrementable code fragments into a working program.

class StaticTest{
    static int i = 47;
}

class Incrementable{
    static void increment() {
        StaticTest.i++;
    }
}

public class Chapter2Exercise7 {
    public static void main(String[] args) {
        System.out.println("StaticTest.i= " + StaticTest.i);
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        System.out.println("st1.i= " + st1.i);
        System.out.println("st2.i= " + st2.i);
        Incrementable sf = new Incrementable();
        sf.increment();
        System.out.println("After sf.increment() called: ");
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
        Incrementable.increment();
        System.out.println("After Incrementable.increment called: ");
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
    }

}




