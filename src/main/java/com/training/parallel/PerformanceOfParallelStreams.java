package com.training.parallel;

import java.sql.SQLOutput;
import java.util.stream.IntStream;

public class PerformanceOfParallelStreams {


  public static long performanceOfSequentialStreams(){

     long startTime = System.currentTimeMillis();
      int sum = IntStream.rangeClosed(1,100000)
        .sum();
    System.out.println("Sequential Streams :"+sum);

     long endTime = System.currentTimeMillis();
     return endTime-startTime;
  }

  public static long performanceOfParallelStreams(){

    long startTime = System.currentTimeMillis();
    int sum = IntStream.rangeClosed(1,100000)
        .parallel()
        .sum();
    System.out.println("Parallel Streams :"+sum);

    long endTime = System.currentTimeMillis();
    return endTime-startTime;
  }



  public static void main(String[] args) {
    System.out.println("Available Processors : "+Runtime.getRuntime().availableProcessors());
    System.out.println("performanceOfSequentialStreams :"+ performanceOfSequentialStreams());
    System.out.println("performanceOfParallelStreams : "+performanceOfParallelStreams());
  }
}
