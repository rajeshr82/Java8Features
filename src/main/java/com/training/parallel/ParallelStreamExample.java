package com.training.parallel;

import com.training.data.Student;
import com.training.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExample {

  /**
   *
   * @return
   */
  public static List<String> sequentialProgram(){

    long startTime = System.currentTimeMillis();
     List<String> stringList= StudentDataBase.getAllStudents()
        .stream()
        .map(Student::getActivities)
        .flatMap(List::stream)
        .collect(Collectors.toList());
    long endTime = System.currentTimeMillis();
    System.out.println("stringList :"+stringList);
    System.out.println("sequentialProgram   "+(endTime-startTime));
 return  stringList;
  }


  public static List<String> parallelProgram(){
    long startTime = System.currentTimeMillis();
   List<String> stringList = StudentDataBase.getAllStudents()
      .stream()
      .parallel()
      .map(Student::getActivities)
      .flatMap(List ::stream)
      .collect(Collectors.toList());
    long endTime = System.currentTimeMillis();
    System.out.println("stringList :"+stringList);
    System.out.println("parallelProgram : "+(endTime-startTime));
   return stringList;

  }

  public static void main(String[] args) {
    sequentialProgram();
    parallelProgram();
  }
}
