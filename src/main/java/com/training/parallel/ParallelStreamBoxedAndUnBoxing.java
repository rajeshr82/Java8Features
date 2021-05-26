package com.training.parallel;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamBoxedAndUnBoxing {

  public static void sequentialSum(List<Integer> integerList){
    long startTime = System.currentTimeMillis();
    int sum= integerList.stream()
        .reduce(0,(x,y)-> x+y);
    long endTime = System.currentTimeMillis();
    System.out.println("Duration in SequentialSum :"+sum +"::"+(endTime-startTime));
  }

  public static void parallelSum(List<Integer> integerList){
    long startTime = System.currentTimeMillis();
    int sum= integerList
        .parallelStream()
        .reduce(0,(x,y)-> x+y);// performing the unboxing from integer to int.
    long endTime = System.currentTimeMillis();
    System.out.println("Duration in parallelSum :"+sum + "::"+(endTime-startTime));
  }


  public static void main(String[] args) {

    // Conversion of int to Wrapper class is called Boxing
    List<Integer> integerList= IntStream.rangeClosed(1,10000)
        .boxed()
        .collect(Collectors.toList());


   sequentialSum(integerList);
    parallelSum(integerList);

  }
}
