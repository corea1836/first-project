package com.flab.sns.user.domain;

import java.util.Date;
import java.util.Optional;
//도메인 로직은 도메인 엔티티의 상태를 바꾸는 행위


public class Account extends AccountState{

    private Account() {
    }
    //    public boolean updateUserInfo(String firstName,
//                                  String  phone,
//                                  String email,
//                                  String location) {
//        return false;
//    }
//
//    public boolean updatePassword(String newPassword) {
//        return false;
//    }

//    public Optional<String> getId() {
//        return Optional.ofNullable(this.Id);
//    }
//
//
//    public Optional<String> getPassword() {
//        return Optional.ofNullable(this.password);
//    }
    public String getId() {
        return Id;
    }

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

    public static Account buildNewAccount(String Id,
                              String password,
                              String firstName,
                              String lastName,
                              String phone,
                              String email,
                              Date birth,
                              Gender gender,
                              String location) {
        AccountState<Account> account = new Account().buildAccount(Id, password, firstName, lastName, phone, email, birth, gender, location);
        return (Account) account;
    }

//    public Account buildSignInInfo(String Id, String password) {
//        buildAccount(Id, password, null, null, null, null, null, null, null);
//        return (Account) this;
//    }


}
