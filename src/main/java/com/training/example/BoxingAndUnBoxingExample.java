package com.training.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingAndUnBoxingExample {

  private static List<Integer> boxing(){

    return IntStream.rangeClosed(1,10)
        .boxed()
        .collect(Collectors.toList());
  }

  public static double unBoxing(List<Integer> boxingInt){

     return boxingInt.stream(). // Stream<Integer> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        mapToInt(Integer::intValue)
        .average()
         .getAsDouble();
  }

  public static int unBoxingMaxValue(List<Integer> boxingInt){

    return boxingInt.stream(). // Stream<Integer> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        mapToInt(Integer::intValue)
        .max()
        .getAsInt();
  }

  public static int unBoxingMixValue(List<Integer> boxingInt){

    return boxingInt.stream(). // Stream<Integer> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        mapToInt(Integer::intValue)
        .min()
        .getAsInt();
  }

  public static long unBoxingCount(List<Integer> boxingInt){

    return boxingInt.stream(). // Stream<Integer> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        mapToInt(Integer::intValue)
        .count();

  }




  public static void main(String[] args) {

    List<Integer> boxingInt = boxing();
    System.out.println("Boxing"+boxingInt);

    System.out.println("unBoxing : "+unBoxing(boxingInt));

    System.out.println("unBoxingMaxValue  : "+ unBoxingMaxValue(boxingInt));

    System.out.println("unBoxingMinValue  : "+ unBoxingMixValue(boxingInt));

    System.out.println("unBoxingCount  : "+ unBoxingCount(boxingInt));



  }


}
