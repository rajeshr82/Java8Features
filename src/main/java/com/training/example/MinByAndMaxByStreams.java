package com.training.example;
import com.training.data.Student;
import com.training.data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class MinByAndMaxByStreams {

  public static Optional<Student> minBy()
  {

     return StudentDataBase.getAllStudents()
        .stream()
        .collect(Collectors.minBy(
            Comparator.comparing(student -> student.getGpa())));
  }


  public static Optional<Student> maxBy()
  {

    return StudentDataBase.getAllStudents()
        .stream()
        .collect(Collectors.maxBy(
            Comparator.comparing(student -> student.getGpa())));
  }


  public static void main(String[] args) {

    System.out.println("minBy :"+minBy());
    System.out.println("minBy :"+maxBy());
  }
}
