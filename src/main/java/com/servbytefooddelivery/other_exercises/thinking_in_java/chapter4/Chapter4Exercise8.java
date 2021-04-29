package com.servbytefooddelivery.other_exercises.thinking_in_java.chapter4;

/* Create a switch statement that prints a message for each case, and put the
 * switch inside a for loop that tries each case.  Put a break after each case
 * and test it, then remove the breaks and see what happens.
 */

public class Chapter4Exercise8 {
    public static void main(String[] args) {
        for(int i = 0; i < 11; i++) {
            switch(i) {
                case 0:
                    System.out.println("zero"); break;
                case 1:
                    System.out.println("isa");
                    break;
                case 2:
                    System.out.println("dalawa");
                    break;
                case 3:
                    System.out.println("tatlo");
                    break;
                case 4:
                    System.out.println("apat");
                    break;
                case 5:
                    System.out.println("lima");
                    break;
                case 6:
                    System.out.println("anim");
                    break;
                case 7:
                    System.out.println("pito");
                    break;
                case 8:
                    System.out.println("walo");
                    break;
                case 9:
                    System.out.println("siyam");
                    break;
                default:
                    System.out.println("default");
            }
        }
    }
}
