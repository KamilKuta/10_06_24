package com.capgemini.kakuta.DiceJack;

import java.util.Random;

public class RollTheDice {
    static Random randomNumber;
    static int Number01;

    public static int rollTheDice() {
        randomNumber = new Random();
        return Number01 = randomNumber.nextInt(1, 9);
    }

    public static int sumOfPickedNumbers(int number01, int number02, int number03) {
        return number01+number02+number03;
    }

    public static void compareResults(int result01, int result02){
        if (result01 > result02){
            System.out.println("Player with sum of the results: " + result01 + ", WIN!!!");
        }
        else if (result01 < result02) {
            System.out.println("Player with sum of the results: " + result02 + ", WIN!!!");
        }
        else
            System.out.println("Results are the same!!!");

    }
}
