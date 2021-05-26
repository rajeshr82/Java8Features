package com.training.example;

import com.training.data.Student;
import com.training.data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingStreams {

  public static void groupStudentByGender(){

   Map<String, List<Student>> studentMap =  StudentDataBase.getAllStudents()
        .stream()
        .collect(Collectors.groupingBy(Student ::getGender));


    studentMap.forEach((key,val) -> {
      System.out.print("groupByStudent : "+key);
      System.out.println(val);
    });

  }
  public static void customizedGroupingBy(){

    Map<String, List<Student>> studentMap =  StudentDataBase.getAllStudents()
        .stream()
        .collect(Collectors.groupingBy(student -> student.getGpa()>=3.9 ? "OUTSTANDING" : "AVERAGE"));

    studentMap.forEach((key,val)-> {

      System.out.print("customizedGroupingBy : "+key);
      System.out.println(val);
    });

  }

  public static void twoLevelGrouping_1(){

    Map<String, Map<String,List<Student>>> studentMap =  StudentDataBase.getAllStudents()
        .stream()
        .collect(Collectors.groupingBy(Student::getGender,
            Collectors.groupingBy(student -> student.getGpa()>=3.9 ? "OUTSTANDING" : "AVERAGE")));

    studentMap.forEach((key,val)->{
      System.out.print("twoLevelGrouping_1 : "+key);
      System.out.println(val);
    });

  }

  public static void twoLevelGrouping_2(){

    Map<String,Integer> studentMap = StudentDataBase.getAllStudents()
        .stream()
        .collect(Collectors.groupingBy(Student:: getGender,
            Collectors.summingInt(Student :: getNoteBooks)));


    studentMap.forEach((key,val)->{
      System.out.print("Student name : "+key +" =");
      System.out.println(" Total No of Books : "+val);
    });

  }


  /*public static void twoLevelGrouping123_2(){

    StudentDataBase.getAllStudents()
        .stream()
        .collect(Collectors.groupingBy(student ->  student.getGender()));

    studentMap.forEach((key,val)->{
      System.out.print("Student name : "+key +" =");
      System.out.println(" Total No of Books : "+val);
    });

  }*/

  public static void threeArgumentGroupBy(){

   Map<String, Set<Student>>  studentLinkedList = StudentDataBase.getAllStudents()
        .stream()
        .collect(Collectors.groupingBy(Student::getGender,
            LinkedHashMap::new,Collectors.toSet()));

    studentLinkedList.forEach((key,val)->{
      System.out.print(key + " ===");
      System.out.println(val);
    });

  }

  public static  void calculateTopGpa(){

    Map<String,Optional<Student>> studentGpa= StudentDataBase.getAllStudents()
        .stream()
        .collect(Collectors.groupingBy(Student::getsName,
            Collectors.maxBy(Comparator.comparing(Student ::getGpa))));

   /* studentGpa.forEach((key,val)->{
      System.out.println("calculateTopGpa : "+key);
      System.out.println(val);
    });*/


   Map<String,Student> studentWrapOptionalGpa=

        StudentDataBase.getAllStudents()
        .stream()
        .collect(Collectors.groupingBy(Student::getsName,
            Collectors.collectingAndThen(Collectors.maxBy(
                Comparator.comparing(Student :: getGpa)),Optional::get)));

    studentWrapOptionalGpa.forEach((key,val)->{
      System.out.print("calculateTopGpa : "+key +" ::: ");
      System.out.println(val);
    });


  }

  public static  void calculateLeastGpa(){

    Map<String,Optional<Student>> studentGpa= StudentDataBase.getAllStudents()
        .stream()
        .collect(Collectors.groupingBy(Student::getsName,
            Collectors.minBy(Comparator.comparing(Student ::getGpa))));

    studentGpa.forEach((key,val)->{
      System.out.print("calculateLeastGpa : "+key +":  ");
      System.out.println(val);
    });


    Map<String,Student> studentWrapOptionalGpa=

        StudentDataBase.getAllStudents()
            .stream()
            .collect(Collectors.groupingBy(Student::getsName,
                Collectors.collectingAndThen(Collectors.minBy(
                    Comparator.comparing(Student :: getGpa)),Optional::get)));

    /*studentWrapOptionalGpa.forEach((key,val)->{
      System.out.print("calculateLeastGpa : "+key +":::" );
      System.out.println(val);
    });*/
  }

  public static void main(String[] args) {

    //groupStudentByGender();
    //customizedGroupingBy();
    //twoLevelGrouping_1();
    //twoLevelGrouping_2();
    threeArgumentGroupBy();
    //calculateTopGpa();
    //calculateLeastGpa();
    //twoLevelGrouping123_2();
  }
}
