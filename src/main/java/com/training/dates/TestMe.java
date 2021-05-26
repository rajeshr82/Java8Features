package com.training.dates;
import com.training.persons.Person;
import com.training.persons.PersonalData;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class TestMe {

  static Consumer<Integer> integerConsumer = integer -> {
    String name = "Venkateswara Rao :";
    drawPyramidPattern(name);

  };

  public static void drawPyramidPattern(String name) {
    for (int i = 0; i < name.length(); i++) {
      for (int j = 0; j < name.length() - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k <= i; k++) {
        System.out.print(name.charAt(k));
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    //drawPyramidPattern("VenkateswaraRao");

    List<Integer> integerList = Arrays.asList(1, 3, 5);

    // integerConsumer;

    List<Person> names = displayNames();
    System.out.println(names);

  }

  private static List<Person> displayNames() {

    List<Person> personList = PersonalData.getPersonalData()
        .stream()
        .filter(person -> person.getGender().equals("Male"))
        .collect(Collectors.toList());

   return personList;
  }

}
