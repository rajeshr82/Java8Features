package com.training.constructorreference;

import com.training.data.Student;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {

  static Supplier<Student> studentSupplier =Student::new; // constructor reference

  static Function<String,Student> function = Student::new;

  static Function<String,String> stringSupplier = String::new;



  public static void main(String[] args) {

    System.out.println(studentSupplier.get());

    System.out.println(function.apply("Hello"));

    System.out.println("String : "+stringSupplier.apply("2000"));

  }
}
