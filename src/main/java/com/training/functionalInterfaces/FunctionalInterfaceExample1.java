package com.training.functionalInterfaces;

public class FunctionalInterfaceExample1 {


  public static String performContact(String str){

   return  FunctionalInterfaceExample.function
       .compose(FunctionalInterfaceExample.addSomeString).apply(str);

  }

  public static void main(String[] args) {

    String result = performContact("hello ");
    System.out.println(result);
  }
}
