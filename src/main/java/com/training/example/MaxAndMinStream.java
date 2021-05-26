package com.training.example;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 *
 */
public class MaxAndMinStream {

  public static Optional<Integer> findMaxValue(List<Integer>  integerList){

    return integerList.stream()
        .reduce((x,y) -> x > y ? x : y);
  }

  public static Optional<Integer> findMinValue(List<Integer>  integerList){

    return integerList.stream()
        .reduce((x,y)-> x < y ? x : y);
  }
  public static void main(String[] args) {

    List<Integer> integerList = Arrays.asList(6, 7, 8, 10);
    List<Integer> integerListEmpty = Arrays.asList();

    Optional<Integer> optionalInteger = findMaxValue(integerList);

    System.out.println("FindMaxValue :" + findMaxValue(integerListEmpty));
    if (optionalInteger.isPresent()) {
      System.out.println("FindMaxValue :" + optionalInteger.get());
    } else {
      System.out.println("Empty list ");
    }

    Optional<Integer> minIntValue = findMinValue(integerList);
    if (minIntValue.isPresent()) {
      System.out.println("findMinvalue : " + minIntValue.get());
    }
  }
}
