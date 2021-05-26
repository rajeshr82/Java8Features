package com.training.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

  static UnaryOperator<String> unaryOperator = (str) -> str;

  public static void main(String[] args) {

    System.out.println(unaryOperator.apply("Java8"));
  }
}
