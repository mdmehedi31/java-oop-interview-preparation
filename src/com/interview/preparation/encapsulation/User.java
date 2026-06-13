package com.interview.preparation.encapsulation;

public class User {

    private String userDetails="User is doing great job, and hope he will promote very soon";
    public String getAboutUser(){
        return userDetails;
    }


    public final String updateUserDetails(String updateDetails){
        this.userDetails=updateDetails;
        return userDetails;
    }
}
