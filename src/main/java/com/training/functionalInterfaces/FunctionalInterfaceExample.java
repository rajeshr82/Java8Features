package com.training.functionalInterfaces;

import java.util.function.Function;

public class FunctionalInterfaceExample {

  static Function<String,String> function =(name) -> name.toUpperCase();

  static Function<String,String> addSomeString =(name) -> name.concat("default");


  public static void main(String[] args) {

    System.out.println("Apply : "+function.apply("purini"));

    System.out.println("AndThen :"+function.andThen(addSomeString).apply("purini"));

    System.out.println("Compose : "+function.compose(addSomeString).apply("purini"));
  }
}
