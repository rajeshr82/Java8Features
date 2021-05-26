package com.training.optional;

import com.training.data.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class OptionalExample {


  public static String getStudentName(){
   //Student student= StudentDataBase.studentSupplier.get();
    Student student= null;

    if(student!= null){
  return student.getsName();
    }
    return null;
  }

  public static Optional<String> getStudentNameOptional(){

    //Optional<Student> optionalStudent =Optional.ofNullable(
      //  StudentDataBase.studentSupplier.get());


   Optional<Student> optionalStudent =Optional.ofNullable(null); // Optional.empty

    if(optionalStudent.isPresent()){
       return optionalStudent.map(Student::getsName);// Optional<String>
    }
     return Optional.empty(); // Represents an optional object with no value
  }




  public static void main(String[] args) {

   String studentName = getStudentName();
   System.out.println(studentName);
     if(studentName!= null)
    System.out.println("Length of the Student name :"+studentName.length());
     else
       System.out.println("Name not found");



      Optional<String> studentNameOptional = getStudentNameOptional();

      if(studentNameOptional.isPresent()){
        System.out.println("Length of the Student name :"+studentNameOptional.get().length());
      }else{
        System.out.println("Name not found");
      }

  }
  }

