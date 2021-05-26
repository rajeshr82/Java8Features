package com.training.functionalInterfaces;

import com.training.data.Student;
import com.training.data.StudentDataBase;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionStudentExample {


  private static Function<List<Student>, Map<String, Double>> studentFunction = (students ->
    students.stream().filter(PredicateStudentExample.studentPredicate1)
        .collect(Collectors.toMap(Student::getsName, Student::getGpa)));


  public static void main(String[] args) {

    System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
  }
}
