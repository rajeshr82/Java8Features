package com.training.example;

import com.training.data.StudentDataBase;

import java.util.stream.Collectors;

public class PeekDebugStreams {

  public static void main(String[] args) {

    StudentDataBase.getAllStudents().stream()
        .peek((student -> {
          System.out.println(student);
        }))
          .filter(student -> student.getGpa() >3.9)
        .peek((student -> {
          System.out.println("After 1st Filter "+student);
        }))
        .filter((student -> student.getGender().equals("Female")))

        .peek((student -> {
          System.out.println("After 2nd Filter "+student);
        }))

        .collect(Collectors.toList());
  }
}
