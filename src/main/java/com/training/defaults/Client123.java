package com.training.defaults;

public class Client123 implements  Interface1, Interface2{


  public void methodA()
  {
    System.out.println("Inside Method A  :   "+Client123.class);
  }


  // 1--> class implements the interface
  // 2 --> the sub interface that extends the interface
  public static void main(String[] args) {

    Interface2 interface2 = new Client123();
    interface2.methodB();
    interface2.methodA();

    System.out.println("===============");
    Client123 client123 = new Client123();

    client123.methodA(); // resolve the child implementation
    client123.methodB();
   // client123.methodC();
  }
}
