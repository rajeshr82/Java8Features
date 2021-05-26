package com.training.methodreference;

import com.training.data.Student;
import com.training.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerMethodExample {

  // consumer  -1
  //biconsumer -2
  //functiom -3
  //Bifunction -4
  //Prediocate -5
  //Bipredicate -6
  //UniaryOperator -7
  //BinaryOperator -8
  //Supplier -9

 //static Consumer<Student> consumer =(student) -> System.out.println(student);

  static Consumer<Student> consumer = System.out::println;

static  Consumer<Student> consumer2 = Student ::printStudentActivityList;

  public static void main(String[] args) {

    List<Student> studentList = StudentDataBase.getAllStudents();

    studentList.forEach(consumer);
    studentList.forEach(consumer2);

  }
}


