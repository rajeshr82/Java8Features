package com.training.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class MapToObjNumericStreams {

  public static List<Integer> mapToObj(){
  // numeric stream
     return IntStream.rangeClosed(1,10)
         .mapToObj((i) -> {
            return new Integer(i);
         }).collect(Collectors.toList());
  }



  public static double mapToDouble(){

  return  LongStream.rangeClosed(0,10).mapToDouble((i)-> i)
        .sum();

  }





  public static void main(String[] args) {

    System.out.println("mapToObj : "+mapToObj());
    System.out.println("mapToDouble : "+mapToDouble());
  }
}
