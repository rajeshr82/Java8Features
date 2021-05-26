package com.training.example;

import com.training.data.Student;
import com.training.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {



  public static List<Student> getStudentList(String gender){


    return StudentDataBase.getAllStudents().stream()
        .filter((student -> student.getGender().equals(gender)))
        .filter((student -> student.getGpa() > 3.5))
        .collect(Collectors.toList());

  }


  public static void main(String[] args) {


    getStudentList("Female").forEach(System.out::println);
  }
}
