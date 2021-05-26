package com.training.functionalInterfaces;

import com.training.data.Student;
import com.training.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceExample {

  static Consumer<Student> studentNames = (student)-> {
    System.out.print(student.getsName() +" :");
  };

  static Consumer<Student>  studentActivities =(student) -> {
    System.out.println(student.getActivities());
    System.out.println("=======================");
  };


  public static void printStudentNames() {
    List<Student> studentList = StudentDataBase.getAllStudents();
    studentList.forEach(studentNames);
  }

  public static  void printStudentActivities(){

    List<Student> studentList = StudentDataBase.getAllStudents();
    studentList.forEach(studentNames.andThen(studentActivities));
  }




  public static void main(String[] args) {
    //printStudentNames();

    printStudentActivities();
  }
}
