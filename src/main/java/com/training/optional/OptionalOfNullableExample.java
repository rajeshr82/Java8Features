package com.training.optional;
import java.util.Optional;

public class OptionalOfNullableExample {

  public static Optional<String> ofNullable(){
   // Optional<String> stringOptional = Optional.ofNullable("Hello");
    Optional<String> stringOptional = Optional.ofNullable(null);
    return  stringOptional;
  }



  public static Optional<String> of(){
    //Optional<String> stringOptional = Optional.of("Hello");
    Optional<String> stringOptional = Optional.of(null);
    //Optional<String> stringOptional = Optional.ofNullable(null);
    return  stringOptional;
  }

  public static Optional<String> empty(){
   // Optional<String> stringOptional = Optional.of("Hello");

    Optional<String> stringOptional = Optional.empty();

    return  stringOptional;
  }

  public static void main(String[] args) {

    if(ofNullable().isPresent()){
      System.out.println("ofNullable : "+ofNullable().get());
    }else{
      System.out.println("Data Not found");
    }
 /*if(of().isPresent()) {
   System.out.println("of : " + of().isPresent());
 }else{
   System.out.println("Data Not found");
 }*/
 if(empty().isPresent()) {
   System.out.println("empty : " + empty().get());
 }else
 {
   System.out.println("empty : Data Not found");
 }


  }
}
