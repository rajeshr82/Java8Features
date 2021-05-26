package com.training.persons;
import java.util.Arrays;
import java.util.List;

public class PersonalData {

  public static List<Person> getPersonalData(){

    Person person1 = new Person(1,"Venkat",38,"Male");
    Person person2 = new Person(2,"Latha",28,"Female");
    Person person3 = new Person(3,"Ravi",30,"Male");
    Person person4 = new Person(4,"Kalyani",35,"Female");
    Person person5 = new Person(5,"Roja",30,"Female");

   List<Person> personList = Arrays.asList(person1,person2,person3,person4,person5);
    return personList;

  }
}
