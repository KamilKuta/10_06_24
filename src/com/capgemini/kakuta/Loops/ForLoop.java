package com.capgemini.kakuta.Loops;

public class ForLoop {
    public static void main(String[] args) {

        System.out.println("Single for loop: ");
        for (int i = 1; i < 10; i *= 2) {
            System.out.println(i);
        }

        System.out.println("Nested for loop: ");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
