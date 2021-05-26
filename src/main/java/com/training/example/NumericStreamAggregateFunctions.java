package com.training.example;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateFunctions {

  public static void main(String[] args) {

    int intStream = IntStream.rangeClosed(1,50)
        .sum();
    System.out.println("Sum of value is : "+intStream);

    OptionalInt optionalInt = IntStream.rangeClosed(1,50).max();

    System.out.println(optionalInt.isPresent() ? optionalInt.getAsInt() : 0);

    OptionalLong optionalLong = LongStream.rangeClosed(1,100).min();

    System.out.println(optionalLong.isPresent() ? optionalLong.getAsLong() : 0);

    OptionalDouble optionalDouble = IntStream.rangeClosed(1,50).average();

    System.out.println(optionalDouble.isPresent() ? optionalDouble.getAsDouble() : 0);
  }

}
