package com.servbytefooddelivery.other_exercises.thinking_in_java.chapter5;


/* Create a main() that uses varargs instead of the ordinary main() syntax. Print
 * all the elements in the resulting args array. Test it with various numbers of
 * command-line arguments.
 */
public class Chapter5Exercise20 {
    public static void main(String... args) {
        for(String s : args)
            System.out.print(s + " ");
        System.out.println();
    }
}
