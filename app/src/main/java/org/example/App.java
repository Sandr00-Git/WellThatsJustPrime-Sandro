package org.example;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Factorizer factorizer = new Factorizer();

        int[] testNumbers = {0, 1, 9, 10, 17, 100};

        for (int num : testNumbers) {
            ArrayList<Integer> factors = factorizer.primeFactors(num);
            System.out.println("Prime factors of " + num + " are: " + factors);
        }
    }
}
