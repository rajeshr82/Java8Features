package com.training.example;

import com.training.data.Student;
import com.training.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsSortComparator {


  public static List<Student> getStudentSortByName(){

    return StudentDataBase.getAllStudents().stream()
        .sorted(Comparator.comparing(Student::getsName))
        .collect(Collectors.toList());
  }

  public static List<Student> getStudentSortByGpa(){

    return StudentDataBase.getAllStudents().stream()
        .sorted(Comparator.comparing(Student::getGpa))
        .collect(Collectors.toList());
  }

  public static List<Student> getStudentSortByGpaDesc(){

    return StudentDataBase.getAllStudents().stream()
        .sorted(Comparator.comparing(Student::getGpa).reversed())
        .collect(Collectors.toList());
  }

  public static void main(String[] args) {

    System.out.println("getStudentSortByName :");
    getStudentSortByName().forEach(System.out::println);

    System.out.println("=======================================");

    System.out.println("getStudentSortByGpa :");
    getStudentSortByGpa().forEach(System.out::println);

    System.out.println("=======================================");

    System.out.println("getStudentSortByGpaDesc :");
    getStudentSortByGpaDesc().forEach(System.out::println);

  }
}
