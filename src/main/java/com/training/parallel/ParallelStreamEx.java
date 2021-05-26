package com.training.parallel;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamEx {


  public static int sumSequential(){

     return IntStream.rangeClosed(1,10000)
    .sum();
  }

  public static int sumParallel(){

    return IntStream.rangeClosed(1,10000)
        .parallel()
        .sum();
  }


  public static void main(String[] args) {

    System.out.println("sumSequential"+ sumSequential());

    System.out.println("sumParallel :"+sumParallel());

  }
}
