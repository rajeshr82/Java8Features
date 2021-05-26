package com.training.example;

import com.training.data.Student;
import com.training.data.StudentDataBase;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountingStreams {



  public static long count(){

    return StudentDataBase.getAllStudents().
        stream().
        filter(student -> student.getGpa() >= 3.9).count();
  }

  public static long countStudent(){

    return StudentDataBase.getAllStudents()
        .stream()
        .map(student -> student.getActivities())
        .flatMap(List::stream)
        .distinct()
        .count();
  }



  public static void skipOperationReverse(){

    List<Student> studentList = StudentDataBase.getAllStudents();

    studentList.sort(Comparator.comparing(student -> student.getsName()));


    studentList.forEach(System.out::println);
  }



  public static void main(String[] args) {

   // System.out.println("count  :"+count());

   //System.out.println("Student Activities : "+countStudent());

    skipOperationReverse();
  }
}
