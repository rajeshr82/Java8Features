package com.training.lambda;

import java.util.function.Consumer;

public class LambdaVariable2 {

 static int val = 100;

 int intValue = 500;


 public void sum(int val){

   Consumer<Integer> consumer =(intVal) -> {
     intValue = intValue+intVal;
     System.out.println("sum : "+intValue);
   };
  consumer.accept(val);

 }

  public static void main(String[] args) {

    Consumer<Integer> c1 = (intVal) -> {

      System.out.println(intVal+val);
    };
    val = 250;
    c1.accept(100);

    LambdaVariable2 variable2 = new LambdaVariable2();
    variable2.sum(100);

  }


}
