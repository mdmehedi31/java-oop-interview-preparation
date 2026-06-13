package com.interview.preparation.encapsulation;

public  class  Person {


    private final int age;
    private int number;

    public void showPersonDetails() {
        System.out.println("Person Details");
    }

    public Person(int age) {
        this.age = age;
    }

    /*
    This is not possible to set the value by using
    the method cause its final, we only initialize it once time.


    public void setAge(int age) {
        this.age=age;
    }
    */

    public int getAge() {
        return age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
