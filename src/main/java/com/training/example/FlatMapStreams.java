package com.training.example;

import com.training.data.Student;
import com.training.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapStreams {

  public static List<String> printActivityList(){

    List<String> studentList = StudentDataBase.getAllStudents()
        .stream()
        .map(Student::getActivities)
        .flatMap(List :: stream)
        .distinct()
        .sorted()
        .collect(Collectors.toList());

    
    return studentList;
  }

  public static long getStudentActivityCount(){

    long studentActivityCount = StudentDataBase.getAllStudents()
        .stream()
        .map(Student::getActivities)
        .flatMap(List :: stream)
        .distinct()
        .count();

    return studentActivityCount;
  }


  public static void main(String[] args) {

    System.out.println("printActivityList"+printActivityList());
   // System.out.println("getStudentActivityCount"+getStudentActivityCount());

  }
}
