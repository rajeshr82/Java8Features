package com.training.example;

import com.training.data.Student;
import com.training.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PartitioningByStreams {

  public static void partitioning_1(){
    Predicate<Student> predicate = student -> student.getGender().equals("Female");

    Map<Boolean, List<Student>> studentMap=
        StudentDataBase.getAllStudents()
        .stream()
        .collect(Collectors.partitioningBy(predicate));

    studentMap.forEach((k,v)-> System.out.println(k +":"+ v));

   // System.out.println(studentMap);
  }

  public static void main(String[] args) {

    partitioning_1();

  }
}
