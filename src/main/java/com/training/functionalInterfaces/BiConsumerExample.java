package com.training.functionalInterfaces;

import com.training.data.Student;
import com.training.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

  static BiConsumer<String, List<String>>  biConsumer = (name,activities) ->
      System.out.println(name + " :"+activities);


  public  static  void printNameAndActivities(){

    List<Student> studentList = StudentDataBase.getAllStudents();
    studentList.forEach(student -> biConsumer.accept(student.getsName(),student.getActivities()));
  }



  public static void main(String[] args) {

    printNameAndActivities();
  }
}
