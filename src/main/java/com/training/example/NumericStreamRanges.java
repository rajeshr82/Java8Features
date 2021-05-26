package com.training.example;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRanges {

  public static void main(String[] args) {

    IntStream intStream= IntStream.range(1,10);
    System.out.println("IntStream Range()"+intStream.count());
    System.out.println();
    IntStream.range(1,10).forEach(value -> System.out.print(","+value));
    System.out.println();

    IntStream intStreamClosed= IntStream.rangeClosed(1,10);
    System.out.println("IntStream RangeClosed()"+intStreamClosed.count());
    System.out.println();
    System.out.println("IntStream RangeClosed()");

    IntStream.rangeClosed(1,10).forEach(value -> System.out.print(value+","));

    LongStream longStream = LongStream.range(1,10);
    System.out.println();
    System.out.print("longStream Range Count :"+longStream.count());

    System.out.println();
    System.out.println("longStream RangeClosed Values ");
    LongStream.rangeClosed(1,10).forEach(value -> System.out.print(value+","));


    System.out.println("Double Stream  Range of Values as DoubleStream");

    IntStream.rangeClosed(1,10).asDoubleStream().forEach(dValue -> System.out.print(dValue+","));
  }
}
