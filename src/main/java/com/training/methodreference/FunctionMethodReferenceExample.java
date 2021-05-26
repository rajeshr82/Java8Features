package com.training.methodreference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

  static Function<String,String> toUpperCaseLambda = String::toUpperCase;

  static  Function<String,String> toMethodReference = String::toUpperCase;

  public static void main(String[] args) {

    System.out.println("toUpperCaseLambda :"+toUpperCaseLambda.apply("hello"));
    System.out.println("toMethodReference :"+toMethodReference.apply("hello"));


  }
}
