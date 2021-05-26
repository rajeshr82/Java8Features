package com.training.optional;

import com.training.data.Student;
import com.training.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlapMapExample {

  //filter

  public static void optionalFilter(){
   Optional<Student> optionalStudent= Optional.ofNullable(StudentDataBase.studentSupplier.get());

    //Optional<Student> optionalStudent=Optional.ofNullable(null);

    optionalStudent.
        filter(student -> student.getGpa() >=3.5)
        .ifPresent(student -> System.out.println(student));
  }

  //map
  public static void optionalMap(){
    Optional<Student> optionalStudent= Optional.ofNullable(StudentDataBase.studentSupplier.get());

     Optional<String> name =optionalStudent.
        filter(student -> student.getGpa() >=3.5)
        .map(Student::getsName);
    System.out.println(name.get());
  }
  //flatMap
  public static void optionalFlatMap(){
    Optional<Student> optionalStudent= Optional.ofNullable(StudentDataBase.studentSupplier.get());

    Optional<String> carName = optionalStudent.
        filter(student -> student.getGpa() >=3.5)//Optional<Student<Optional,Car>>
        .flatMap(Student :: getOptionalCar)// returns Optional<Car>
        .map(Car :: getCarName);
    carName.ifPresent(s -> System.out.println("Car Name :"+s));
  }

  //flatMap
  public static void optionalFlatMapCarModel(){
    Optional<Student> optionalStudent= Optional.ofNullable(StudentDataBase.studentSupplier.get());

    Optional<String> carModel = optionalStudent.
       // filter(student -> student.getGpa() >=3.5)//Optional<Student<Optional,Car>>
        flatMap(Student :: getOptionalCar)// returns Optional<Car>
        .map(Car :: getCarModel);
    carModel.ifPresent(s -> System.out.println("Car Model  :"+s));
  }






  public static void main(String[] args) {

    //optionalFilter();
    //optionalMap();
    //optionalFlatMap();
    optionalFlatMapCarModel();

  }
}
