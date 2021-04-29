package com.servbytefooddelivery.other_exercises.thinking_in_java.chapter3;

//QUESTION
// Write a program that simulates coin-flipping



import java.util.Random;

public class Chapter3Exercise7 {

        public static void main(String[] args) {
            Random rand = new Random();
            int coin = rand.nextInt();
            if(coin % 2 == 0){
                System.out.println("heads");
            }
            else System.out.println("tails");
        }

}
