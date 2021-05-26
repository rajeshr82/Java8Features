package com.training.functionalInterfaces;

import com.training.data.Student;
import com.training.data.StudentDataBase;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateStudentExample {

  static  Predicate<Student> studentPredicate1 = (student) ->
      student.getGradeLevel()>=2;

  static Predicate<Student> studentPredicate2 =(student) ->
      student.getGpa()>=3.5;

  static BiPredicate<Integer,Double> biPredicate =(gradeLevel,gpa) ->
      gradeLevel >=2 && gpa>=3.5;

  static BiConsumer<String,List<String>> biConsumer= (name,activities) ->
      System.out.println(name +":"+ activities);



 static Consumer<Student> consumer = (student -> {

  if(biPredicate.test(student.getGradeLevel(),student.getGpa())){
    //if(studentPredicate1.and(studentPredicate2).test(student)){
      biConsumer.accept(student.getsName(),student.getActivities());
    }
  });

  public static void printNameAndActivities(List<Student> students){
    students.forEach(consumer);
  }

  public static void main(String[] args) {

    List<Student> studentList= StudentDataBase.getAllStudents();
    printNameAndActivities(studentList);

  }
}
