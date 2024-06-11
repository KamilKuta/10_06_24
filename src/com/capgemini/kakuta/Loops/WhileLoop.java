package com.capgemini.kakuta.Loops;

import com.capgemini.kakuta.DiceJack.RollTheDice;

import java.util.Random;

public class WhileLoop {
    public static void main(String[] args) {
        Random random = new Random();
        int number = 4;

        while (number>3){
            number = random.nextInt(0, 10);
            System.out.println(number);
        }
    }
}
