package com.training.persons;

public class Person {

  private int personId;
  private String name;
  private int age;
  private String gender;

  public Person(int personId, String name, int age, String gender) {
    this.personId = personId;
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public int getPersonId() {
    return personId;
  }

  public void setPersonId(int personId) {
    this.personId = personId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  @Override
  public String toString() {
    return "Person{" + "personId=" + personId + ", name='" + name + '\'' + ", age=" + age + ", gender='" + gender + '\''
        + '}';
  }
}
