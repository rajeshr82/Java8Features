package com.training.dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExamples {

  public static void main(String[] args) {

    LocalTime localTime = LocalTime.now();
    System.out.println("localTime :"+localTime);

    LocalTime localTime1 = LocalTime.of(
        18,45);
    System.out.println("localTime1 :"+localTime1);

    LocalTime localTime2 = LocalTime.of(
        18,45,22);
    System.out.println("localTime2 :"+localTime2);

    LocalTime localTime3 = LocalTime.of(
        18,45,22,87777);
    System.out.println("localTime3 :"+localTime3);

    /**
     *  getting the values from local time instance
     */

    System.out.println("getHour :  "+localTime.getHour());
    System.out.println("getMinute : "+localTime.getMinute());
    System.out.println("ChronoField CLOCK_HOUR_OF_DAY : "+localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
    System.out.println("toSecondOfDay : "+localTime.toSecondOfDay());

    /**
     *  modify values from localTime
     */

    System.out.println("minusHours : "+localTime.minusHours(2));
    System.out.println("ChronoUnit : "+localTime.minus(2, ChronoUnit.HOURS));

    System.out.println("MIDNIGHT "+localTime.with(LocalTime.MIDNIGHT));
    System.out.println("plusMinutes : "+localTime.plusMinutes(30));
    System.out.println("WithHour :"+localTime.withHour(10));


  }
}
