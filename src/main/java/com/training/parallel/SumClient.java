package com.training.parallel;

import java.util.stream.IntStream;

public class SumClient {



  public static void main(String[] args) {
  Sum sum = new Sum();
    IntStream.rangeClosed(1,1000)
        .parallel() //
        .forEach(sum ::performSum); // 500500 mutable object
//424902
    //489470

    //125250
    //281625
    System.out.println("Sum :"+sum.getTotal());


  }
}
