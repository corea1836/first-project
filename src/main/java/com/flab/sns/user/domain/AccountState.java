package com.flab.sns.user.domain;

import java.util.Date;
// <T extends  AccountState>
public abstract class AccountState{

    protected final String Id;
    protected final String password;
    protected final String firstName;
    protected final String lastName;
    protected final String phone;
    protected final String email;
    protected final Date birth;
    protected final Gender gender;
    protected final String location;

    protected AccountState(String id, String password, String firstName, String lastName, String phone, String email, Date birth, Gender gender, String location) {
        this.Id = id;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.birth = birth;
        this.gender = gender;
        this.location = location;
    }


    public static enum Gender{
        Male,
        Female
    }

    public String getId() { return Id; }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public Date getBirth() {
        return birth;
    }

    public Gender getGender() {
        return gender;
    }

    public String getLocation() {
        return location;
    }

    //    protected T buildAccount(String Id, String password, String firstName, String lastName, String phone, String email, Date birth, Gender gender, String location) {
//        this.Id = Id;
//        this.password = password;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.phone = phone;
//        this.email = email;
//        this.birth = birth;
//        this.gender = gender;
//        this.location = location;
//        return  (T)this;
//    }

}
