package com.training.example;

import com.training.data.Student;
import com.training.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapAndSet {


  public static List<String> namesList(){
     List<String> listNames = StudentDataBase.getAllStudents()
         .stream()
         .peek(student -> {
           System.out.println("First Peek : "+student);
         })
         .filter(student -> student.getGender().equals("Female"))
        // converting one type another
        .map((Student:: getsName))
         .peek(s -> {
           System.out.println("After map : "+s);
         })
         .map(String ::toUpperCase)
        .collect(Collectors.toList());

    return  listNames;
  }

  public static Set<String> namesSet(){
    Set<String> listNames = StudentDataBase.getAllStudents()
        .stream()
        // converting one type another
        .map((Student:: getsName))
        .map(String ::toUpperCase)
        .collect(Collectors.toSet());

    return  listNames;
  }

  public static void main(String[] args) {

    System.out.println("List :"+namesList());
    System.out.println("Set :"+namesSet());


  }
}
