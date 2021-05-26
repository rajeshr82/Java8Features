package com.training.optional;

import com.training.data.Student;
import com.training.data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {


  // orElse
  public static String optionalOrElse(){
 // this expects actual String
   // Optional<Student> optionalStudent = Optional.ofNullable(
     //   StudentDataBase.studentSupplier.get());

    Optional<Student> optionalStudent = Optional.ofNullable(null); // Option.empty
    return optionalStudent.map(Student::getsName).orElse("Default");
  }

  //orElseGet
  public static String optionalOrElseGet(){
  // this expects supplier
    Optional<Student> optionalStudent = Optional.ofNullable(
        StudentDataBase.studentSupplier.get());

    //Optional<Student> optionalStudent = Optional.ofNullable(null); // Option.empty
    return optionalStudent.map(Student::getsName).orElseGet(() -> "Default");
  }




//orElseThow
  public static String optionalOrElseThrow(){

   Optional<Student> optionalStudent=  Optional.ofNullable(
       StudentDataBase.studentSupplier.get());
   // Optional<Student> optionalStudent= Optional.ofNullable(null);
  return optionalStudent.map(Student::getsName)
      .orElseThrow(()-> new RuntimeException("Data not found"));
  }
  public static void main(String[] args) {

    System.out.println("optionalOrElse : "+optionalOrElse());
    System.out.println("optionalOrElseGet : "+optionalOrElseGet());
   System.out.println("optionalOrElseThrow : "+optionalOrElseThrow());
  }
}
