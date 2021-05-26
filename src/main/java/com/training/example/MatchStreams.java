package com.training.example;

import com.training.data.StudentDataBase;

public class MatchStreams {

  public static boolean allMatch(){

    return StudentDataBase.getAllStudents().stream()
        .allMatch(student -> student.getGpa()>=3.1);
  }

  public static boolean findAnyMatch(){
     return StudentDataBase.getAllStudents().stream()
         .anyMatch(student ->  student.getsName().equals("Purini1"));
  }

  public static  boolean noneMatch(){
    return StudentDataBase.getAllStudents().stream()
        .noneMatch(student ->  student.getsName().equals("Purini Venkat"));
  }



  public static void main(String[] args) {

    System.out.println("Result of all Match :"+allMatch());
    System.out.println("Result of allAnyMatch :"+findAnyMatch());
    System.out.println("Result of noneMatch :"+noneMatch());
  }
}
