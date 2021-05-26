package com.training.example;

import java.util.ArrayList;
import java.util.List;

public class CollectionsVsStreams {


  public static void main(String[] args) {

    List<String> names = new ArrayList<>();
    names.add("adam");
    names.add("Jinny");
    names.add("Jim");
  // This is possible in the collections
    System.out.println("Displaying List of objects in the List :");
    for(String name : names){
      System.out.println(name);
    }
    names.remove(0);
    System.out.println("After removing the object :");
    for(String name : names){

      System.out.println(name);
    }
    System.out.println("After adding new the object :");
    names.add("Tester");

    for(String name : names){

      System.out.println(name);
    }
    System.out.println("Print the results in the stream object of list");
    names.stream().forEach(System.out::println);

  }
}
