package edu.cnm.deepdive;


import java.util.ArrayList;

public class SieveOfEratosthenes {

  public boolean[] getAll(int endValue) {
    // 1. Write down all of the positive integers from 2 to the upper limit of the given range of
    //    numbers, in order
    //
    // We will represent these numbers as a boolean array initially marked as all true that we can
    // "cross off", i.e. set to false. The array index will equate to each number value.
    boolean[] primes = new boolean[endValue + 1];
    for (int i = 0; i < primes.length; i++) {
      primes[i] = true;
    }

    //2. Starting with the number 2, and proceeding in order to the largest integer less than or
    //   equal to the square root of the upper limit, do the following with each number:
    for (int i = 2; i <= Math.sqrt(endValue); i++) {
      // If the current number is not crossed-out
      if (primes[i]) {
        // For all integral multiples of the current number, starting with its square, but not
        // exceeding the upper limit
        for (int j = i * i; j < primes.length; j += i) {
          //Cross the multiple off the list.
          primes[j] = false;
        }
      }
    }

    // 3. Every number in the list that isn't crossed-out is prime.
    return primes;
  }

  public ArrayList<Integer> getPrimes(int endValue) {
    ArrayList<Integer> onlyPrimes = new ArrayList<>();
    boolean[] allPrimes = getAll(endValue);

    for(int i = 0; i < allPrimes.length; i++) {
      if (allPrimes[i]) {
        onlyPrimes.add(i);
      }
    }
    return onlyPrimes;
  }
}
