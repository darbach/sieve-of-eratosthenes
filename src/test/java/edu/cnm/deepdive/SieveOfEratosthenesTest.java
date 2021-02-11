package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class SieveOfEratosthenesTest {

  private SieveOfEratosthenes sieve = new SieveOfEratosthenes();
  private int[] testCasePrimes = {
      0, 1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
  };
  private boolean[] testCaseAll = {
      true,   //0
      true,   //1
      true,   //2
      true,   //3
      false,  //4
      true,   //5
      false,  //6
      true,   //7
      false,  //8
      false,  //9
      false,  //10
      true,   //11
      false,  //12
      true,   //13
      false,  //14
      false,  //15
      false,  //16
      true,   //17
      false,  //18
      true,   //19
      false,  //20
      false,  //21
      false,  //22
      true,   //23
      false,  //24
      false,  //25
      false,  //26
      false,  //27
      false,  //28
      true,   //29
      false,  //30
      true,   //31
      false,  //32
      false,  //33
      false,  //34
      false,  //35
      false,  //36
      true,   //37
      false,  //38
      false,  //39
      false,  //40
      true,   //41
      false,  //42
      true,   //43
      false,  //44
      false,  //45
      false,  //46
      true,   //47
      false,  //48
      false,  //49
      false   //50
  };

  @Test
  void getAll() {
    boolean[] sieveValues = sieve.getAll(50);
    System.out.println("Testing .getAll() method...");
    for (int i = 0; i < sieveValues.length; i++) {
      boolean expected = testCaseAll[i];
      boolean actual = sieveValues[i];
      System.out.printf("[%d] EXPECTED: %s; ACTUAL: %s%n", i, expected, actual);
      assertEquals(expected, actual);
    }

  }

  @Test
  void getPrimes() {
    ArrayList<Integer> sieveValues = sieve.getPrimes(50);
    System.out.println("Testing .getPrimes() method...");
    for (int i = 0; i < sieveValues.size(); i++) {
      Integer expected = testCasePrimes[i];
      Integer actual = sieveValues.get(i);
      System.out.printf("EXPECTED: %s; ACTUAL: %s%n", expected, actual);
      assertEquals(expected, actual);
    }
  }
}