package com.flab.sns.user.domain;

import java.util.Date;

public abstract class AccountState <T extends  AccountState>{

    protected String Id;
    protected String password;
    protected String firstName;
    protected String lastName;
    protected String phone;
    protected String email;
    protected Date birth;
    protected Gender gender;
    protected String location;


    protected T buildAccount(String Id, String password, String firstName, String lastName, String phone, String email, Date birth, Gender gender, String location) {
        this.Id = Id;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.birth = birth;
        this.gender = gender;
        this.location = location;
        return  (T)this;
    }

    public static enum Gender{
        Male,
        Female
    }

}
