package com.training.defaults;

import com.training.data.Student;
import com.training.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultSortExample {

  static Consumer<Student> studentConsumer = (student -> System.out.println(student));

  static Comparator nameComparator = Comparator.comparing(Student :: getsName);
  static  Comparator gpaComparator = Comparator.comparingDouble(Student ::getGpa);
  static  Comparator gradeComparator = Comparator.comparing(Student ::getGradeLevel);

  /**
   *  Sort the list of student by student name.
   * @param studentsLst
   */
  public static void sortByName(List<Student>  studentsLst){

    studentsLst.sort(nameComparator);

    studentsLst.forEach(studentConsumer);
  }

  /**
   *  sort the student details by GPA
   * @param studentsLst
   */
  public static void sortByGPA(List<Student>  studentsLst){

    studentsLst.sort(gpaComparator);

    studentsLst.forEach(studentConsumer);
  }

  public static void comparatorChaining(List<Student>  studentsLst){

    studentsLst.sort(gradeComparator.thenComparing(nameComparator));
    studentsLst.forEach(studentConsumer);
  }

  public static void sortWithNullValues(List<Student> studentsLst){

    Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator);

    studentsLst.sort(studentComparator);
    studentsLst.forEach(studentConsumer);
  }

  public static void main(String[] args) {

    List<Student>  studentsLst = StudentDataBase.getAllStudents();

    /*System.out.println("Before Sorting ");
    studentsLst.forEach(studentConsumer);

    System.out.println("=============================== ");

    System.out.println("After Sorting Name ");
    sortByName(studentsLst);

    System.out.println("After Sorting GPA");
    sortByGPA(studentsLst);*/

    //System.out.println("After Sorting comparatorChaining ::");
    //comparatorChaining(studentsLst);

    System.out.println("After Sorting sortWithNullValues ::");

    sortWithNullValues(studentsLst);
    studentsLst.forEach(System.out::print);
  }
}
