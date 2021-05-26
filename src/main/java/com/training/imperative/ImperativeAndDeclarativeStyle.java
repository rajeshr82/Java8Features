package com.training.imperative;

import java.util.stream.IntStream;

/**
 *
 */
public class ImperativeAndDeclarativeStyle {

  public static void main(String[] args) {

    /**
     *  Imperative style of programing :
     *  Use case : Sum of 0 to 100
     */

    int sum = 0;

    for (int i = 0; i <=100; i++) {
      sum += i;
    }
    System.out.println("Imperative  Style of Approach :" + sum);

    /**
     * Declarative style of programming
     *  Use case : Sum of 0 to 100
     */

     int sum1 = IntStream.rangeClosed(0,100).sum();

    System.out.println("Declarative Style of Approach :"+sum1);

  }

}
