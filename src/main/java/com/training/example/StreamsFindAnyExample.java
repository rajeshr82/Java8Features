package com.training.example;

import com.training.data.Student;
import com.training.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyExample {

  public static Optional<Student> findAnyStudent(){

    return StudentDataBase.getAllStudents().stream()
        // Purini
        // Ravi
        .filter(student -> student.getGpa()>= 4.0)
        .findAny();
  }

  public static Optional<Student> findFirstStudent(){

    return StudentDataBase.getAllStudents().stream()
        // Purini
        // Ravi
        .filter(student -> student.getGpa()>= 4.0)
        .findFirst();
  }

  public static void main(String[] args) {

    Optional<Student> optionalStudent = findAnyStudent();

    if(optionalStudent.isPresent()){
      System.out.println("Find Student :"+ optionalStudent.get());
    }else{
      System.out.println("Student not found ! ");
    }

    /*Optional<Student> findFirstSt = findFirstStudent();

    if(findFirstSt.isPresent()){
      System.out.println("findFirstStudent : "+findFirstSt.get());

    }else{
      System.out.println("findFirstStudent not found ! ");
    }*/
  }
}
