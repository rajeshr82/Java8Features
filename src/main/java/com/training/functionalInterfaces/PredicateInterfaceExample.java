package com.training.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateInterfaceExample {

  static Predicate<Integer> p = (num) -> num%2==0;
  static Predicate<Integer> p1 = (num) -> num%5==0;

  public static void predicateAnd(){
    System.out.println("predicateAnd : "+p.and(p1).test(10));

  }

  public static void predicateOr(){
    System.out.println("predicateOr : "+p.or(p1).test(9));

  }

  public static void predicateNegate(){
    System.out.println("predicateNegate : "+p.negate().test(9));

  }

  public static void main(String[] args) {

    predicateAnd();
    predicateOr();
    predicateNegate();
  }
}
