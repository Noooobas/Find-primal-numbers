package com.company.test1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello! Primal numbers are: ");
        getPrimalNumbers();

    }
    // Checks every odd number starting from 3
    private static void getPrimalNumbers(){

        ArrayList<Integer> primalNumbers= new ArrayList<>();
        primalNumbers.add(1);
        primalNumbers.add(2);
        boolean isPrimal;

        // Skips every even number, because they always can be divided by 2
        for (int i =3; i <= 100; i+=2){
            isPrimal = true;
            for (int j =3; j <i; j+=2){
                if (i%j == 0) {
                    // if not primal, stop further check and mark as not primal
                    isPrimal = false;
                    break;
                }
            }
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

    }

}
