package com.training.persons;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestClass {

  private static Function<List<Person>,Map<Integer,Person>> function = TestClass::apply;


  public static List<Person> getPersonsByGender(String gender){

     return PersonalData.getPersonalData()
          .stream()
          .filter(person -> person.getGender()
              .equals(gender))
          .collect(Collectors.toList());
  }

  public static void main(String[] args) {
    Map<Integer,Person> personMap = function.apply(PersonalData.getPersonalData());


   //personMap.forEach((k,v)-> System.out.println("Key :"+k +":"+ v));

    System.out.println(personMap.toString());
    System.out.println();

  }

  private static Map<Integer, Person> apply(List<Person> persons) {
    return persons.
        stream().
        collect(Collectors.toMap(Person::getPersonId, person -> person));


  }


}
