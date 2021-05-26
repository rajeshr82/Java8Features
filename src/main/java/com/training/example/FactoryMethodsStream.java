package com.training.example;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class FactoryMethodsStream {

  public static void main(String[] args) {

    //Stream<String> streamStrings= Stream.of("Adam","Benny","Julie","Lester");

    //streamStrings.forEach(System.out::println);

     Stream<Integer> streamInt = Stream.iterate(100,(x)-> x *2)
         .limit(10);

   // streamInt.forEach(System.out::println);

    Supplier<Integer> supplierInt = new Random()::nextInt;

    Stream<Integer>  streamInteger = Stream.generate(supplierInt)
        .limit(10);

   streamInteger.forEach(System.out::println);

  }
}
