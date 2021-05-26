package com.training.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalUnit;

public class LocalDateExample {

  public static void main(String[] args) {
    LocalDate localDate = LocalDate.now();
    System.out.println("localDate :"+localDate);

    LocalDate localDate1 = LocalDate.of(2020,6,10);
    System.out.println("localDate1 : "+localDate1);

    /**
     *  Get values from LocalDate
     */

    System.out.println(" getMonth : "+ localDate.getMonth());

    System.out.println(" getMonthValue : "+ localDate.getMonthValue());

    System.out.println(" getDayOfWeek : "+ localDate.getDayOfWeek());

    System.out.println(" getDayOfYear : "+ localDate.getDayOfYear());

    System.out.println(" Day of Month using Get  : "+ localDate.get(ChronoField.DAY_OF_MONTH));

    /**
     * Modifying Local Date
     */

    System.out.println("plusDays : "+localDate.plusDays(2));
    System.out.println("plusMonths : "+localDate.plusMonths(2));

    System.out.println("minusDays : "+localDate.minusDays(2));
    System.out.println("minusMonths : "+localDate.minusMonths(2));

    System.out.println("With Year : "+localDate.withYear(2025));

    System.out.println("With Chrono Field : "+localDate.with(ChronoField.YEAR,2025));

    System.out.println("With Chrono Field : "+localDate.with(ChronoField.YEAR,2025));

    /**
     * Additional support methods
     */

    System.out.println("Leap Year :"+localDate.isLeapYear());

    System.out.println("Leap Year 2016 :"+localDate.withYear(2016).isLeapYear());

    /**
     *  comparing dates
     */
     boolean booleanFlag =localDate.isEqual(localDate1) ? true : false;
    System.out.println("Data comparing :"+booleanFlag);

    boolean isDateAfter = localDate1.isAfter(localDate) ? true : false;
    System.out.println("comparing : "+isDateAfter);


  }
}
