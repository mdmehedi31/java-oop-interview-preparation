package com.interview.preparation.encapsulation;

public class Encapsulation {

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
