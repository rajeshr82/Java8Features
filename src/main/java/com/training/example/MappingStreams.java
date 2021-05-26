package com.training.example;

import com.training.data.Student;
import com.training.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MappingStreams {


  public static List<String> mapping(){

     return StudentDataBase.getAllStudents()
        .stream()
         .filter(student ->  student.getGpa() >=3.9)
        .collect(Collectors.mapping(Student::getsName,Collectors.toList()));

  }

  public static Set<String> withOutMapping(){

    return StudentDataBase.getAllStudents()
        .stream()
        .map(student -> student.getsName())
        .collect(Collectors.toSet());

  }

  public static Set<String> mappingWithSet(){

    return StudentDataBase.getAllStudents()
        .stream()
        .collect(Collectors.mapping(Student::getsName,Collectors.toSet()));

  }

  public static void main(String[] args) {

    System.out.println("mapping :"+mapping());

    System.out.println("withOutMapping :"+withOutMapping());

    System.out.println("mappingWithSet : "+mappingWithSet());
  }
}
