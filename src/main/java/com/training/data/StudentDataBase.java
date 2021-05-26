package com.training.data;
import com.training.optional.Bike;
import com.training.optional.Car;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class StudentDataBase {



  public static Supplier<Student> studentSupplier =() -> {

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





  public static List<Student> getAllStudents() {
    Car car = new Car();
    car.setCarName("grand i10");
    car.setCarModel("Asta");
    Student student1= new Student("Purini",
        "Male",
        100,
        10,
        3.5,
        "MCA",
        2,
        Arrays.asList("Swimming","Reading Books","Watching TV"));
student1.setOptionalCar(Optional.ofNullable(car));
    Student student2= new Student("Ravi",
        "Male",
        101,
        12,
        4.0,
        "MCA",
        1,
        Arrays.asList("BasketBall","Reading Books","Watching TV"));

    Student student3= new Student("Roja",
        "Female",
        101,
        8,
        4.0,
        "MBA",
        1,
        Arrays.asList("Vollyball","Reading Books","Cricket"));

    Student student4= new Student("Kalyani",
        "Female",
        102,
        8,
        3.9,
        "MCA",
        2,
        Arrays.asList("gymnastics","Chess","Reading Books"));

    Student student5= new Student("Latha",
        "Female",
        103,
        8,
        3.0,
        "MCA",
        3,
        Arrays.asList("BaseBall","Dancing","Watching Movies"));

    List<Student> studentsLst = Arrays.asList(student1,student2,student3,student4,student5);

    return studentsLst;
  }


}
