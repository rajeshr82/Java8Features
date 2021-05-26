package com.training.parallel;

public class Sum {

  private int total;

  public int getTotal() {
    return total;
  }

  public void setTotal(int total) {
    this.total = total;
  }

  public void performSum(int input){
    //System.out.println(" Before summing :"+input);
    total+=input; //  mutable
    //System.out.println(" After summing :"+total);
  }
}
