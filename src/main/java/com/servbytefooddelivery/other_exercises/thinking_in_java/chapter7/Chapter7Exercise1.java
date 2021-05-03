package com.servbytefooddelivery.other_exercises.thinking_in_java.chapter7;

/* Create a simple class. Inside a second class, define a reference to an object of
 * the first class. Use lazy initialization to instantiate this object.
 */

class Engine {
    private String s;
    Engine() {
        System.out.println("Engine()");
        s = "Constructed";
    }
    public String toString() { return s; }
}

public class Chapter7Exercise1 {
    private String fuselage, wings, tail;
    private Engine e;

    public Chapter7Exercise1() {
        System.out.println("Inside Airplane()");
        fuselage = "Body";
        wings = "Airfoils";
        tail = "Empennage";
    }

    public String toString() {
        if(e == null) // lazy (delayed) initialization:
            e = new Engine();
        return "fuselage = " + fuselage + ", " +
                "wings = " + wings + ", " +
                "tail = " + tail + ", " +
                "Engine = " + e;
    }
    public static void main(String[] args) {
        Chapter7Exercise1 N1234 = new Chapter7Exercise1();
        System.out.println(N1234);
    }
}
