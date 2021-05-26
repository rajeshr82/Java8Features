package com.training.example;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreams {

  public static int sumOfNumbers(List<Integer>  integerList){

    return integerList.stream()
        .reduce(0,(x,y)-> x+y); // unboxing to convert integer to int
  }

  public static int sumOfNumberINteStream(){
    return IntStream.rangeClosed(1,6)
        .sum();

  }

  public static OptionalDouble sumOfNumberDoubleStream(){

    return DoubleStream.of(1.2,1.0,1.5)
        .average();
  }

  public static long sumOfNumberLongStream(){

    return LongStream.rangeClosed(100000,600000)
        .limit(5)
        .sum();
  }

  public static void main(String[] args) {

   List<Integer>  integerList = Arrays.asList(1,2,3,4,5,6);

    System.out.println("Sum of sumOfNumbers "+sumOfNumbers(integerList));

    System.out.println("sumOfNumberINteStream "+sumOfNumberINteStream());

   System.out.println("sumOfNumberDoubleStream "+sumOfNumberDoubleStream());

   System.out.println("sumOfNumberLongStream "+sumOfNumberLongStream());




  }
}
