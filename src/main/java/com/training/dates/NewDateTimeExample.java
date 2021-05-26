package com.training.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDateTimeExample {

  public static void main(String[] args) {
    //localDate
    LocalDate localDate = LocalDate.now();
    System.out.println("localDate  : "+localDate);
    //LocalTime
    LocalTime localTime = LocalTime.now();
    System.out.println("localTime : "+localTime);
    // LocalDateTime
    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println("localDateTime : "+localDateTime);

  }
}
