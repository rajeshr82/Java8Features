package com.training.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LimitAndSkipStream {


  public static Optional<Integer> limit(List<Integer> integers){

    return integers.stream()
        .limit(2)
        .reduce((x,y) -> x+y);
  }

  public static Optional<Integer> skip(List<Integer> integers){

    return integers.stream()
        .skip(2)
        .reduce((x,y)-> x+y);
  }
  public static void main(String[] args) {

    List<Integer> integers = Arrays.asList(6,7,8,9,10);


    List<Integer> integerEmpty = Arrays.asList();

    Optional<Integer> integerOptional = limit(integers);
    if(integerOptional.isPresent()){
      System.out.println("The limit value is "+integerOptional.get());
    }else{
      System.out.println(" The input list is Empty");
    }

    Optional<Integer> skipInt = skip(integers);

    if(skipInt.isPresent()){
      System.out.println("The Skip Sum of value is"+skipInt.get());
    }else{
      System.out.println(" The input list is Empty");
    }
  }



}
