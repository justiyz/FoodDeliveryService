package com.servbytefooddelivery.other_exercises.thinking_in_java.chapter6;

/* Create two packages: debug and debugoff, containing an identical class with a
 * debug() method. The first version displays its String argument to the console,
 * the second does nothing. Use a static import line to import the class into a test
 * program, and demonstrate the conditional compilation effect.
 */

/* In directory access/debugoff:
 * // access/debugoff/Debug.java
 * package access.debugoff;
 *
 * public class Debug {
 *	public static void debug(String s) { }
 * }
 */

public class Chapter6Exercise3 {
    public static void debug(String s) {
        System.out.println(s);
    }
}
