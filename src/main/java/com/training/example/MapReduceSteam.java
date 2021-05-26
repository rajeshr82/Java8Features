package com.training.example;

import com.training.data.Student;
import com.training.data.StudentDataBase;

import java.util.List;

public class MapReduceSteam {


  public static int getNoOfNoteBooks() {

    List<Student> studentList = StudentDataBase.getAllStudents();
     int noOFBooks = studentList.stream()
         .filter(student -> (student.getGender().equals("Female")))
         .filter(student -> (student.getGpa() >=3.5))
        .map(Student::getNoteBooks)
        //.reduce(0,(a,b) -> a+b);
    .reduce(0,Integer::sum);


    return noOFBooks;
  }


  public static void main(String[] args) {

    System.out.println("getNoOfNoteBooks :"+getNoOfNoteBooks());
  }
}
