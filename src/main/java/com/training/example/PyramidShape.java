package com.training.example;

public class PyramidShape {

  public static void displayPyramidShape(String input){

    for(int i =0 ; i < input.length() ; i++){

      for(int j = i ; j <i-1 ; j++){
        System.out.println(" ");
      }
      for(int k = 0; k <= i; k ++) {
        System.out.print(input.charAt(k));
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {

    displayPyramidShape("Purini");
  }
}
