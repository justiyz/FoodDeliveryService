package com.servbytefooddelivery.other_exercises.thinking_in_java.chapter7;

/* Prove that base-class constructors are (a) always called and (b) called before
 * derived-class constructors.
 */


class A { A(){
    System.out.println("A()");} }

class B extends A { B(){
    System.out.println("B()");} }

class C extends B { C(){
    System.out.println("C()");} }

class D extends C {
    D() {
        System.out.println("D()"); }
    public static D makeD() { return new D(); }
    public static void main(String[] args) {
        D d = new D();
        D d2 = makeD();
    }
}
public class Chapter7Exercise4 {
    Chapter7Exercise4() {
        System.out.println("E()"); }
    public static void main(String[] args) {
        Chapter7Exercise4 e = new Chapter7Exercise4();
        // test D:
        D.main(args);
    }
}
