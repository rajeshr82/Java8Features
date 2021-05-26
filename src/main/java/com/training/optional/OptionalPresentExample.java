package com.training.optional;

import java.util.Optional;

public class OptionalPresentExample {

  public static void main(String[] args) {
// isPresent
    Optional<String> stringOptional =Optional.ofNullable("Hello Optional");

    System.out.println(stringOptional.isPresent());
    if(stringOptional.isPresent()){
      System.out.println("IsPresent :"+stringOptional.get());
    }
    stringOptional.ifPresent(s -> System.out.println("IfPresent : "+s));
  }
}
