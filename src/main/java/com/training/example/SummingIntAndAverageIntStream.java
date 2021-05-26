package com.training.example;

import com.training.data.Student;
import com.training.data.StudentDataBase;

import java.util.stream.Collectors;

public class SummingIntAndAverageIntStream {

  public static int summingInt(){

    return StudentDataBase.getAllStudents()
        .stream()
        .collect(Collectors.summingInt(Student::getNoteBooks));
  }

  public static double averagingInt(){

    return StudentDataBase.getAllStudents()
        .stream()
        .collect(Collectors.averagingInt(Student::getNoteBooks));
  }

  public static void main(String[] args) {

    System.out.println("summingInt :"+summingInt());

    System.out.println("averagingInt :"+averagingInt());
  }
}
