package com.training.data;
import com.training.optional.Bike;
import com.training.optional.Car;

import java.util.List;
import java.util.Optional;

public class Student {

  private String sName;
  private String gender;
  private int rollNo;
  private int noteBooks;
  private double gpa;
  private String groupName;
  private int gradeLevel;
  private List<String> activities;
  private Optional<Car> optionalCar = Optional.empty();

  public Student() {
  }

  public Student(String s) {
    this.sName = s;
  }

  public Optional<Bike> getOptionalBike() {
    return optionalBike;
  }

  public void setOptionalBike(Optional<Bike> optionalBike) {
    this.optionalBike = optionalBike;
  }

  private Optional<Bike> optionalBike = Optional.empty();

  public Optional<Car> getOptionalCar() {
    return optionalCar;
  }

  public void setOptionalCar(Optional<Car> optionalCar) {
    this.optionalCar = optionalCar;
  }

public List printStudentActivityList(){
   return getActivities();

}


  public Student(String sName,
      String gender,
      int rollNo,
      int noteBooks,
      double gpa,
      String groupName,
      int gradeLevel,
      List<String> activities) {
    this.sName = sName;
    this.gender = gender;
    this.rollNo = rollNo;
    this.noteBooks = noteBooks;
    this.gpa = gpa;
    this.groupName = groupName;
    this.gradeLevel = gradeLevel;
    this.activities = activities;
  }

  public String getsName() {
    return sName;
  }

  public void setsName(String sName) {
    this.sName = sName;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public int getRollNo() {
    return rollNo;
  }

  public void setRollNo(int rollNo) {
    this.rollNo = rollNo;
  }

  public int getNoteBooks() {
    return noteBooks;
  }

  public void setNoteBooks(int noteBooks) {
    this.noteBooks = noteBooks;
  }

  public double getGpa() {
    return gpa;
  }

  public void setGpa(double gpa) {
    this.gpa = gpa;
  }

  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public int getGradeLevel() {
    return gradeLevel;
  }

  public void setGradeLevel(int gradeLevel) {
    this.gradeLevel = gradeLevel;
  }

  public List<String> getActivities() {
    System.out.println(activities);
    return activities;
  }

  public void setActivities(List<String> activities) {
    this.activities = activities;
  }

  @Override public String toString() {
    return "Student{" + "sName='" + sName + '\'' + ", gender='" + gender + '\'' + ", rollNo=" + rollNo + ", noteBooks="
        + noteBooks + ", gpa=" + gpa + ", groupName='" + groupName + '\'' + ", gradeLevel='" + gradeLevel + '\''
        + ", activities=" + activities + ", optionalCar=" + optionalCar + ", optionalBike=" + optionalBike + '}';
  }
}
