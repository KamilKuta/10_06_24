package com.capgemini.kakuta;

import com.capgemini.kakuta.DiceJack.RollTheDice;

public class Main {

    public static void main(String[] args) {
        int userNumber1 = RollTheDice.rollTheDice();
        int userNumber2 = RollTheDice.rollTheDice();
        int userNumber3 = RollTheDice.rollTheDice();

        int userSum = RollTheDice.sumOfPickedNumbers(userNumber1, userNumber2, userNumber3);

        int mineNumber1 = RollTheDice.rollTheDice();
        int mineNumber2 = RollTheDice.rollTheDice();
        int mineNumber3 = RollTheDice.rollTheDice();

        int mineSum = RollTheDice.sumOfPickedNumbers(mineNumber1, mineNumber2, mineNumber3);


        System.out.println("User picked up a sum of: " + userSum);
        System.out.println("I picked up a sum of: " + mineSum);

        RollTheDice.compareResults(userSum, mineSum);
    }
}
