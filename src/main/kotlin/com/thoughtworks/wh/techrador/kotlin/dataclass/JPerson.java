package com.thoughtworks.wh.techrador.kotlin.dataclass;

public class JPerson {

  private String firstName;
  private String lastName;
  private Gender gender;
  private int age;

  public JPerson(String firstName, String lastName, Gender gender, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.gender = gender;
    this.age = age;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public Gender getGender() {
    return gender;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "JPerson{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", gender=" + gender +
            ", age=" + age +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    JPerson jPerson = (JPerson) o;

    if (getAge() != jPerson.getAge()) return false;
    if (!getFirstName().equals(jPerson.getFirstName())) return false;
    if (!getLastName().equals(jPerson.getLastName())) return false;
    return getGender() == jPerson.getGender();
  }

  @Override
  public int hashCode() {
    int result = getFirstName().hashCode();
    result = 31 * result + getLastName().hashCode();
    result = 31 * result + getGender().hashCode();
    result = 31 * result + getAge();
    return result;
  }
}
