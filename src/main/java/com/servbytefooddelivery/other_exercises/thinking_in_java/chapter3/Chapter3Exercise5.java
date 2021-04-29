package com.servbytefooddelivery.other_exercises.thinking_in_java.chapter3;

//Question
/* Create a class called Dog containing two Strings: name and says.
 * In main(), create two dog objects with names "spot" (who says "Ruff!") and
 * "scruffy" (who says "Wurf!").  Then display their names and what they say.
 */

class Dog {
    String name;
    String says;

    void setName(String n) {
        name = n;
    }

    void setSays(String s) {
        says = s;
    }

    void showName() {
        System.out.println(name);
    }

    void speak() {
        System.out.println(says);
    }
}

public class Chapter3Exercise5 {
    public static void main(String[] args) {
        Dog spot = new Dog();
        spot.setName("Spot");
        spot.setSays("Ruff!");
        Dog scruffy = new Dog();
        scruffy.setName("Scruffy");
        scruffy.setSays("Wurf!");
        spot.showName();
        spot.speak();
        scruffy.showName();
        scruffy.speak();
    }

}
