package com.interview.preparation.encapsulation;

public final class  Person extends User {


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

   /*
    Here, We are trying to override the method, from the user class,
    but we can not do this, cause this method is final in the Super class(User)
    @Override
    public String updateUserDetails(String updateDetails){

    }
    */


}
