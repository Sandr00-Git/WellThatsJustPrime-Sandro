package org.example;

import java.util.ArrayList;

public class Factorizer {
    public ArrayList<Integer> primeFactors(Integer n) {
        ArrayList<Integer> factors = new ArrayList<>();

        if (n <= 1) {
            return factors;
        }

        int i = 2;
        while (i <= n) {
            if (n % i == 0) {
                factors.add(i);
                n = n / i;
            } else {
                i++;
            }
        }

        return factors;
    }
}
