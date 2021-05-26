package com.training.defaults;

import java.util.*;

public class DefaultExample {

  public static void main(String[] args) {

    List<String>  stringList = Arrays.asList("Kiran","Adam","Mohan","Alex","Jim");

    Collections.sort(stringList);
    System.out.println("Before Java 1.8 :"+stringList);

    stringList.sort(Comparator.naturalOrder());

    System.out.println("Java 1.8  Sorted Order :"+stringList);

    stringList.sort(Comparator.reverseOrder());

    System.out.println("Java 1.8  Reverse Order :"+stringList);
  }
}
