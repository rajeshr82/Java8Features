package com.training.example;
import com.training.data.Student;
import com.training.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceStream {

  /**
   *  reduce is terminal operation, used to reduce the content of stream to a single value.
   * @param integerLst
   * @return
   */
  public static int performMultiplication(List<Integer> integerLst){

    return integerLst.stream()
         //1
        //3
        //5
        //7
        //10
        // a= 1 and b = 1 (from stream ) => result 1 is returned
        // a = 1 and b =3 (from stream ) => result 3 is returned
        // a = 3 and b =5 (from stream) ==> result 15 is returned
        // a = 15 and b = 7 (from stream) => result 105 is returned
        // a = 105 and b = 10 (from stream) => result 1050 is returned
        .reduce(1,(a,b) -> a*b);

  }


  public static  Optional<Integer>  method1(List<Integer> integerLst){

     return integerLst.stream().reduce((x,y) -> x+y);
  }

  public static Optional<Integer> performMultiplicationWithoutIdentifier(List<Integer> integerLst){
     return integerLst.stream()
         .reduce((a,b) -> a* b);
  }

  public static Optional<Student> getStudentDetails(){
     List<Student> studentList = StudentDataBase.getAllStudents();
     return studentList.stream()
         .filter(student -> student.getGender().equals("Male"))
         .reduce((s1,s2) -> (s1.getGpa() > s2.getGpa()) ? s1 : s2);
  }

  public static void main(String[] args) {

    List<Integer> intLst = Arrays.asList(1,3,5,7,10);
    List<Integer> intLstEmpty = Arrays.asList();
    System.out.println("performMultiplication: "+performMultiplication(intLst));
     Optional<Integer> result = performMultiplicationWithoutIdentifier(intLst);
    Optional<Integer> result2 = performMultiplicationWithoutIdentifier(intLstEmpty);
    System.out.println("performMultiplicationWithoutIdentifier : "+result.get());
    System.out.println("performMultiplicationWithoutIdentifier : "+result.isPresent());
    if(result2.isPresent()){
      System.out.println("performMultiplicationWithoutIdentifier : "+result2.get());
    }

     Optional<Student> studentResults = getStudentDetails();
    if(studentResults.isPresent()){

      System.out.println(" studentResults  : "+studentResults.get());
    }
  }
}
