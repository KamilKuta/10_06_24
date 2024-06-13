package com.capgemini.kakuta.Arrays;

import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int[] numbers2 = numbers;

        numbers2[1] = 5;
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers2));

        String[] staffLastYear = {"Tommy", "Joel", "Ellie"};
        String[] staffThisYear = staffLastYear;
        staffThisYear[1] = "Abby";

        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));

        //Solution to avoid reference TRAP is to create a new empty list and copy/paste old list into the new one by for loop
        String[] staff = {"Tommy", "Joel", "Ellie"};
        //Could be the same size of array list or extended if we want to make a room for other variables.
        String[] newStaff = new String[5];

        for (int i = 0; i < staff.length; i++) {
            newStaff[i] = staff[i];
        }
        System.out.println(Arrays.toString(newStaff));
    }
}
