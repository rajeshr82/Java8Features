package com.training.functionalInterfaces;

import com.training.data.Student;
import com.training.data.StudentDataBase;
import com.training.optional.Car;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class SupplierExample {

  static  Supplier<List<Student>> listSupplier =()->
  {
    return StudentDataBase.getAllStudents();
  };


  static Supplier<Student> supplier = ()->{
    Car car = new Car();
    car.setCarName("grand i10");
    car.setCarModel("Asta");

    Student student= new Student("Purini",
        "Male",
        100,
        10,
        3.5,
        "MCA",
        2,
        Arrays.asList("Swimming","Reading Books","Watching TV"));

    student.setOptionalCar(Optional.ofNullable(car));

    return student;
  };

  public static void main(String[] args) {

    System.out.println("Supplier :"+supplier.get());

    listSupplier.get().forEach(System.out::print);
  }
}
