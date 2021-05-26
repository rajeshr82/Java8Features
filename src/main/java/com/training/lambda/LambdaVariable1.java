package com.training.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaVariable1 {
  int defaultVal = 100;

  public  void sum(List<Integer> integerList) {
    int someInt = 500;
    defaultVal =200;
    int val =integerList.stream().
        reduce(0,(x,y)-> x+y)+defaultVal+someInt;

    System.out.println("Sum : "+val);
  }

  public static void main(String[] args) {

    int i = 10; // Not allowed to use same as Local variable name as Lambda
    // parameter or inside the Lambda body
    // Not allowed re-assigned a value to local variable

   /* Consumer<Integer> c1 = (j) -> {
      i=2;
      System.out.println(i);
    }*/
    //i=10;

    Consumer<Integer> c1 = (intVal) -> {
      System.out.println(intVal * i);
    };

    c1.accept(50);

    List<Integer> integers = Arrays.asList(5, 5);
    LambdaVariable1 lambdaVariable1 = new LambdaVariable1();
    lambdaVariable1.sum(integers);
  }
}
