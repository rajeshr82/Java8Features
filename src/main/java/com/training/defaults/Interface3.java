package com.training.defaults;

public interface Interface3  extends  Interface2{

  default void methodC()
  {
    System.out.println("Inside Method C :     "+Interface3.class);
  }

  default void methodB(){

    System.out.println("Inside Method B :    "+Interface3.class);
  }

}
