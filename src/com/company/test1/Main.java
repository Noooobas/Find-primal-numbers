package com.company.test1;

import java.util.ArrayList;

public class Main {

    static int itercount;

    public static void main(String[] args) {

        System.out.println("Hello! Primal numbers are: ");
        getPrimalNumbers();

    }
    // Checks every odd number starting from 3
    private static void getPrimalNumbers(){

        ArrayList<Integer> primalNumbers = new ArrayList<>();
        primalNumbers.add(2);
        boolean isPrimal;
        itercount = 0;

        // Skips every even number, because they always can be divided by 2
        for (int i =3; i <= 100; i+=2){
            isPrimal = true;
            itercount++;
            if (i>7 && (i % 3 == 0 || i % 5 == 0 || i % 7 == 0)) isPrimal = false;
            // Will fail if number is not primal
            if (isPrimal) {
                // Add current number as next element of the array list
                primalNumbers.add(i);
            }
        }

        showPrimalNumbers(primalNumbers);
    }

    // Prints values of array list and their count
    private static void showPrimalNumbers(ArrayList primalNumbers){
        System.out.println(primalNumbers);
        System.out.println(primalNumbers.size() + " numbers in total");
        System.out.println("Amount of iterations: "+ itercount);

    }

}
