package com.interview.preparation.encapsulation;

public class Encapsulation /*
 extends Person
 We can not inherit the Person class here , cause person class is final,
 so any final class not allow to extend
 */{

 private int age;
 private long salary;

 public Encapsulation() {
 }

 public Encapsulation(int age, long salary) {
  System.out.println("Encapsulation");
  this.age = age;
  this.salary = salary;
 }


 private int get2XAge() {
  return age*2;
 }
}
