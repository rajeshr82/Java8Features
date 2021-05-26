package com.training.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

  static BinaryOperator<Integer> binaryOperator = (a,b)-> a*b;

  static Comparator<Integer> comparator = (a,b) -> a.compareTo(b);

  public static void main(String[] args) {

    System.out.println("binaryOperator Multiplication: "+binaryOperator.apply(4,5));

    BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
    System.out.println("MaxBy : "+maxBy.apply(5,10));

    BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
    System.out.println("MinBy : "+minBy.apply(5,10));

  }
}
