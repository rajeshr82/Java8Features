package com.training.example;

import com.training.data.Student;
import com.training.data.StudentDataBase;

import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamApiWorks {


  public static void main(String[] args) {

    Predicate<Student> studentPredicate = (student ->
        student.getGpa() >=3.9);
    Predicate<Student> predicate =(student ->
        student.getGroupName().equals("MCA"));


     Map<String, String> studentMap; // desired output
    studentMap = StudentDataBase.getAllStudents().stream()
        .peek(student -> {
          System.out.println(student);
        })
        .filter(studentPredicate)// Steam of students whose gpa is >= 3.9
        .peek(student -> {
          System.out.println("First Filter : "+student);
        })
        .filter(predicate)// stream of students whose groupName is MCA
        .peek(student -> {
          System.out.println("Second Filter :"+ student);
        })
        .collect(Collectors.toMap(Student :: getsName,Student :: getGroupName));

    System.out.println(studentMap);

    System.out.println(" Values : "+ StudentDataBase.getAllStudents().
            stream().count());
       }
}
