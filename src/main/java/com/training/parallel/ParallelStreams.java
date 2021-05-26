package com.training.parallel;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreams {

  public static long checkPerformanceResults(Supplier<Integer> supplier,int numberOfTimes){

    long startTime = System.currentTimeMillis();
    for(int i=0; i < numberOfTimes;i++){
      supplier.get();
    }
    long endTime = System.currentTimeMillis();

    return endTime-startTime;
  }

  public static int sumSequenceStreams(){

    return IntStream.rangeClosed(1,100000)
        .sum();
  }

  public static  int sumParallelStreams(){
    return IntStream.rangeClosed(1,100000)
        .parallel() // split the data into multiple parts concurrently.
        .sum();

  }

  public static void main(String[] args) {

    System.out.println("Number of processors : "
        +Runtime.getRuntime().availableProcessors());

    System.out.println("sumSequenceStreams :"+checkPerformanceResults(ParallelStreams::sumSequenceStreams,
        20)+" MilliSeconds");

    System.out.println("sumParallelStreams :"+checkPerformanceResults(ParallelStreams::sumParallelStreams,
      20)+" MilliSeconds");

    //System.out.println("sumParallelStreams :"+sumParallelStreams());

    //System.out.println("sumSequenceStreams : "+sumSequenceStreams());
  }
}
